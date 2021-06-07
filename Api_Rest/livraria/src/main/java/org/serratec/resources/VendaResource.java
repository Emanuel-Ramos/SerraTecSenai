package org.serratec.resources;

import java.util.List;
import java.util.Optional;

import org.serratec.dto.VendaCompletaDTO;
import org.serratec.models.Venda;
import org.serratec.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendaResource {

	@Autowired
	VendaRepository vendaRepository;
	
	@PostMapping("/venda")
	public ResponseEntity<?> postVenda(@RequestBody Venda novo){
		
		vendaRepository.save(novo);
		
		return new ResponseEntity<>("Venda cadastrada!", HttpStatus.OK);		
	}
	
	@GetMapping("/venda/todos")
	public ResponseEntity<?> getTodos (){
		List<Venda> vendas = vendaRepository.findAll();
		
		return new ResponseEntity<>(vendas, HttpStatus.OK);		
	}
	
	@GetMapping("/venda/detalhada/{codigo}")
	public ResponseEntity<?> getDetalhada(@PathVariable String codigo){
		Optional<Venda> opcional = vendaRepository.findByCodigo(codigo);
		
		if (opcional.isEmpty())
			return new ResponseEntity<>("Venda não encontrada!", HttpStatus.NOT_FOUND);
					
		return new ResponseEntity<>(new VendaCompletaDTO(opcional.get()), HttpStatus.OK);
	}
	
}
