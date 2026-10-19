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
public class StationSecours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idStation;
    public String stationName;
    public String location;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "stationSecours")
    public Set<Secouriste> secouristes;
}
