package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Select {

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

		// 3. SQL Àü¼Û
		String sql = 
				"SELECT * FROM T_Product WHERE ID = ?";
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "P00");
			rset = pstmt.executeQuery();
			rset.next();
			String uid = rset.getString("ID");
			String uname = rset.getString("NAME");
			int uprice = rset.getInt("PRICE");
			Date udate = rset.getDate("REGDATE");
			System.out.println(uid+" "+uname+" "+uprice+" "+udate);

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

