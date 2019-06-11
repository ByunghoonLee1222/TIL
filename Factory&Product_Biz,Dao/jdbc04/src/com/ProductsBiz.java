package com;

import java.sql.Connection;
import java.util.ArrayList;

import frame.Biz;
import frame.Dao;
import vo.Products;

public class ProductsBiz extends Biz<String, Products> {

	 Dao<String,Products> dao;
	 public ProductsBiz() {
	  dao = new ProductsDao();
	 }
	 @Override
	 public void register(Products v) throws Exception{
	  Connection con = null;
	  try {
	   con = getCon();
	   dao.insert(v, con);
	  
	   con.commit();
	  }catch(Exception e) {
	   con.rollback();
	   throw e;
	  }finally {
	  close(con);
	  }
	 }

	 @Override
	 public void remove(String k) throws Exception {
	  Connection con = null;
	  try {
	   con = getCon();
	   dao.delete(k, con);
	   con.commit();
	  }catch(Exception e) {
	   con.rollback();
	   throw e;
	  }finally {
	  close(con);
	  }
	 }

	 @Override
	 public void modify(Products v) throws Exception {
	  Connection con = null;
	  try {
	   con = getCon();
	   dao.update(v, con);
	   con.commit();
	  }catch(Exception e) {
	   con.rollback();
	   throw e;
	  }finally {
	  close(con);
	  }
	 }

	 @Override
	 public Products get(String k) throws Exception {
	  Connection con = null;
	  Products u = null;
	  try {
	   con = getCon();
	   u = dao.select(k, con);
	  }catch(Exception e) {
	   throw e;
	  }finally {
	  close(con);
	  }
	  return u;
	 }

	 @Override
	 public ArrayList<Products> get() throws Exception {
	  Connection con = null;
	  ArrayList<Products> pro = null;
	  try {
	   con = getCon();
	   pro = dao.select(con);
	  }catch(Exception e) {
	   throw e;
	  }finally {
	  close(con);
	  }
	  return pro;
	 }

}
