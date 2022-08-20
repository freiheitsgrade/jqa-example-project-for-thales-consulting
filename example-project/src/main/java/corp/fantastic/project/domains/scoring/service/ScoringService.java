package corp.fantastic.project.domains.scoring.service;

import corp.fantastic.project.domains.scoring.model.RiscScore;

public interface ScoringService {
    RiscScore getScoringForPerson(String name);
}
