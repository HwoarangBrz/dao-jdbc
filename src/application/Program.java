package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: Seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(seller.getDepartment());
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: Seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Greg Three", "greg@gmail.com", new Date(), 4000.0, seller.getDepartment());
		sellerDao.insert(newSeller);
		System.out.println("New seller inserted");
		System.out.println(newSeller);
		
		System.out.println("=== TEST 5: Seller update ===");
		newSeller.setEmail("greg2@gmail.com");;
		sellerDao.update(newSeller);
		System.out.println("Seller updated");
		System.out.println(newSeller);
		
		System.out.println("=== TEST 6: Seller delete ===");
		sellerDao.deleteById(newSeller.getId());
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 7: Department findById ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("=== TEST 8: Department findAll ===");
		List<Department> listDep = departmentDao.findAll();
		for (Department obj : listDep) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 9: Deparment insert ===");
		dep = new Department(null, "Actions");
		departmentDao.insert(dep);
		System.out.println("New department inserted");
		System.out.println(dep);
		
		System.out.println("=== TEST 10: Department update ===");
		dep.setName("New Actions");;
		departmentDao.update(dep);
		System.out.println("Department updated");
		System.out.println(dep);
		
		System.out.println("=== TEST 11: Department delete ===");
		departmentDao.deleteById(dep.getId());
		listDep = departmentDao.findAll();
		for (Department obj : listDep) {
			System.out.println(obj);
		}


	}

}
