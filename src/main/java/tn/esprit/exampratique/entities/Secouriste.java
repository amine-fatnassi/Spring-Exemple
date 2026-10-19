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
public class Secouriste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   public Long idSecouriste;
    public String firstName;
    public String lastName;
    public String grade;
    @ManyToOne
    public StationSecours stationSecours;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "secouriste")
    public Set<Intervention> interventions;
}
