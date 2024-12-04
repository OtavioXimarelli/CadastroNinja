package org.otavio.cadastrodeninjas.Ninjas.Controller;


import org.otavio.cadastrodeninjas.Ninjas.Dto.NinjaDTO;
import org.otavio.cadastrodeninjas.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/ninjas")
public class NinjaController {

    private final NinjaService  ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping("/create")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/show")
    public List<NinjaDTO> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/show/{id}")
    public NinjaDTO listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    @PutMapping("/alterar/{id}")
    public NinjaDTO updateNinjaByID(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ninjaService.atualizarNinja(id, ninja);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteNinjaByID (@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
