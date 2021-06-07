package org.serratec.resources;
import org.serratec.models.Pessoa;
import org.serratec.repository.CpfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api("Api de consulta de pessoa fisica")
public class pessoaControler {
	
	@Autowired
	CpfRepository cpfRepository;
	
	@ApiOperation(value = "pesquisando todas")
    @GetMapping("/pessoa/todos")
    public Iterable<Pessoa> getGeral(){
        return cpfRepository.findAll();
}	
    @ApiOperation(value = "pesquisando por nome")
    @GetMapping("/pessoa/por-nome")
    public Iterable<Pessoa> getTodosPorNome(@RequestParam String nome) {
        return cpfRepository.findAllByNomeContainingIgnoreCase(nome);
    }
    
    @ApiOperation(value = "pesquisando por cpf")
    @GetMapping("/pessoa/por-cpf")
    public Iterable<Pessoa> getTodosPorCpf(@RequestParam String Cpf) {
        return cpfRepository.findAllByCpfContainingIgnoreCase(Cpf);
    }
    
    @ApiOperation(value = "adicionando pessoa unica")
    @PostMapping("/pessoa")
	public void postPessoa(@RequestBody Pessoa novo) {
		cpfRepository.save(novo);
	}
    
    @ApiOperation(value = "adicionando lista de pessoas")
    @PostMapping("pessoa/em-lote")
    public void postPessoaEmLote(@RequestBody Iterable<Pessoa> novos) {
    	cpfRepository.saveAll(novos);
    }
    
    @ApiOperation(value = "Deletando pessoa pelo CPF ")
    @DeleteMapping("pessoa/delete/{cpf}")
    public void deletePessoa(@PathVariable String cpf) {
    	cpfRepository.deleteByCpf(cpf);
    }
    
}