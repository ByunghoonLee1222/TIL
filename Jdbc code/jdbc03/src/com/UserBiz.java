package com;

import java.sql.Connection;
import java.util.ArrayList;

import framef.Biz;
import framef.Dao;
import vo.User;

public class UserBiz extends Biz<String, User> {
	Dao<String, User> dao;

	public UserBiz() {
		dao = new UserDao();
	}

	@Override
	public void register(User v) throws Exception {
		Connection con = null;
		try {
			con = getCon();
			dao.insert(v, con);
			// dao.insert(v, con);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		} finally {
			close(con);
		}
	}

	@Override
	public void remove(String k) throws Exception {
		Connection con = null;
		try {
			con = getCon();
			dao.delete(k, con);
			// dao.insert(v, con);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		} finally {
			close(con);
		}

	}

	@Override
	public void modify(User v) throws Exception {
		Connection con = null;
		try {
			con = getCon();
			dao.update(v, con);
			// dao.insert(v, con);
			con.commit();
		} catch (Exception e) {
			con.rollback();
			throw e;
		} finally {
			close(con);
		}

	}

	@Override
	public User get(String k) throws Exception {
		Connection con = null;
		User u =  null;
		try {
			con = getCon();
			u = dao.select(k, con);
			return u;
		} catch (Exception e) {

			throw e;
		} finally {
			close(con);
		}

	}

	@Override
	public ArrayList<User> get() throws Exception {
		Connection con = null;
		ArrayList<User> list = new ArrayList<>();
		try {
			con = getCon();
			list = dao.select(con);
		} catch (Exception e) {
			throw e;
		} finally {
			close(con);
		}
		return list;
	}

}