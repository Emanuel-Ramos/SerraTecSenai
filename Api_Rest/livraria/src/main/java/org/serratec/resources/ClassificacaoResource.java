package org.serratec.resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.serratec.dto.ClassificacaoDTO;
import org.serratec.exceptions.LivroException;
import org.serratec.models.Classificacao;
import org.serratec.models.Livro;
import org.serratec.repository.ClassificacaoRepository;
import org.serratec.repository.LeitorRepository;
import org.serratec.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassificacaoResource {
	
	@Autowired
	LeitorRepository leitorRepository;
	
	@Autowired
	LivroRepository livroRepository;
	
	@Autowired
	ClassificacaoRepository classificacaoRepository;
	
	
	@GetMapping("/classificacao/todos")
	public ResponseEntity<?> getTodos() {
		List<Classificacao> todos = classificacaoRepository.findAll();	
		
		return new ResponseEntity<>(todos, HttpStatus.OK);
	}
	
	@PostMapping("/classificacao")
	public ResponseEntity<?> post(@Validated @RequestBody ClassificacaoDTO dto, @RequestHeader("segredo") String segredo) {
		if (!"1234".equals(segredo)) {
			return new ResponseEntity<>("O segredo ta errado", HttpStatus.UNAUTHORIZED);
		}
		
		try {
			Classificacao classificacao = dto.toClassificacao(leitorRepository, livroRepository);
					
			classificacaoRepository.save(classificacao);		
						
			return new ResponseEntity<>("Cadastrado com sucesso", HttpStatus.OK);
		} catch (LivroException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}		
	}

}
