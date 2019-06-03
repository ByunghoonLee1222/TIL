package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql_p;
import vo.Product;

public class ProductDao extends Dao<Integer, Product> {

	@Override
	public void insert(Product v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = getCon().prepareStatement(Sql_p.insertUser);
			pstmt.setInt(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setDouble(3, v.getPrice());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = getCon().prepareStatement(Sql_p.insertDelete);
			pstmt.setDouble(1, k);
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
		
	}

	@Override
	public void update(Product v) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = getCon();
			pstmt = getCon().prepareStatement(Sql_p.insertUpdate);
			pstmt.setString(1, v.getName());
			pstmt.setDouble(2, v.getPrice());
			pstmt.setInt(3, v.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
		}
		
	}

	@Override
	public void select(Integer k) throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		try {
			con = getCon();
			pstmt = getCon().prepareStatement(Sql_p.insertSelect);
			pstmt.setDouble(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			String uid = rset.getString("ID");
			String uname = rset.getString("NAME");
			double uprice = rset.getDouble("PRICE");
			System.out.println(uid + " " + uname + " " + uprice);
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
			close(rset);
		}
		
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rset = null;
		ArrayList<Product> list = new ArrayList<>();
		try {
			con = getCon();
			pstmt = getCon().prepareStatement(Sql_p.insertSelectAll);
			rset = pstmt.executeQuery();
			rset.next();
			while (rset.next()) {
				list.add(new Product(rset.getInt("ID"), rset.getString("Name"), rset.getDouble("PRICE")));
			}
			return list;
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
			close(con);
			close(rset);
		}
	}

}
