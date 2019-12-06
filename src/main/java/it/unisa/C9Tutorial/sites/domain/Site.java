package it.unisa.C9Tutorial.sites.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Site implements Serializable {
    private final static long serialVersionUID = 42L;

    public static final String TYPE_MIXED = "mixed";
    public static final String TYPE_NATURAL = "natural";
    public static final String TYPE_CULTURAL = "cultural";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private LocalDate date;

    @NonNull
    private String type;

    @NonNull
    private String region;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Responsible> responsibles = new HashSet<>();

    public void addResponsible(Responsible responsible){
        this.responsibles.add(responsible);
    }

}
