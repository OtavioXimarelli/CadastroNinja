package org.otavio.cadastrodeninjas.Ninjas.Service;

import org.otavio.cadastrodeninjas.Ninjas.Dto.NinjaDTO;
import org.otavio.cadastrodeninjas.Ninjas.Mapper.NinjaMapper;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.otavio.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {


    private final  NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }


    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

    public NinjaDTO ciarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
         ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }


    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    //update ninjas
    public NinjaModel atualizarNinja(Long id, NinjaModel ninja) {
        if (ninjaRepository.existsById(id)) {
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        }
        return null;
    }


}


