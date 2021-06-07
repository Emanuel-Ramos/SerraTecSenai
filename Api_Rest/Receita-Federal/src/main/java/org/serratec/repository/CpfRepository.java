package org.serratec.repository;
import javax.transaction.Transactional;

import org.serratec.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CpfRepository extends JpaRepository<Pessoa, Long> {
	Iterable<Pessoa> findAllByNomeContainingIgnoreCase(String nome);
	Iterable<Pessoa> findAllByCpfContainingIgnoreCase(String Cpf);
	@Transactional
	void deleteByCpf(String cpf);

}
