package corp.fantastic.project.services.customercreation.model.exception;

public class CustomerNotAcceptedException extends RuntimeException {
    private String name;
    public CustomerNotAcceptedException(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
