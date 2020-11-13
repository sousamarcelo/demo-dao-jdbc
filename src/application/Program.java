package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Produtos");
		Seller sl = new Seller(1, "Marcelo", "marcelo@gmail", new Date(), 3000.00, dp);
		
		System.out.println(dp);
		System.out.println(sl);

	}

}
