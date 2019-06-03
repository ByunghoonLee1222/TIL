package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductInsert {

	public static void main(String[] args) {
		Dao<Integer,Product> dao = new ProductDao();
		Product product = new Product(4,"pc",50000);
		try {
		dao.insert(product);
		System.out.println("User Inserted..");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
