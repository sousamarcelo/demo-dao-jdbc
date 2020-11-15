package application;

import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {	
		
		
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2: seller findById =====");
		Department dep = new Department(2, null);		
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller sl : list) {			
			System.out.println(sl);
		}
		
		System.out.println("\n===== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller sl : list) {			
			System.out.println(sl);
		}
		
		
		
		System.out.println();
		DB.closeConnection();

	}

}
