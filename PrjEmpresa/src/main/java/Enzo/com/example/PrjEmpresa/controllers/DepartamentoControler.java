package Enzo.com.example.PrjEmpresa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Enzo.com.example.PrjEmpresa.entities.Departamento;
import Enzo.com.example.PrjEmpresa.services.DepartamentoService;
import io.swagger.v3.oas.annotations.tags.Tag;


	@Tag(name = "Departamento", description = "API REST DE GENERATION DE FINCIONARIO")
	@RestController
	@RequestMapping("/Departamento")
	public class DepartamentoControler {
		
		@GetMapping("/home")
		public String paginaInicial() {
			return "index";
		}
  
private final DepartamentoService departamentoService;
	
	@Autowired
	public DepartamentoControler(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Departamento> findDepartamentobyId(@PathVariable Long id) {
		Departamento departamento = departamentoService.getDepartamentoById(id);
		if (departamento != null) {
			return ResponseEntity.ok(departamento);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/")
	public ResponseEntity<List<Departamento>> findAllUsuarioscontrol() {
		List<Departamento> departamento = departamentoService.getAllDepartamento();
		return ResponseEntity.ok(departamento);
	}

	@PostMapping("/")
	public ResponseEntity<Departamento> insertUsuariosControl(@RequestBody Departamento departamento) {
		Departamento novodepartamento = departamentoService.saveDepartamento(departamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(novodepartamento);
	}

	@PutMapping("/{id}")
    public ResponseEntity<Departamento> updateDepartamento(@PathVariable Long funcodigo, @RequestBody Departamento departamento) {
		Departamento departamentoAtualizado = departamentoService.updateDepartamento(funcodigo, departamento);
        if (departamentoAtualizado != null) {
            return ResponseEntity.ok(departamentoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@DeleteMapping("/id")
	public ResponseEntity<String> deleteUsuarioControl(@PathVariable Long funcodigo) {
		boolean remover = departamentoService.deleteDepartamento(funcodigo);
		if (remover) {
			return ResponseEntity.ok().body("usuario Excluido com sucesso");
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
