package shopify.rule;

/**
 * Created by usmani on 2017-09-07.
 */
public class ValidationRule {
    NameRule name;
    RequiredRule email;
    AgeRule age;
    NewsLetterRule newsletter;

    public NameRule getName() {
        return name;
    }

    public void setName(NameRule name) {
        this.name = name;
    }

    public RequiredRule getEmail() {
        return email;
    }

    public void setEmail(RequiredRule email) {
        this.email = email;
    }

    public AgeRule getAge() {
        return age;
    }

    public void setAge(AgeRule age) {
        this.age = age;
    }

    public NewsLetterRule getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(NewsLetterRule newsletter) {
        this.newsletter = newsletter;
    }

    public RequiredRule getRuleType() {
        if (name != null) {
            return name;
        } else if(email != null) {
            return email;
        } else if(age != null) {
            return age;
        } else if (newsletter != null) {
            return newsletter;
        }
        return null;
    }
}
