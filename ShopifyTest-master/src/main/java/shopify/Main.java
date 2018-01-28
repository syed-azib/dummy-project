package shopify;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import shopify.rule.RequiredRule;
import shopify.rule.ValidationRule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by usmani on 2017-09-07.
 */
public class Main {

    public Request makeConnection(String url) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();

        HttpGet request = new HttpGet(url);

        HttpResponse response = client.execute(request);

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        String line = "";
        StringBuffer result = new StringBuffer();
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        Request responseReq = new ObjectMapper().readValue(result.toString(), Request.class);
        mapAndValidateData(responseReq);
        result.setLength(0);
        return responseReq;
    }

    public void mapAndValidateData(Request request) throws IOException {
        Response response = new Response();

        for (Customer customer : request.customers) {
            InvalidCustomer invalidCustomer = new InvalidCustomer();
            for (ValidationRule validationRule : request.getValidations()) {
                RequiredRule requiredRule = validationRule.getRuleType();
                if (requiredRule.isInvalid(customer)) {
                    invalidCustomer.setId(Integer.parseInt(customer.getId()));
                    //invalidCustomer.invalidFields.add(requiredRule.getClass().toString());
                    invalidCustomer.invalidFields.add(requiredRule.getField());
                }
            }

            if (invalidCustomer.invalidFields.size() > 0)
                response.invalid_customers.add(invalidCustomer);
        }
        ObjectMapper mapper = new ObjectMapper();
        String x = mapper.writeValueAsString(response);
        System.out.println(x);
    }


    public static void main(String[] args) throws IOException {
        String url = "https://backend-challenge-winter-2017.herokuapp.com/customers.json";
        Main main = new Main();
        Request request = main.makeConnection(url);

        int totalLoops = request.pagination.getTotal() / request.pagination.getPer_page() + request.pagination.getTotal() % request.pagination.getPer_page() - 1;

        for (int i = 0; i < totalLoops; i++) {
            String newURL = url + "?page=" + (i + 2);
            main.makeConnection(newURL);
        }

    }
}