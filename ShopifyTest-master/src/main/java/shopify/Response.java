package shopify;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by usmani on 2017-09-09.
 */
public class Response {

    List<InvalidCustomer> invalid_customers = new ArrayList<InvalidCustomer>();

    public List<InvalidCustomer> getInvalid_customers() {
        return invalid_customers;
    }

    public void setInvalid_customers(List<InvalidCustomer> invalid_customers) {
        this.invalid_customers = invalid_customers;
    }


}
