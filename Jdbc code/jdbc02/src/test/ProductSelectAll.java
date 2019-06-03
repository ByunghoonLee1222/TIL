package test;

import java.util.ArrayList;

import com.ProductDao;

import frame.Dao;
import vo.Product;

public class ProductSelectAll {

	public static void main(String[] args) {
		Dao<Integer, Product> dao = new ProductDao();
		ArrayList<Product> list = new ArrayList<>();
		try {
			list = dao.select();
			for (Product t : list) {
				System.out.println(t);
			}
			System.out.println("Product Selected All..");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
