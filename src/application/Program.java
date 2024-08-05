package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

//		operações com seller

//		SellerDao sdao = DaoFactory.createSellerDao();
//
//		Seller seller = sdao.findById(6);
//		System.out.println(seller);
//
//		Department dep = new Department(3, null);
//
//		Seller newSeller = new Seller(null, "Lester Green", "lester@gmail.com", new java.util.Date(), 4000.00, dep);
//		sdao.insert(newSeller);
//		System.out.println(newSeller.getId());
//
//		newSeller = sdao.findById(2);
//
//		System.out.println("seller: " + newSeller);
//
//		newSeller.setName("Lester Green");
//		newSeller.setEmail("lester@gmail.com");
//
//		sdao.update(newSeller);
//
//		System.out.println("Updated Seller: " + sdao.findById(newSeller.getId()));
//
//		sdao.deleteById(2);
//
//		List<Seller> list = sdao.findAll();
//
//		list.forEach(System.out::println);

//		operações com department

		DepartmentDao dDao = DaoFactory.createDepartmentDao();

//		Department dep = dDao.findById(4);
//		
//		System.out.println(dep);

//		dDao.insert(new Department(null, "Donalds"));

//		dDao.deleteById(6);
		
		Department dep = dDao.findById(3);
		dep.setName("Food");
		
		dDao.update(dep);
		
		List<Department> depList = dDao.findAll();

		depList.forEach(System.out::println);

	}

}
