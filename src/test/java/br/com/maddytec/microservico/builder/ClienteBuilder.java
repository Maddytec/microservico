package br.com.maddytec.microservico.builder;

import java.time.LocalDate;

import br.com.maddytec.microservico.domain.Cliente;

public class ClienteBuilder {

	private Cliente cliente;
	
	public static ClienteBuilder build() {
	return new ClienteBuilder();
	}

	public Cliente get() {
		return this.cliente; 
	}
	
	public ClienteBuilder ComCliente() {
		this.cliente = Cliente.builder()
				.id(1L)
				.nome("Mario")
				.cpf("32321710012")
				.dataNascimento(LocalDate.now().minusYears(25l))
				.email("maddytec@gmail.com")
				.foneFixo("71 3300-0000")
				.foneMovel("71 9999-9999")
				.build();
		return this;
	}
	
}
