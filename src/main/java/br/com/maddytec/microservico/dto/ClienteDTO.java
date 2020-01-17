package br.com.maddytec.microservico.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@Email(message = "Email inválido.")
	private String email;
	
	@Past(message = "Data de nascimento inválida.")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	@CPF(message = "CPF inválido")
	private String cpf;
	
	@Builder.Default
	private List<EnderecoDTO> enderecos = new ArrayList<>();
	
}
