package org.otavio.cadastrodeninjas.Ninjas.Controller;


import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.ciarNinja(ninja);
    }

    @GetMapping("/show")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/show/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
    }

    @PutMapping("/updateID")
    public String alterarByID() {
        return "Alterar ninja";
    }


    @DeleteMapping("/delete/{id}")
    public void deleteNinjaByID (@PathVariable Long id){
        ninjaService.deletarNinja(id);
    }
}
