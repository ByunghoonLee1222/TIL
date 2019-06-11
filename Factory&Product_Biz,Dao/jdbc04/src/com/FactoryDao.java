package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import frame.Dao;
import frame.Sql;
import vo.Factory;

public class FactoryDao extends Dao<String, Factory> {

	@Override
    public void insert(Factory v, Connection con) throws Exception {
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(Sql.insertFactory);
            pstmt.setString(1, v.getFactno());
            pstmt.setString(2, v.getFacname());
            pstmt.setString(3, v.getFacloc());
            pstmt.executeUpdate();
        }catch(Exception e) {
            throw e;
        }finally {
            close(pstmt);    
        }
        
    }

    @Override
    public void delete(String k, Connection con) throws Exception {
        PreparedStatement pstmt = null;
        try {
        pstmt = con.prepareStatement(Sql.DeleteFactory);
        pstmt.setString(1, k);
        pstmt.executeUpdate();
        }catch(Exception e) {
            throw e;
        }finally {
            close(pstmt);
        }        
    }

    @Override
    public void update(Factory v, Connection con) throws Exception {
        PreparedStatement pstmt = null;
        try {
        pstmt = con.prepareStatement(Sql.UpdateFactory);
        pstmt.setString(1, v.getFacname());
        pstmt.setString(2, v.getFacloc());
        pstmt.setString(3, v.getFactno());
        pstmt.executeUpdate();
        }catch(Exception e) {
            throw e;
        }finally {
            close(pstmt);
        }
        
    }

    @Override
    public Factory select(String k, Connection con) throws Exception {
        Factory f = null;
        ResultSet rset=null;
        PreparedStatement pstmt = null;
        try {
        pstmt = con.prepareStatement(Sql.SelectFactory);
        pstmt.setString(1, k);
        rset = pstmt.executeQuery();
        rset.next();
        String factno = rset.getString("FACTNO");
        String factname = rset.getString("FACNAME");
        String facloc = rset.getString("FACLOC");
        f = new Factory(factno, factname, facloc);
        return f;
        }catch(Exception e) {
            throw e;
        }finally {
            close(pstmt);
            close(rset);
        }
    }

    @Override
    public ArrayList<Factory> select(Connection con) throws Exception {
        Factory f = null;
        ArrayList<Factory> fs = new ArrayList<Factory>();
        ResultSet rset=null;
        PreparedStatement pstmt = null;
        try {
        pstmt = con.prepareStatement(Sql.SelectAllFactory);
        rset = pstmt.executeQuery();
        while(rset.next()) {
            String factno = rset.getString("FACTNO");
            String factname = rset.getString("FACNAME");
            String facloc = rset.getString("FACLOC");
            f = new Factory(factno,factname, facloc);
            fs.add(f);
        }
        return fs;
        }catch(Exception e) {
            throw e;
        }finally {
            close(pstmt);
            close(rset);
        }   
    }


	
		
	}
