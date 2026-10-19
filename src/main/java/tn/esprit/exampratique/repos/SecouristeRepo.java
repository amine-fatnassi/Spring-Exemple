package tn.esprit.exampratique.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exampratique.entities.Secouriste;

@Repository
public interface SecouristeRepo extends JpaRepository<Secouriste,Integer> {

}
