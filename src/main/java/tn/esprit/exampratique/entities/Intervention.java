package tn.esprit.exampratique.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Intervention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idIntervention;
    public Date dateIntervention;
    @Enumerated(EnumType.STRING)
    public InterventionType type;
    public Integer cost;
    @ManyToOne
    public Secouriste secouriste;
}
