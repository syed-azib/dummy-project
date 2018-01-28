package shopify.rule;

import shopify.Customer;

/**
 * Created by usmani on 2017-09-07.
 */
public class AgeRule extends RequiredRule{
    private String type;
    private String field = "age";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getField() {
        return field;
    }

    @Override
    public boolean isInvalid(Customer customer) {
        if (required) {
            if (type.equals("number")) {
                try {
                    new Integer( customer.getAge());
                } catch (Exception e) {
                    return true;
                }
            }
        }
        return false;
    }
}
