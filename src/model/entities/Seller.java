package model.entities; // Define o pacote onde a classe Seller está contida

import java.io.Serializable; // Importa a interface Serializable para permitir que a classe seja serializada
import java.util.Date;        // Importa a classe Date para lidar com datas (nascimento)
import java.util.Objects;     // Importa a classe Objects para facilitar comparações e operações com objetos

public class Seller implements Serializable { // Declaração da classe Seller, que implementa Serializable
	private static final long serialVersionUID = 1L; // serialVersionUID garante compatibilidade em processos de serialização
	
	// Atributos da classe Seller
	private Integer id;           // Identificador único do vendedor
	private String name;          // Nome do vendedor
	private String email;         // Email do vendedor
	private Date birthDate;       // Data de nascimento do vendedor
	private Double baseSalary;    // Salário base do vendedor
	
	private Department department; // Associação de composição, um vendedor está vinculado a um departamento
	
	// Construtor padrão (sem parâmetros)
	public Seller() {
	}
	
	// Construtor com parâmetros para inicializar todos os atributos da classe
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department department) {
		this.id = id;                 // Inicializa o atributo id
		this.name = name;             // Inicializa o atributo name
		this.email = email;           // Inicializa o atributo email
		this.birthDate = birthDate;   // Inicializa o atributo birthDate
		this.baseSalary = baseSalary; // Inicializa o atributo baseSalary
		this.department = department; // Inicializa a associação com um objeto Department
	}
	
	// Métodos getters e setters para acessar e modificar os atributos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// Sobrescreve o método hashCode para calcular o hash com base no id
	@Override
	public int hashCode() {
		return Objects.hash(id); // Usa a classe Objects para gerar o hash com base no id
	}

	// Sobrescreve o método equals para verificar a igualdade de dois objetos Seller
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // Verifica se os dois objetos são a mesma instância
			return true;
		if (obj == null) // Verifica se o objeto passado é nulo
			return false;
		if (getClass() != obj.getClass()) // Verifica se os objetos são de classes diferentes
			return false;
		Seller other = (Seller) obj; // Faz o cast para Seller
		return Objects.equals(id, other.id); // Compara os ids dos objetos
	}

	// Sobrescreve o método toString para representar o objeto Seller como uma string
	@Override
	public String toString() {
		// Retorna uma string representando os principais atributos do vendedor
		return "Seller [id: " + id + ", name: " + name + ", email: " + email + ", birthDate: " 
				+ birthDate + ", baseSalary: " + baseSalary + ", department: " + department + "]";
	}
}
