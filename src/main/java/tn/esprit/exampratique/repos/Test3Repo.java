package tn.esprit.exampratique.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exampratique.entities.OperationCenter;

@Repository
public interface Test3Repo extends JpaRepository<OperationCenter,Integer> {
}
