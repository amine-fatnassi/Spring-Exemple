package tn.esprit.exampratique.controllers;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exampratique.entities.Intervention;
import tn.esprit.exampratique.entities.InterventionType;
import tn.esprit.exampratique.services.InterventionService;

import java.util.List;

@RestController
@AllArgsConstructor
public class InterventionController {
    public InterventionService interventionService;
    @PostMapping("/add-Intervention")
    public Intervention addIntervention(@RequestBody Intervention intervention) {
        if (intervention.getType().equals("RESCUE") || intervention.getType().equals("FIRE")) {
            return interventionService.addIntervention(intervention);
        }
        else
        {
            intervention.setCost(0);
            return  interventionService.addIntervention(intervention);
        }
    }

    @GetMapping("/afficher-Par-Type")
    public List<Intervention> afficherParType(@RequestParam InterventionType type) {
        return interventionService.getInterventionsByType(type);
    }
    @Scheduled(fixedRate = 30000)
    @PutMapping("/Update-Fire-Cost")
    public void updateFireIntervention() {
        List<Intervention> interventions=interventionService.FireInterventionget();
        for (Intervention intervention : interventions) {
            Integer cost = intervention.getCost();
            intervention.setCost(cost*2);
            interventionService.addIntervention(intervention);
        }
    }

    @PutMapping("/Calculate-Inter-Fire")
    public Long countFireInterventions()
    {
        Integer cost = 0;
        List<Intervention> interventions=interventionService.FireInterventionget();
        for (Intervention intervention : interventions) {
             Integer cost2 = intervention.getCost();
            cost = cost + cost2;
        }
        return cost;
    }


}
