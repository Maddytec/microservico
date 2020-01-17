package br.com.maddytec.microservico.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.maddytec.microservico.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
		
	public Optional<Cliente> findByEmail(String email);
	
}
