package corp.fantastic.project.domains.scoring.service.implementation;

import corp.fantastic.project.domains.scoring.model.RiscScore;
import corp.fantastic.project.domains.scoring.service.ScoringService;
import org.springframework.stereotype.Service;

@Service
public class ScoringServiceImplementation
    implements ScoringService {
    @Override
    public RiscScore getScoringForPerson(String name) {
        return RiscScore.UNKNOWN;
    }
}
