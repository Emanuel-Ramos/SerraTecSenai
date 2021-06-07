package org.serratec.resources;
import java.util.Optional;

import org.serratec.models.Produto;
import org.serratec.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produto/todos")
	public Iterable<Produto> getTodos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/por-id/{id}")
	public Produto getPorID(@PathVariable Long id) {
		return produtoRepository.findById(id).orElseThrow(
			() -> new ResponseStatusException(HttpStatus.NOT_FOUND)
		);
//		return produtoRepository.findById(id).get();
		
	}
	
	@GetMapping("/produto/por-codigo/{codigo}")
	public Optional<Produto> getPorCodigo(@PathVariable String codigo) {
		return produtoRepository.findByCodigo(codigo);
				
	}
	
	@PostMapping("/produto")
	public void postProduto(@RequestBody Produto novo) {
		produtoRepository.save(novo);
	}
	
	

   }
		
		

