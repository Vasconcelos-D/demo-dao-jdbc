package model.entities; // Define o pacote onde a classe está inserida

import java.io.Serializable; // Importa a interface Serializable para permitir a serialização da classe
import java.util.Objects;    // Importa a classe Objects para facilitar comparações e operações com objetos

public class Department implements Serializable { // Declaração da classe Department, que implementa Serializable
	private static final long serialVersionUID = 1L; // serialVersionUID garante compatibilidade em processos de serialização
	
	private Integer id;  // Atributo que representa o identificador único do departamento
	private String name; // Atributo que representa o nome do departamento
	
	// Construtor padrão (vazio) que permite criar um objeto Department sem inicializar os atributos
	public Department () {
	}
	
	// Construtor que permite criar um objeto Department já com id e nome
	public Department (Integer id, String name) {
		this.id = id;   // Inicializa o atributo id com o valor passado como parâmetro
		this.name = name; // Inicializa o atributo name com o valor passado como parâmetro
	}
	
	// Método getter para obter o valor do atributo id
	public Integer getId() {
		return id;
	}
	
	// Método setter para modificar o valor do atributo id
	public void setId(Integer id) {
		this.id = id;
	}
	
	// Método getter para obter o valor do atributo name
	public String getName() {
		return name;
	}
	
	// Método setter para modificar o valor do atributo name
	public void setName(String name) {
		this.name = name;
	}

	// Sobrescreve o método hashCode para gerar um código hash baseado no atributo id
	@Override
	public int hashCode() {
		return Objects.hash(id); // Usa a classe Objects para calcular o hash com base no id
	}

	// Sobrescreve o método equals para comparar objetos da classe Department
	@Override
	public boolean equals(Object obj) {
		// Verifica se os dois objetos comparados são o mesmo
		if (this == obj)
			return true;
		// Verifica se o objeto comparado é nulo
		if (obj == null)
			return false;
		// Verifica se o objeto comparado é de uma classe diferente
		if (getClass() != obj.getClass())
			return false;
		// Converte o objeto para o tipo Department e compara os ids
		Department other = (Department) obj;
		return Objects.equals(id, other.id); // Retorna true se os ids forem iguais
	}
	
	// Sobrescreve o método toString para retornar uma representação em String do objeto
	@Override
	public String toString() {
		// Retorna o id e o nome do departamento em formato de string legível
		return "Department [id: " + id + ", name: " + name + "]";
	}
}
