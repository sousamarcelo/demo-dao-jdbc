package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department newDepartment = null;

		/*
		 * System.out.println("===== TEST 1: Department insert =====");
		 * System.out.print("Name new department: "); String nameDepartment =
		 * sc.nextLine(); newDepartment = new Department(null, nameDepartment);
		 * departmentDao.insert(newDepartment);
		 * System.out.println("Inserted! new Department: " + newDepartment.getId());
		 * System.out.println("Name: " + newDepartment.getName());
		 * 
		 * System.out.println("\n===== TEST 2: Department updated =====");
		 * System.out.print("Id department updated: "); Integer id = sc.nextInt();
		 * System.out.print("Name department updated: "); sc.nextLine(); String
		 * nameUpdated = sc.nextLine(); newDepartment = new Department(id, nameUpdated);
		 * departmentDao.update(newDepartment);
		 * 
		 * System.out.println("\n===== TEST 3: Department deleted =====");
		 * System.out.print("Id departmento deleted:? "); Integer idDeleted =
		 * sc.nextInt(); departmentDao.deleteById(idDeleted); System.out.println("Id " +
		 * idDeleted + " deleted sucess");
		 */

		System.out.println("\n===== TEST 4: Department find By Id =====");
		System.out.print("inform Id department: ");
		Integer idDepartment = sc.nextInt();		
		newDepartment = departmentDao.findById(idDepartment);
		System.out.println(newDepartment);
		
		System.out.println("\n===== TEST 5: Department findall =====");

		sc.close();
		System.out.println();
		DB.closeConnection();

	}

}
