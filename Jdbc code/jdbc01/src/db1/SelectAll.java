package db1;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.Const;

public class SelectAll {

	public static void main(String[] args) {

		// 1. JDBC Driver loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}

		// 2. Connection 1521 db db
		String id = "db";
		String password = "db";
		String url = "jdbc:oracle:thin:@70.12.50.232:1521:xe";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}

		String sql = "SELECT * FROM T_USER ";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(sql);
			//pstmt.setString(1, "id02");
			rset = pstmt.executeQuery();
			while(rset.next()) {
				String uid = rset.getString("ID");
				String upwd = rset.getString("PWD");
				String uname = rset.getString("NAME");
				System.out.println(uid + " " + upwd + " " + uname);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 4. close
		try {
			rset.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}