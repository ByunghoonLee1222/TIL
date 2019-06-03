package test;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductDelete {

	public static void main(String[] args) {
		Dao<Integer,Product> dao = new ProductDao();
		try {
		dao.delete(1);
		System.out.println("User Deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
