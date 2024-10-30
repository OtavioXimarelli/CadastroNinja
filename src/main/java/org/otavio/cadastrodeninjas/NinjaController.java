package org.otavio.cadastrodeninjas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }

}
