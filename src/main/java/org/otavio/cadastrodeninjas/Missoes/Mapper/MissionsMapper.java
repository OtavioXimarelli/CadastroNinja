package org.otavio.cadastrodeninjas.Missoes.Mapper;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.Getter;
import lombok.Setter;
import org.otavio.cadastrodeninjas.Missoes.Dto.MissionsDTO;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.springframework.stereotype.Component;

@Hidden
@Getter
@Setter
@Component
public class MissionsMapper {

    public MissionsModel map(MissionsDTO missionsDTO) {
        MissionsModel missionsModel = new MissionsModel();

        missionsModel.setId(missionsDTO.getId());
        missionsModel.setDifficulty(missionsDTO.getDifficulty());
        missionsModel.setName(missionsDTO.getName());
        missionsModel.setNinjas(missionsDTO.getNinjasEmMissao());

        return missionsModel;
    }

    public MissionsDTO map(MissionsModel missionsModel) {
        MissionsDTO missionsDTO = new MissionsDTO();


        missionsDTO.setId(missionsModel.getId());
        missionsDTO.setDifficulty(missionsModel.getDifficulty());
        missionsDTO.setName(missionsModel.getName());
        missionsDTO.setNinjasEmMissao(missionsModel.getNinjas());
        return missionsDTO;
    }
}
