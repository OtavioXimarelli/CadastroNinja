package org.otavio.cadastrodeninjas.Missoes.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/missions")
public class MissionsController {

    @GetMapping("/missionshome")
    public String holder() {
        return "Testing Route";
    }

}
