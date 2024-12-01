package org.otavio.cadastrodeninjas.Ninjas.Repository;

import org.otavio.cadastrodeninjas.Ninjas.Models.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
    Long id(Long id);
}
