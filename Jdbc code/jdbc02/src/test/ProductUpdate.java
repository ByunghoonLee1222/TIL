package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductUpdate {

	public static void main(String[] args) {
		Dao<Integer,Product> dao = new ProductDao();
		Product product = new Product(4,"we",10000);
		try {
		dao.update(product);
		System.out.println("User Updated..");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
