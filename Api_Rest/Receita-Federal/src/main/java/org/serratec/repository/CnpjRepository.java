package org.serratec.repository;

import javax.transaction.Transactional;

import org.serratec.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CnpjRepository extends JpaRepository<Empresa, Long> {
	Iterable<Empresa> findAllByNomeContainingIgnoreCase(String nome);
	Iterable<Empresa> findAllByCnpjContainingIgnoreCase(String Cnpj);
	@Transactional
	void deleteByCnpj(String cnpj);

}