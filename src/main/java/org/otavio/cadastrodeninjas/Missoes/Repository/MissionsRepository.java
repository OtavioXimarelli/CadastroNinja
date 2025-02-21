package org.otavio.cadastrodeninjas.Missoes.Repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Hidden

public interface MissionsRepository extends JpaRepository<MissionsModel, Long> {
    Long id(Long id);
}
