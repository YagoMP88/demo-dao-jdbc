package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
	
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("========== TEST 1: SELLER findByID ============");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n========== TEST 2: SELLER findByDepartment ============");
		Department department = new Department(2,null);
		List<Seller> list = sellerdao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n========== TEST 3: SELLER findAll ============");
		list = sellerdao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n========== TEST 3: SELLER insert ============");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerdao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}

}
