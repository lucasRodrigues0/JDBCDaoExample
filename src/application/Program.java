package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sdao = DaoFactory.createSellerDao();
		
		Seller seller = sdao.findById(2);
		
		System.out.println(seller);
	}

}
