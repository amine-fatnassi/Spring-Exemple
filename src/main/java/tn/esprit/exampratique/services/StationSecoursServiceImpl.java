package tn.esprit.exampratique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exampratique.entities.StationSecours;
import tn.esprit.exampratique.repos.StationSecoursRepo;

@Service
public class StationSecoursServiceImpl implements StationSecoursService {
    @Autowired
    StationSecoursRepo stationSecoursRepo;
    @Override
    public StationSecours addStation(StationSecours stationSecours) {
        return stationSecoursRepo.save(stationSecours);
    }
    public StationSecours findStationSecoursByName(String stationName)
    {
        return stationSecoursRepo.findByStationName(stationName);
    }
}
