package tn.esprit.exampratique.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.exampratique.entities.Intervention;
import tn.esprit.exampratique.entities.InterventionType;

import java.util.List;

@Repository
public interface InterventionRepo extends JpaRepository<Intervention,Integer> {
    @Query("select i from Intervention i where i.type = :type order by i.dateIntervention")
    public List<Intervention> getInterventionsByType(@Param("type")InterventionType type);
    @Query("select i from Intervention i where i.type = tn.esprit.exampratique.entities.InterventionType.FIRE")
    public List<Intervention> FireInterventionget();


}
