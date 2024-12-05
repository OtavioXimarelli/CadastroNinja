package org.otavio.cadastrodeninjas.Ninjas.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {
    private Long id;
    private String name;
    private String email;
    private int idade;
    private String rank;
    private MissionsModel missions;


}
