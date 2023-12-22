package br.com.muralis.core.dto.colaborador.geral;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CadastrarColaboradorCommand {

	@NotBlank(message = "Nome é obrigatório")
	private String nome;

	@Email(message = "E-mail inválido")
	private String email;

	private String sexo;

	private LocalDate nascimento;

	private String estadoCivil;

	private String paisNascimento;

	private String estadoNascimento;

	private String cidadeNascimento;

	private String nomeMae;

	@Pattern(regexp = "\\([0-9]{2}\\) [0-9]{4,5}-[0-9]{4}", message = "Telefone celular inválido. Ex (11) 99999-9999 ou (11) 9999-9999")
	private String telefoneCelular;

	@Pattern(regexp = "\\([0-9]{2}\\) [0-9]{4,5}-[0-9]{4}",
			message = "Telefone residencial inválido. Ex (11) 99999-9999 ou (11) 9999-9999")
	private String telefoneResidencial;

	private String nomePai;

	private String rg;

	private String orgaoExpedidor;

	private LocalDate dataExpedicao;

	@CPF(message = "CPF inválido")
	private String cpf;

	private String grauInstrucao;

	public String cep;

	public String estado;

	public String cidade;

	public String bairro;

	public String endereco;

	public Integer numeroResidencial;

	public String complemento;

}