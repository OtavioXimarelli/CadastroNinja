package org.otavio.cadastrodeninjas.Ninjas.Service;

import org.otavio.cadastrodeninjas.Ninjas.Dto.NinjaDTO;
import org.otavio.cadastrodeninjas.Ninjas.Mapper.NinjaMapper;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.otavio.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class NinjaService {


    private final NinjaRepository ninjaRepository;
    private final NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map).collect(Collectors.toList());
    }


    public NinjaDTO listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }


    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    //update ninjas
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExists = ninjaRepository.findById(id);
        if (ninjaExists.isPresent()) {
            NinjaModel ninjaUpdated = ninjaMapper.map(ninjaDTO);
            ninjaUpdated.setId(id);
            NinjaModel ninjaSaved = ninjaRepository.save(ninjaUpdated);
            return ninjaMapper.map(ninjaSaved);
        }
        return null;

    }


}


