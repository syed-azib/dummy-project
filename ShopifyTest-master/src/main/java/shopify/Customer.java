package shopify;

/**
 * Created by usmani on 2017-09-07.
 */
public class Customer {
    private String id;
    private String name;
    private String email;
    private String country;
    private Object newsletter;
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Object newsletter) {
        this.newsletter = newsletter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
