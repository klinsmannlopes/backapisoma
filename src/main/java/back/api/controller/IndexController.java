package back.api.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import back.api.model.Extrato;
import back.api.model.Funcionario;
import back.api.repositoy.ExtratoRepository;
import back.api.repositoy.FuncionarioRepository;



@RestController /* Arquitetura REST */
@RequestMapping(value = "/api")
public class IndexController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	@Autowired
	private ExtratoRepository extratoRepository;
	
	//Reaproveitar no trabalho da soma
	@GetMapping(value = "/funcionario", produces = "application/json")
	public ResponseEntity<List<Funcionario>> funcionario (){
		
		List<Funcionario> listFuncionario = (List<Funcionario>) funcionarioRepository.findAll();
		
		return new ResponseEntity<List<Funcionario>>(listFuncionario, HttpStatus.OK);
	}
	
	@GetMapping(value = "/extrato", produces = "application/json")
	public ResponseEntity<List<Extrato>> extrato () {
		
		List<Extrato> listExtrato = (List<Extrato>) extratoRepository.findAll();
		
		return new ResponseEntity<List<Extrato>>(listExtrato, HttpStatus.OK);
	}
	
	
	//Tentiva de corrigir retono de data
	@GetMapping(value = "/todos", produces = "application/json")
	public ResponseEntity<List<Extrato>> todos () {
		
		List<Extrato> listExtrato = (List<Extrato>) extratoRepository.buscaTodos();
		
		return new ResponseEntity<List<Extrato>>(listExtrato, HttpStatus.OK);
	}
	
	@GetMapping(value = "/saldo", produces = "application/json")
	public Long saldo () {
		
		Long saldo = extratoRepository.saldo();
		
		return saldo;
	}
	
}
