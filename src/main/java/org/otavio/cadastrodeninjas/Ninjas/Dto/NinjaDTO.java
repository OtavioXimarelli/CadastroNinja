package org.otavio.cadastrodeninjas.Ninjas.Dto;

import lombok.*;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;


@Data
@Getter
@Setter
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
