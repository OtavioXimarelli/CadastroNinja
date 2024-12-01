package org.otavio.cadastrodeninjas.Missoes.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_missions")
public class MissionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "difficulty")
    private String difficulty;

    @JsonIgnore
    @OneToMany(mappedBy = "missions")
    @ToString.Exclude
    private List<NinjaModel> ninjas;

}
