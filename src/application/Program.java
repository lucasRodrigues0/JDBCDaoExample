package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sdao = DaoFactory.createSellerDao();

//		Seller seller = sdao.findById(6);
//		
//		System.out.println(seller);

		List<Seller> list = sdao.findAll();
		
		list.forEach(System.out::println);
	}

}
