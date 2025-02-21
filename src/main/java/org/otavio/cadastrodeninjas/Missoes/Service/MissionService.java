package org.otavio.cadastrodeninjas.Missoes.Service;


import org.otavio.cadastrodeninjas.Missoes.Dto.MissionsDTO;
import org.otavio.cadastrodeninjas.Missoes.Mapper.MissionsMapper;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.otavio.cadastrodeninjas.Missoes.Repository.MissionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissionService {
    private final MissionsRepository missionsRepository;
    private final MissionsMapper missionsMapper;


    public MissionService(MissionsRepository missionsRepository, MissionsMapper missionsMapper) {
        this.missionsRepository = missionsRepository;
        this.missionsMapper = missionsMapper;
    }



    public List<MissionsDTO> listarMissoes() {
      List<MissionsModel> missions = missionsRepository.findAll();
      return missions.stream()
              .map(missionsMapper::map).toList();
    }

    public MissionsDTO listarMissoesPorID(Long id) {
        Optional<MissionsModel> missionsByID = missionsRepository.findById(id);
      return missionsByID.map(missionsMapper::map).orElse(null);
    }

    public MissionsDTO criarMissao(MissionsDTO missionDTO) {

        MissionsModel missions = missionsMapper.map(missionDTO);
        missions = missionsRepository.save(missions);
        return missionsMapper.map(missions);
    }

    public void deleteMissionsByID(long id) {
        missionsRepository.deleteById(id);
    }

    public MissionsDTO updateMissions(Long id, MissionsDTO missionDTO) {
        Optional<MissionsModel> missionsExists = missionsRepository.findById(id);
        if (missionsExists.isPresent()) {
            MissionsModel missionsUpdated = missionsMapper.map(missionDTO);
            missionsUpdated.setId(id);
            MissionsModel missionsSaved = missionsRepository.save(missionsUpdated);
            return missionsMapper.map(missionsSaved);
        }
        return null;
    }
}
