package tn.esprit.exampratique.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exampratique.entities.Secouriste;
import tn.esprit.exampratique.entities.StationSecours;
import tn.esprit.exampratique.services.SecouristeService;
import tn.esprit.exampratique.services.StationSecoursService;

@AllArgsConstructor
@RestController
public class SecouristeController {
    public StationSecoursService stationSecoursService;
    public SecouristeService secouristeService;
@PostMapping("/add-and-affect-securite")
    public Secouriste addSecouristeAndAssignToStation(@RequestBody Secouriste secouriste, @RequestParam String stationName)
    {
        StationSecours s = stationSecoursService.findStationSecoursByName(stationName);
        secouriste.setStationSecours(s);
        return secouristeService.addSecouriste(secouriste);
    }
}
