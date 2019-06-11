package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.Products;

public class ProductsDao extends Dao<String, Products> {

	public void insert(Products v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.insertProduct);
			pstmt.setInt(1, v.getPdno());
			pstmt.setString(2, v.getPdname());
			pstmt.setString(3, v.getPdsubname());
			pstmt.setString(4, v.getFactno());
			pstmt.setDate(5, v.getPddate());
			pstmt.setInt(6, v.getPdcost());
			pstmt.setInt(7, v.getPdprice());
			pstmt.setInt(8, v.getPdamount());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}
  
	@Override
	public void delete(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.DeleteProduct);
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}

	@Override
	public void update(Products v, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(Sql.UpdateProduct);
			pstmt.setInt(1, v.getPdno());
			pstmt.setString(2, v.getPdname());
			pstmt.setString(3, v.getPdsubname());
			pstmt.setString(3, v.getFactno());
			pstmt.setDate(4, v.getPddate());
			pstmt.setInt(5, v.getPdcost());
			pstmt.setInt(6, v.getPdprice());
			pstmt.setInt(7, v.getPdamount());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
		}
	}

	@Override
	public Products select(String k, Connection con) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Products pro;
		try {
			pstmt = con.prepareStatement(Sql.SelectProduct);
			pstmt.setString(1, k);
			rset = pstmt.executeQuery();
			rset.next();
			int pno = rset.getInt("PDNO");
			String pname = rset.getString("PDNAME");
			String psubname = rset.getString("PDSUBNAME");
			String fno = rset.getString("FACTNO");
			Date pdate = rset.getDate("PDDATE");
			int pcost = rset.getInt("PDCOST");
			int pprice = rset.getInt("PDPRICE");
			int pamount = rset.getInt("PDAMOUNT");
			pro = new Products(pno, pname, psubname, fno, pdate, pcost, pprice, pamount);
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
		}
		return pro;

	}

	@Override
	public ArrayList<Products> select(Connection con) throws Exception {
		ArrayList<Products> pro = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Products p = null;
		try {
			pstmt = con.prepareStatement(Sql.SelectAllProduct);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				int pno = rset.getInt("PDNO");
				String pname = rset.getString("PDNAME");
				String psubname = rset.getString("PDSUBNAME");
				String fno = rset.getString("FACTNO");
				Date pdate = rset.getDate("PDDATE");
				int pcost = rset.getInt("PDCOST");
				int pprice = rset.getInt("PDPRICE");
				int pamount = rset.getInt("PDAMOUNT");
				pro.add(new Products(pno,pname,psubname,fno,pdate,pcost,pprice,pamount));
				
			}
			return pro;
		} catch (SQLException e) {
			throw e;
		} finally {
			close(pstmt);
			close(rset);
		}
		

	}



	
}
