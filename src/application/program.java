package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
	
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("========== TEST 1: SELLER findByID ============");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);

		
	}

}
