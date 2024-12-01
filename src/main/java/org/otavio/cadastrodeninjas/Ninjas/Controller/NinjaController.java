package org.otavio.cadastrodeninjas.Ninjas.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }

    @PostMapping("/create")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/show")
    public String mostarTodosOsNinjas() {
        return "Mostrar Ninja";
    }

    @GetMapping("/showByID")
    public String mostarTodosOsNinjasPorID() {
        return "Mostrar Ninja por id";
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
