package application; // Define o pacote onde a classe Program está contida

import java.util.Date; // Importa a classe Date para trabalhar com datas

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department; // Importa a classe Department do pacote model.entities
import model.entities.Seller;     // Importa a classe Seller do pacote model.entities

public class Program {
	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.creatSellerDao();// implemetando a instaciação da interface.
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
	}
}
