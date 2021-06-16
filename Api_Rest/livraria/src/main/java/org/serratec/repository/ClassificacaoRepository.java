package org.serratec.repository;

import java.util.List;
import java.util.Optional;

import org.serratec.models.Classificacao;
import org.serratec.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificacaoRepository extends JpaRepository<Classificacao, Long> {

	Optional<Classificacao> findByCodigo(String codigo);

	List<Classificacao> findAllByLivro(Optional<Livro> optional);

}
