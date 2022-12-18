package corp.fantastic.project.adapters.rest.controllers.input;

public class Ressource {
    public Ressource(Ressource input) {
    }

    private String lastname;

    private int age;

    private String firstname;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
