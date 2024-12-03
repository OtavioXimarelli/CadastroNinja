package org.otavio.cadastrodeninjas.Missoes.Repository;

import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MissionsRepository extends JpaRepository<MissionsModel, Long> {
    Long id(Long id);
}
