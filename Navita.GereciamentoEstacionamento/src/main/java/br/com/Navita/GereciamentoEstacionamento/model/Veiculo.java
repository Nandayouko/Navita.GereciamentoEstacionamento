package br.com.Navita.GereciamentoEstacionamento.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int veiculoId;
	
	@NotBlank
	private String marca;
	
	@NotBlank
	private String modelo;
	
	@NotBlank
	private String cor;
	
	@NotBlank
	private String placa;
	
	@NotBlank
	private String tipo;	
	
	public Veiculo(int veiculoId, @NotBlank String marca, @NotBlank String modelo, @NotBlank String cor,
			@NotBlank String placa, @NotBlank String tipo) {
		super();
		this.veiculoId = veiculoId;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.tipo = tipo;
	}
	
	public int getVeiculoId() {
		return veiculoId;
	}
	public void setVeiculoId(int veiculoId) {
		this.veiculoId = veiculoId;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
}
