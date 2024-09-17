package application; // Define o pacote onde a classe Program está contida

import java.util.Date; // Importa a classe Date para trabalhar com datas

import model.entities.Department; // Importa a classe Department do pacote model.entities
import model.entities.Seller;     // Importa a classe Seller do pacote model.entities

public class Program {
	public static void main(String[] args) {
	
		// Cria um objeto do tipo Department com id 1 e nome "Books"
		Department obj = new Department(1, "Books");
		
		// Cria um objeto do tipo Seller, com os seguintes parâmetros:
		// id = 21, name = "Bob", email = "bob@gmaillcom", birthDate = Data atual, 
		// baseSalary = 3000.0 e department associado ao objeto criado acima (obj)
		Seller seller = new Seller(21, "Bob", "bob@gmaillcom", new Date(), 3000.0, obj);
		
		// Exibe no console a representação do objeto seller utilizando o método toString()
		// O método toString da classe Seller exibirá todos os atributos do vendedor e o departamento
		System.out.println(seller);
	}
}
