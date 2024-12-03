package org.otavio.cadastrodeninjas.Ninjas.Service;

import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.otavio.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {


    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }


    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

    public NinjaModel ciarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id);
    }


}


