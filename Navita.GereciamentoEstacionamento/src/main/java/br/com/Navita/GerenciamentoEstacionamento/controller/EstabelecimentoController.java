package br.com.Navita.GerenciamentoEstacionamento.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.Navita.GereciamentoEstacionamento.model.Estabelecimento;
import br.com.Navita.GereciamentoEstacionamento.repository.EstabelecimentoRepository;

@RestController
@RequestMapping("/estabelecimento")
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoRepository estabRepo;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Estabelecimento>  listaEstabelecimentos() {
		Iterable<Estabelecimento> listaEstabelecimentos = estabRepo.findAll();
		return listaEstabelecimentos;
	}
	
	@PostMapping
	public Estabelecimento cadastroEstabelecimento(@RequestBody @Valid Estabelecimento estab) {		
		return estabRepo.save(estab);
	}
	
	@PutMapping
//	public Estabelecimento atualizaEstabelecimento(@RequestBody @Valid Estabelecimento id) {
//		estabRepo.findById(id);
//		return estab;
//		
//	}
	
	@DeleteMapping
	public Estabelecimento deletaEstabelecimento(@RequestBody Estabelecimento estab) {
		estabRepo.delete(estab);
		return estab;
	}
	
}

