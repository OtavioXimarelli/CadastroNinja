package org.otavio.cadastrodeninjas.Missoes;


import jakarta.persistence.*;
import lombok.*;
import org.otavio.cadastrodeninjas.Ninjas.NinjaModel;

import java.util.List;

@Getter
@Setter
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
    @Column(name = "nome")
    private String name;
    @Column(name = "dificuldade")
    private int difficulty;

    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;
}
