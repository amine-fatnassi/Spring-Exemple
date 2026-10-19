package tn.esprit.exampratique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exampratique.entities.Intervention;
import tn.esprit.exampratique.entities.InterventionType;
import tn.esprit.exampratique.repos.InterventionRepo;

import java.util.List;

@Service
public class InterventionServiceImpl implements InterventionService {
    @Autowired
    public InterventionRepo  interventionRepo;
    @Override
    public Intervention addIntervention(Intervention intervention) {
        return interventionRepo.save(intervention);
    }

    @Override
    public List<Intervention> getInterventionsByType(InterventionType type) {
        return interventionRepo.getInterventionsByType(type);
    }

    @Override
    public List<Intervention> FireInterventionget() {
        return interventionRepo.FireInterventionget();
    }
}
