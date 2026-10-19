package tn.esprit.exampratique.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.exampratique.entities.StationSecours;
import tn.esprit.exampratique.services.StationSecoursService;

@AllArgsConstructor
@RestController
public class StationSecoursController {
    public StationSecoursService stationSecoursService;
    @PostMapping("/Add-Station")
    public StationSecours addStation(StationSecours stationSecours)
    {
        return stationSecoursService.addStation(stationSecours);
    }
}
