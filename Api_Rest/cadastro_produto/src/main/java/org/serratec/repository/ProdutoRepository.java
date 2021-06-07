package org.serratec.repository;

import java.util.Optional;

import org.serratec.models.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

	Optional<Produto> findFirstByCodigo(String codigo);
//    Optional<Produto> findFirstByCodigo(String codigo);
}