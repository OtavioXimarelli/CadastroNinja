package org.otavio.cadastrodeninjas.Ninjas.Controller;


import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.otavio.cadastrodeninjas.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }

    @PostMapping("/create")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/show")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping("/showByID")
    public Optional<NinjaModel> findNinjasByID() {
        return ninjaService.findNinjaByID(Long id);
    }

    @PutMapping("/updateID")
    public String alterarByID() {
        return "Alterar ninja";
    }


    @DeleteMapping("/deleteID")
    public String deleteID() {
        return "Deletar ninja por id";
    }
}
