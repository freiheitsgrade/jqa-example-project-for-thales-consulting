package corp.fantastic.project.domains.customer.model;

import corp.fantastic.project.domains.scoring.model.RiscScore;
import corp.fantastic.project.domains.scoring.model.AlternativeRiscScore;
import java.util.UUID;

public class Customer {
    private String name;
    private RiscScore riscScore;
    private AlternativeRiscScore riscScore2;
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
    public AlternativeRiscScore getRiscScore2() {
        return riscScore2;
    }

    public void setRiscScore2(AlternativeRiscScore riscScore) {
        this.riscScore2 = riscScore;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
