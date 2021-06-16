package org.serratec.models.repository;

import java.util.Optional;

import org.serratec.models.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository extends JpaRepository<Cep, Long> {

	boolean existsByNumero(String numero);
	
	Optional<Cep> findByNumero(String numero);
}
