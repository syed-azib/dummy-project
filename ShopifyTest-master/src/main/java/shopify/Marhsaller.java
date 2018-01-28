package shopify;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by usmani on 2017-09-07.
 */
public class Marhsaller {
    public static void main(String[] args) throws IOException {
        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("azib");

        ObjectMapper mapper = new ObjectMapper();
        String x = mapper.writeValueAsString(customer);

        System.out.println(x);
        Customer customer1 = mapper.readValue(x, Customer.class);

        System.out.println(customer1.getId());
        System.out.println(customer1.getName());


    }
}
