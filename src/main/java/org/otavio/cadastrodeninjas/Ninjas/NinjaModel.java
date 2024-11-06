package org.otavio.cadastrodeninjas.Ninjas;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.otavio.cadastrodeninjas.Missoes.MissionsModel;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_ninja_register")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)

    private String name;

    @Column(name = "email", nullable = false, unique = true)

    private String email;


    @Column(name = "age", nullable = false)

    private int idade;


    @ManyToOne
    @JoinColumn(name = "missions_id")
    private MissionsModel missions;


}

