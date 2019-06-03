package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductSelect {

	public static void main(String[] args) {
		Dao<Integer,Product> dao = new ProductDao();
		try {
		dao.select(2);
		System.out.println("User Selected..");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
