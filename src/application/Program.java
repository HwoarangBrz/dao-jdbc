package application;

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

	}

}
