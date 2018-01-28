package shopify.rule;

import shopify.Customer;

/**
 * Created by usmani on 2017-09-07.
 */
public class NewsLetterRule extends RequiredRule {
    String type;
    private String field = "newsletter";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean isInvalid(Customer customer) {
        if (required) {
            if (customer.getNewsletter() == null) {
                return true;
            }
            try {
                Boolean x = ( Boolean)(customer.getNewsletter());
            } catch (Exception e) {
                return true;
            }
        }
        return false;
    }

    public String getField() {
        return field;
    }
}
