package tn.esprit.exampratique.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OperationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Long idCenter;
    public String area;
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Intervention> intervention;
}
