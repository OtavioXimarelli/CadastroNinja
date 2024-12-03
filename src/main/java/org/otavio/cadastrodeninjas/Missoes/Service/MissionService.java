package org.otavio.cadastrodeninjas.Missoes.Service;


import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.otavio.cadastrodeninjas.Missoes.Repository.MissionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {
    private final MissionsRepository missionsRepository;

    public MissionService(MissionsRepository missionsRepository) {
        this.missionsRepository = missionsRepository;
    }

    public List<MissionsModel> listarMissoes() {
        return missionsRepository.findAll();
    }

    public MissionsModel listarMissoesPorID(Long id) {
        Optional<MissionsModel> missionsByID = missionsRepository.findById(id);
        return missionsByID.orElse(null);
    }

    public MissionsModel criarMissao(MissionsModel mission) {
        return missionsRepository.save(mission);
    }

    public void deleteMissionsByID(long id) {
        missionsRepository.deleteById(id);
    }

    public MissionsModel updateMissions(Long id, MissionsModel mission) {
        if (missionsRepository.existsById(id)) {
            mission.setId(id);
            return missionsRepository.save(mission);
        }
        return null;
    }
}
