package org.otavio.cadastrodeninjas.Missoes.Dto;


import lombok.*;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MissionsDTO {

    private Long id;
    private String name;
    private String difficulty;
    private List<NinjaModel> ninjasEmMissao;


}
