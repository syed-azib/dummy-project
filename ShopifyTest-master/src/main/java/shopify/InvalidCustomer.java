package shopify;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usmani on 2017-09-09.
 */
public class InvalidCustomer {
    int id;
    List<String> invalidFields = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getInvalidFields() {
        return invalidFields;
    }


}
