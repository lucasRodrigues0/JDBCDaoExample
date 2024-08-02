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

		Department dep = new Department(2, null);

//		Seller newSeller = new Seller(null, "Zandriou Black", "zandriou@gmail.com", new java.util.Date(), 3000.00, dep);
//		sdao.insert(newSeller);
//		System.out.println(newSeller.getId());

		List<Seller> list = sdao.findAll();

		list.forEach(System.out::println);
	}

}
