package Enzo.com.example.PrjEmpresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Enzo.com.example.PrjEmpresa.entities.Departamento;
import Enzo.com.example.PrjEmpresa.repositories.DepartamentoRepository;

public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepository;

	public List<Departamento> getAllDepartamento() {
		return departamentoRepository.findAll();
	}

	public Departamento getDepartamentoById(long funcodigo) {
		return departamentoRepository.findById(funcodigo).orElse(null);
	}

	public Departamento saveDepartamento(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	public boolean deleteDepartamento(Long id) {
		Optional<Departamento> departamentoExistente = departamentoRepository.findById(id);
		if (departamentoExistente.isPresent()) {
			departamentoRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Departamento updateDepartamento(Long Depcodigo, Departamento novoDepartamento) {
		Optional<Departamento> departamentoOptional = departamentoRepository.findById(Depcodigo);
		if (departamentoOptional.isPresent()) {
			Departamento departamentoExistente = departamentoOptional.get();
			departamentoExistente.setDepcodigo(novoDepartamento.getDepcodigo());
			departamentoExistente.setDepnome(novoDepartamento.getDepnome());
			return departamentoRepository.save(novoDepartamento);
		} else {
			return null; 
		}

	}

}
