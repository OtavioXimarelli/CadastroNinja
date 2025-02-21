package org.otavio.cadastrodeninjas.Ninjas.Repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Hidden
@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
    Long id(Long id);
}
