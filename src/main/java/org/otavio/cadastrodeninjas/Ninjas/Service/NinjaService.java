package org.otavio.cadastrodeninjas.Ninjas.Service;

import org.hibernate.exception.DataException;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.otavio.cadastrodeninjas.Ninjas.Repository.NinjaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.util.List;
import java.util.Optional;


@Service
public class NinjaService {


    private final NinjaRepository ninjaRepository;
    private final HandlerExceptionResolver handlerExceptionResolver;

    public NinjaService(NinjaRepository ninjaRepository, HandlerExceptionResolver handlerExceptionResolver) {
        this.ninjaRepository = ninjaRepository;
        this.handlerExceptionResolver = handlerExceptionResolver;
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

    //update ninjas
    public NinjaModel atualizarNinja(Long id, NinjaModel ninja) {
        if (ninjaRepository.existsById(id)) {
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        }
        return null;
    }


}


