package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: sellerById ===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: sellerByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(seller.getDepartment());
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: sellerAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 4: insert ===");
		Seller newSeller = new Seller(null, "Greg Two", "greg@gmail.com", new Date(), 4000.0, seller.getDepartment());
		sellerDao.insert(newSeller);
		System.out.println("New seller inserted");
		System.out.println(newSeller);
		
		System.out.println("=== TEST 5: update ===");
		newSeller.setEmail("greg2@gmail.com");;
		sellerDao.update(newSeller);
		System.out.println("Seller updated");
		System.out.println(newSeller);
		
	}

}
