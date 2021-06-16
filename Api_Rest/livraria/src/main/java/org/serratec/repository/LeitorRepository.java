package org.serratec.repository;

import java.util.Optional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.serratec.models.Leitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeitorRepository extends JpaRepository<Leitor, Long> {

	Boolean existsByEmail(String email);


	Optional<Leitor> findByEmail(String email);

}
