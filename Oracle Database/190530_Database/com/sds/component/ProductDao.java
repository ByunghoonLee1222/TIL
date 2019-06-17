package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Dao;
import com.sds.vo.Product;


public class ProductDao extends Dao<Integer, Product> {

	
	@Override
	public void insert(Product v) throws Exception {
		if(v.getId()==200) {
			throw new Exception("E0001");
		}
		System.out.println(v+" Inserted.");
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(k==200) {
			throw new Exception("E0002");
		}
		System.out.println(k+" Deleted.");
		
	}

	@Override
	public void update(Product v) throws Exception {
		if(v.getId()==200) {
			throw new Exception("E0003");
		}
		System.out.println(v+" Updated.");
		
	}

	@Override
	public Product select(Integer k) throws Exception {
		Product product = new Product(k,"t2",10000);
		return product;
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(100, "t1", 10000));
		list.add(new Product(200, "t2", 20000));
		list.add(new Product(300, "t3", 30000));
		list.add(new Product(400, "t4", 5000));
		list.add(new Product(500, "t5", 15000));
		
		return list;
	}

}
