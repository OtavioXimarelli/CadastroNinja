package org.otavio.cadastrodeninjas.Missoes.Controller;


import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.otavio.cadastrodeninjas.Missoes.Service.MissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/missions")
public class MissionsController {
    private final MissionService missionService;


    public MissionsController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping("/create")
    public MissionsModel criarMissoes(@RequestBody MissionsModel misson) {
        return missionService.criarMissao(misson);
    }

    @GetMapping("/show")
    public List<MissionsModel> listarTodasMissoes() {
        return missionService.listarMissoes();
    }

    @GetMapping("/show/{id}")
    public MissionsModel listarMissoesPorId(@PathVariable Long id) {
        return missionService.listarMissoesPorID(id);
    }

    @PutMapping("/alterar/{id}")
    public MissionsModel alteraMissao(@PathVariable Long id, @RequestBody MissionsModel mission) {
        return missionService.updateMissions(id, mission);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMission (@PathVariable Long id) {
         missionService.deleteMissionsByID(id);
    }


}
