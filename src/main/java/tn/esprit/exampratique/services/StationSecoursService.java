package tn.esprit.exampratique.services;

import tn.esprit.exampratique.entities.StationSecours;

public interface StationSecoursService {
    public StationSecours addStation(StationSecours stationSecours);
    StationSecours findStationSecoursByName(String stationName);
}
