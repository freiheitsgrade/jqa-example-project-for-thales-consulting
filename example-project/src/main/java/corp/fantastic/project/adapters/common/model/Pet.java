package corp.fantastic.project.adapters.common.model;

public class Pet {
    private Integer id;
    private String name;

    public Pet(Pet updatedPet) {
        this.id = updatedPet.id;
        this.name =updatedPet.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
