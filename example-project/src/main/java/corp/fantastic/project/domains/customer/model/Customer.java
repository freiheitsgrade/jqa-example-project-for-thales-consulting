package corp.fantastic.project.domains.customer.model;

import corp.fantastic.project.domains.scoring.model.RiscScore;
import java.util.UUID;

public class Customer {
    private String name;
    private RiscScore riscScore;
    private UUID id;

    private CustomerStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RiscScore getRiscScore() {
        return riscScore;
    }

    public void setRiscScore(RiscScore riscScore) {
        this.riscScore = riscScore;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
