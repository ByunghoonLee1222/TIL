package com.sds.test;

import java.util.ArrayList;

import com.sds.component.ProductBiz;
import com.sds.frame.Biz;
import com.sds.vo.Product;


public class ProductSelectAll {

	public static void main(String[] args) {
		Biz<Integer,Product> biz = new ProductBiz();
		ArrayList<Product> list = null;
		try {
			list = biz.get();
			for(Product u: list) {
				System.out.println(u);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
