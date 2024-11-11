package org.otavio.cadastrodeninjas.Missoes.Repository;

import org.otavio.cadastrodeninjas.Missoes.Models.MissionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MissionsRepository extends JpaRepository<MissionsModel, Long> {
}
