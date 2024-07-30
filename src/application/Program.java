package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp1 = new Department(1, "Caceta");
		
		System.out.println(dp1);
		
		Seller s1 = new Seller(1, "Bob Caceta", "bob@caceta.com", new Date(), 5000.0, dp1);
		
		System.out.println(s1);
	}

}
