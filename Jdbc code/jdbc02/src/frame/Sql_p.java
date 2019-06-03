package frame;

public class Sql_p {
	
	public static String insertUser
	= "INSERT INTO T_PRODUCT VALUES (?,?,?,SYSDATE)";
	public static String insertDelete
	= "DELETE FROM T_PRODUCT WHERE ID = ?";
	public static String insertUpdate
	= "UPDATE T_PRODUCT SET NAME=?,PRICE=? WHERE ID=?";
	public static String insertSelect
	= "SELECT * FROM T_PRODUCT WHERE ID = ?";
	public static String insertSelectAll
	= "SELECT * FROM T_PRODUCT";
}
