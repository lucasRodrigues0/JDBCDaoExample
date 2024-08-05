package application;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sdao = DaoFactory.createSellerDao();

//		Seller seller = sdao.findById(6);
//		System.out.println(seller);

		Department dep = new Department(3, null);

		Seller newSeller = new Seller(null, "Lester Green", "lester@gmail.com", new java.util.Date(), 4000.00, dep);
//		sdao.insert(newSeller);
//		System.out.println(newSeller.getId());

//		newSeller = sdao.findById(2);
//
//		System.out.println("seller: " + newSeller);
//		
//		newSeller.setName("Lester Green");
//		newSeller.setEmail("lester@gmail.com");
//////		
//////		sdao.update(newSeller);
//////		
//////		System.out.println("Updated Seller: " + sdao.findById(newSeller.getId()));
////		
//////		sdao.deleteById(2);

		List<Seller> list = sdao.findAll();

		list.forEach(System.out::println);
	}

}
