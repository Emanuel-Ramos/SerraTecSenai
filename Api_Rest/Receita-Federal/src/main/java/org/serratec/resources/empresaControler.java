package org.serratec.resources;
import org.serratec.models.Empresa;
import org.serratec.repository.CnpjRepository;
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
@Api("Api de consulta de empresa")
public class empresaControler {
	
	@Autowired
	CnpjRepository cnpjRepository;
	
	@ApiOperation(value = "pesquisando todas as empresas")
    @GetMapping("/empresa/todas")
    public Iterable<Empresa> getGeral(){
        return cnpjRepository.findAll();
}	
    @ApiOperation(value = "pesquisando por nome")
    @GetMapping("/empresa/por-nome")
    public Iterable<Empresa> getTodosPorNome(@RequestParam String nome) {
        return cnpjRepository.findAllByNomeContainingIgnoreCase(nome);
    }
    
    @ApiOperation(value = "pesquisando por cnpj")
    @GetMapping("/empresa/por-cnpj")
    public Iterable<Empresa> getTodosPorCpf(@RequestParam String Cnpj) {
        return cnpjRepository.findAllByCnpjContainingIgnoreCase(Cnpj);
    }
    
    @ApiOperation(value = "adicionando empresa unica")
    @PostMapping("/empresa")
	public void postEmpresa(@RequestBody Empresa novo) {
    	cnpjRepository.save(novo);
	}
    
    @ApiOperation(value = "adicionando lista de empresas")
    @PostMapping("empresa/em-lote")
    public void postEmpresaEmLote(@RequestBody Iterable<Empresa> novos) {
    	cnpjRepository.saveAll(novos);
    }
    
    @ApiOperation(value = "Deletando pessoa pelo Cnpj ")
    @DeleteMapping("empresa/delete/{cnpj}")
    public void deleteEmpresa(@PathVariable String cnpj) {
    	cnpjRepository.deleteByCnpj(cnpj);
    }
}
