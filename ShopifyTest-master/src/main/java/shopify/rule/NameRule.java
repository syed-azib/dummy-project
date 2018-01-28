package shopify.rule;

import shopify.Customer;

/**
 * Created by usmani on 2017-09-07.
 */
public class NameRule extends RequiredRule{
    private String type;
    private LengthRule  length;
    private String field = "name";


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LengthRule getLength() {
        return length;
    }

    public void setLength(LengthRule length) {
        this.length = length;
    }

    public String getField() {
        return field;
    }

    @Override
    public boolean isInvalid(Customer customer) {
        return customer.getName() == null || customer.getName().isEmpty() ||
                customer.getName().length() < length.getMin() || !(customer.getName() instanceof String);
    }
}
