package shopify.rule;

import shopify.Customer;

/**
 * Created by usmani on 2017-09-07.
 */
public class RequiredRule {
    boolean required;
    private String field = "email";

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean isInvalid(Customer customer) {
        return customer.getEmail() == null || (customer.getEmail().isEmpty());
    }

    public String getField() {
        return field;
    }
}
