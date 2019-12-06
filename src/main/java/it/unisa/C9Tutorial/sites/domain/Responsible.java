package it.unisa.C9Tutorial.sites.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Responsible implements Serializable {
    private final static long serialVersionUID = 42L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Site controlledSite;

}
