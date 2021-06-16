package org.serratec.models.repository;

import java.util.Optional;

import org.serratec.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	Optional<Cidade> findByNome(String cidade);

}
