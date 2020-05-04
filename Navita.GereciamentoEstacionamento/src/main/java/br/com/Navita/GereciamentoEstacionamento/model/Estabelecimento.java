package br.com.Navita.GereciamentoEstacionamento.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Estabelecimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int estabId;	
	
	@NotBlank(message = "O nome deve ser preenchido")
	private String nome;	
	
	@NotBlank(message = "O cnpj deve ser preenchido")
	private String cnpj;
	
	@NotBlank(message = "O endereço deve ser preenchido")
	private String endereco;	
	
	@NotBlank(message = "O telefone deve ser preenchido")
	private String telefone;	
	
	@NotBlank(message = "A quantidade de vagas para motos deve ser preenchida")
    private int qtVagaMoto;	
	
	@NotBlank(message = "A quantidade de vagas para carros deve ser preenchida")
    private int qtVagaCarro;
    
    

	public Estabelecimento() { }

	

	public Estabelecimento(int estabId, @NotBlank(message = "O nome deve ser preenchido") String nome,
			@NotBlank(message = "O cnpj deve ser preenchido") String cnpj,
			@NotBlank(message = "O endereço deve ser preenchido") String endereco,
			@NotBlank(message = "O telefone deve ser preenchido") String telefone,
			@NotBlank(message = "A quantidade de vagas para motos deve ser preenchida") int qtVagaMoto,
			@NotBlank(message = "A quantidade de vagas para carros deve ser preenchida") int qtVagaCarro) {
		super();
		this.estabId = estabId;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.qtVagaMoto = qtVagaMoto;
		this.qtVagaCarro = qtVagaCarro;
	}



	public int getEstabId() {
		return estabId;
	}

	public void setEstabId(int estabId) {
		this.estabId = estabId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQtVagaMoto() {
		return qtVagaMoto;
	}

	public void setQtVagaMoto(int qtVagaMoto) {
		this.qtVagaMoto = qtVagaMoto;
	}

	public int getQtVagaCarro() {
		return qtVagaCarro;
	}

	public void setQtVagaCarro(int qtVagaCarro) {
		this.qtVagaCarro = qtVagaCarro;
	}    
    
}