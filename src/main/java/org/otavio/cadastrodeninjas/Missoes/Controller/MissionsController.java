package org.otavio.cadastrodeninjas.Missoes.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/missions")
public class MissionsController {

    @PostMapping("/create")
    public String criarMissao() {
        return "missao criada";
    }

    @GetMapping("/list")
    public String listarMissoes() {
        return "Mostrando as missoes criadas";
    }

    @PutMapping("/update")
    public String alterarMissoesID() {
        return "Altera as missoes por ID" ;

    }

    @GetMapping("/showByID")
    public String mostarTodasMissoesPorID() {
        return "Mostrar Missoes por id";
    }

    @PutMapping("/updateID")
    public String alterarByID() {
        return "Alterar missao";
    }


    @DeleteMapping("/deleteID")
    public String deleteID() {
        return "Deletar missoes por id";
    }




}
