package org.serratec.models.repository;

import java.util.Optional;

import org.serratec.models.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BairroRepository extends JpaRepository<Bairro, Long> {

	Optional<Bairro> findByNome(String bairro);

}
