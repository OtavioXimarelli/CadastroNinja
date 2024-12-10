package org.otavio.cadastrodeninjas.Missoes.Controller;


import org.apache.coyote.Response;
import org.otavio.cadastrodeninjas.Missoes.Dto.MissionsDTO;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.otavio.cadastrodeninjas.Missoes.Service.MissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> criarMissoes(@RequestBody MissionsDTO missonDTO) {
        MissionsDTO missionDTO = missionService.criarMissao(missonDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Missão criada com sucesso " + missionDTO.getName() +
                "ID: " + missionDTO.getId());
    }

    @GetMapping("/show")
    public ResponseEntity<List<MissionsDTO>> listByID() {
        List<MissionsDTO> missions = missionService.listarMissoes();
        return ResponseEntity.ok(missions);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<?> listMissionByID(@PathVariable Long id) {
        MissionsDTO missionsDTO = missionService.listarMissoesPorID(id);

        if (missionsDTO != null) {
            return ResponseEntity.ok(missionsDTO);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A missão com o ID: " +
                id + " não foi encontrada nos registros, " +
                "tente novamente.");
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> updateMissionByID(@PathVariable Long id, @RequestBody MissionsDTO missionDTO) {
        MissionsDTO mission = missionService.updateMissions(id, missionDTO);
        if (mission != null) {
            return ResponseEntity.ok(mission);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("A missão com o id: " +
                id + " não foi encontrada nos registros, tente novamente ");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMissionByID(@PathVariable Long id) {
        if (missionService.listarMissoesPorID(id) != null) {
            missionService.deleteMissionsByID(id);
            return ResponseEntity.ok("Missão deletada com sucesso " + "ID: " + id);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi possivel deletar, ID: " + id +
                ", não foi encontrado nos registros, tente novamente.");

    }
}
