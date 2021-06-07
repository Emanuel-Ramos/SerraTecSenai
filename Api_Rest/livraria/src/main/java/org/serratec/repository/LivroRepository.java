package org.serratec.repository;

import java.util.Optional;

import org.serratec.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	Optional<Livro> findByCodigo(String codigo);

}
