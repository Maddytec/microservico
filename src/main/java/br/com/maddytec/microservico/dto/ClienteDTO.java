package br.com.maddytec.microservico.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {

	private Long id;
	private String nome;
	private String foneMovel;
	private String foneFixo;
	private String email;
	private LocalDate dataNascimento;
	private String cpf;
	
	@Builder.Default
	private List<EnderecoDTO> enderecos = new ArrayList<>();
	
}
