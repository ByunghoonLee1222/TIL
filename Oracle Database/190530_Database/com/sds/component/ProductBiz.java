package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.Product;

public class ProductBiz extends Biz<Integer, Product> {

	Dao<Integer, Product> dao;
	
	public ProductBiz() {
		dao = new ProductDao();
	}
	@Override
	public void registor(Product v) throws Exception {
		checkData(v);
		transactionStart();
		try {
			dao.insert(v);// insert 예외 발생시 registor 함수도 Exception으로 던짐
		} catch (Exception e) {
			throw e;
		} finally {//예외 발생해도 실행
			transactionEnd();
		}
		
	}
	@Override
	public void remove(Integer k) throws Exception {
		
		transactionStart();
		try {
			dao.delete(k);// insert 예외 발생시 registor 함수도 Exception으로 던짐
		} catch (Exception e) {
			throw e;
		} finally {//예외 발생해도 실행
			transactionEnd();
		}
		
	}
	@Override
	public void modify(Product v) throws Exception {
		checkData(v);
		transactionStart();
		try {
			dao.update(v);// insert 예외 발생시 registor 함수도 Exception으로 던짐
		} catch (Exception e) {
			throw e;
		} finally {//예외 발생해도 실행
			transactionEnd();
		}
		
	}

	@Override
	public Product get(Integer k) throws Exception {
		return dao.select(k);
	}
	@Override
	public ArrayList<Product> get() throws Exception {
		
		return dao.select();
	}

}
