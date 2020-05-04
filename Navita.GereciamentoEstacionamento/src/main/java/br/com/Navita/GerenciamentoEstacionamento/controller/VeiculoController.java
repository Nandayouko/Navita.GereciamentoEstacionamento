package br.com.Navita.GerenciamentoEstacionamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.Navita.GereciamentoEstacionamento.model.Veiculo;
import br.com.Navita.GereciamentoEstacionamento.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRep;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Veiculo>  listaVeiculos() {
		Iterable<Veiculo> listaVeiculos = veiculoRep.findAll();
		return listaVeiculos;
	}
	
	@PostMapping
	public Veiculo cadastroVeiculo(@RequestBody @Valid Veiculo veiculo) {		
		return veiculoRep.save(veiculo);
	}
	
	@PutMapping
//	public Veiculo atualizaVeiculo(@RequestBody @Valid Veiculo id) {
//		veiculoRep.findById(id);	
//		return veiculo;		
//	}
	@DeleteMapping
	public Veiculo deletaVeiculo(@RequestBody Veiculo veiculo) {
		veiculoRep.delete(veiculo);
		return veiculo;
	}

}
