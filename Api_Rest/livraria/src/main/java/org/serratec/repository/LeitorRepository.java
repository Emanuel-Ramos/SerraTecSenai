package org.serratec.repository;

import org.serratec.models.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeitorRepository extends JpaRepository<Leitor, Long> {

	Boolean existsByEmail(String email);

}
