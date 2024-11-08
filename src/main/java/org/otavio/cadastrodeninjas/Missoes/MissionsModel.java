package org.otavio.cadastrodeninjas.Missoes;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import org.otavio.cadastrodeninjas.Ninjas.NinjaModel;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "tb_missions")
public class MissionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "difficulty")
    private String difficulty;

    @OneToMany(mappedBy = "missions")
    @ToString.Exclude
    private List<NinjaModel> ninjas;

}
