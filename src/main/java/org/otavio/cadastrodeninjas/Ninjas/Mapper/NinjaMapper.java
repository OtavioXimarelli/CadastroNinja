package org.otavio.cadastrodeninjas.Ninjas.Mapper;

import org.otavio.cadastrodeninjas.Ninjas.Dto.NinjaDTO;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.springframework.stereotype.Component;


@Component
public class NinjaMapper {
    public NinjaModel map(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = new NinjaModel();

        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissions(ninjaDTO.getMissions());


        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {

        NinjaDTO ninjaDTO = new NinjaDTO();


        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setName(ninjaModel.getName());
        ninjaDTO.setMissions(ninjaModel.getMissions());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setEmail(ninjaModel.getEmail());

        return ninjaDTO;
    }
}
