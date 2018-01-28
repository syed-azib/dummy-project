package shopify;

import shopify.rule.ValidationRule;

import java.util.List;

/**
 * Created by usmani on 2017-09-07.
 */
public class Request {
    List<Customer> customers;
    Pagination pagination;
    List<ValidationRule> validations;


    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<ValidationRule> getValidations() {
        return validations;
    }

    public void setValidations(List<ValidationRule> validations) {
        this.validations = validations;
    }

}
