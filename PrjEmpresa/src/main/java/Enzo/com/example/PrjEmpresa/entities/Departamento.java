package Enzo.com.example.PrjEmpresa.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	private Funcionario funcionario;

//inserir os metodos get e o set
public Funcionario getFuncionario() {
		return funcionario;
}
public void setFuncionario(Funcionario funcionario) {
	this.funcionario = funcionario;
}
	private Long Depcodigo;
	
	private String Depnome;
	
	public Departamento() {
		
	}

	public Long getDepcodigo() {
		return Depcodigo;
	}

	public void setDepcodigo(Long Depcodigo) {
		this.Depcodigo = Depcodigo;
	}

	public String getDepnome() {
		return Depnome;
	}

	public void setDepnome(String Depnome) {
		this.Depnome = Depnome;
    }

}
