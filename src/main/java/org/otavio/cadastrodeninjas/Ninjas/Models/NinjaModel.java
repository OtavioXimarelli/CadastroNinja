package org.otavio.cadastrodeninjas.Ninjas.Models;


import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;
import lombok.*;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Hidden
@Table(name = "tb_ninja_register")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "rank", nullable = false)
    private String rank;

    @Column(name = "age", nullable = false)
    private int idade;


    @ManyToOne
    @JoinColumn(name = "missions_id")
    @ToString.Exclude  private MissionsModel missions;


}

