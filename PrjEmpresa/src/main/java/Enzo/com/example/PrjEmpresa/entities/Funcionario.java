package Enzo.com.example.PrjEmpresa.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Funcionario {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@ManyToOne
		private Departamento departamento;

	//inserir os metodos get e o set
	public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		private Long id;

	    private String Funnome;
		
		private String Funnascimento;
		
		private Double Salario;
		
		public Funcionario() {
			
		}
		
		public Funcionario(Long id, String name, String date, Double numeric) {
			super();
			this.id = id;
			this.Funnome = name;
			this.Funnascimento = date;
			this.Salario = numeric;
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFunnome() {
			return Funnome;
		}

		public void setFunnome(String name) {
			this.Funnome = name;
		}

		public String getFunnascimento() {
			return Funnascimento;
		}

		public void setFunnascimento(String date) {
			this.Funnascimento = date;
		}
		
		public Double getSalario() {
			return Salario;
		}
		
		public void setSalario(Double numeric) {
			this.Salario = numeric;
		}
		
		
}
