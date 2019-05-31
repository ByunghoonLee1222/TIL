package com.sds.component;

import java.util.ArrayList;

import com.sds.frame.Biz;
import com.sds.frame.Dao;
import com.sds.vo.User;

public  class UserBiz extends Biz<String, User> {

	Dao<String, User> dao;
	
	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void registor(User v) throws Exception {
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
	public void remove(String k) throws Exception {
		transactionStart();
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
		} finally {
			transactionEnd();
		}

	}

	@Override
	public void modify(User v) throws Exception {
		checkData(v);
		transactionStart();
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		} finally {
			transactionEnd();
		}

	}

	@Override
	public User get(String k) throws Exception {
		
		return dao.select(k);
	}

	@Override
	public ArrayList<User> get() throws Exception {
		// TODO Auto-generated method stub
		return dao.select();
	}

}
