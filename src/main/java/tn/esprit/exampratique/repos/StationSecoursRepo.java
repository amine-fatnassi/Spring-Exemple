package tn.esprit.exampratique.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exampratique.entities.StationSecours;

@Repository
public interface StationSecoursRepo extends JpaRepository<StationSecours,Integer> {
    StationSecours findByStationName(String stationName);
}
