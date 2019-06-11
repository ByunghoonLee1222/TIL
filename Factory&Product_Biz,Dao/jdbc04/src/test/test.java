package test;

import java.util.ArrayList;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class test {

	public static void main(String[] args) {

		
		ArrayList<Products> fac = new ArrayList<Products>();
		
		Biz<String, Products> dao = new ProductsBiz();
		try {

			fac = dao.get();
			for( Products p : fac) {
			System.out.println(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

