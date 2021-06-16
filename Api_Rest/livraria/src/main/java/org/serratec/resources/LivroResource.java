package org.serratec.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.serratec.dto.ClassificacaoDTO;
import org.serratec.dto.LivroCadastroDTO;
import org.serratec.exceptions.LivroException;
import org.serratec.models.Classificacao;
import org.serratec.models.Livro;
import org.serratec.repository.AutorRepository;
import org.serratec.repository.ClassificacaoRepository;
import org.serratec.repository.EditoraRepository;
import org.serratec.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroResource {
	
	@Autowired
	LivroRepository repository;	
	
	@Autowired
	ClassificacaoRepository classificacaoRepository;	
	
	@Autowired
	AutorRepository autorRepository;
	
	@Autowired
	EditoraRepository editoraRepository;
	
	@GetMapping("/livro/todos")
	public ResponseEntity<?> getTodos() {	
		List<Livro> todos = repository.findAll();
		
		return new ResponseEntity<>(todos, HttpStatus.OK);
	}
	
	@GetMapping("/classificacao/{codigo}")
    public ResponseEntity<?> getClassificacaoPorCodigo(@PathVariable String codigo){

        Optional<Livro> optional = repository.findByCodigo(codigo);

        if(optional.isEmpty()) {
            return new ResponseEntity<> ("Livro Inexistente", HttpStatus.NOT_FOUND);

        } else {

            List<Classificacao> pesquisa = classificacaoRepository.findAllByLivro(optional);

            return new ResponseEntity<> (pesquisa, HttpStatus.OK);
        }
    }

	@GetMapping("/livro/detalhe/{codigo}")
	public ResponseEntity<?> getDetalhe(@PathVariable String codigo) {
		
		Optional<Livro> optional = repository.findByCodigo(codigo);
		
		if (optional.isEmpty())
			return new ResponseEntity<>("Livro inexistente", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(optional, HttpStatus.OK);
	}
	
	@PostMapping("/livro")
	public ResponseEntity<?> post(@Validated @RequestBody LivroCadastroDTO dto) {
		
		try {
			Livro livro = dto.toLivro(autorRepository, editoraRepository, classificacaoRepository);
					
			repository.save(livro);		
						
			return new ResponseEntity<>("Cadastrado com sucesso", HttpStatus.OK);
		} catch (LivroException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}		
	}
	
}
