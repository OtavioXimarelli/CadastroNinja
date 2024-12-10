package org.otavio.cadastrodeninjas.Missoes.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionsDTO {

    private Long id;
    private String name;
    private String difficulty;;
    private List<NinjaModel> ninjasEmMissao;


}
