package tn.esprit.exampratique.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.exampratique.entities.Intervention;
import tn.esprit.exampratique.entities.InterventionType;

import java.util.List;

public interface InterventionService {
    public Intervention addIntervention(Intervention intervention);
    public List<Intervention> getInterventionsByType(@Param("type") InterventionType type);
    public List<Intervention> FireInterventionget();
}
