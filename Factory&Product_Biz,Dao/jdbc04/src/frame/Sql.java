package frame;

public class Sql {
	public static String insertProduct = 
			"INSERT INTO PRODUCTS VALUES(?,?,?,?,?,?,?,?)";
    public static String DeleteProduct = 
    		"DELETE FROM PRODUCTS WHERE PDNO = ?";
    public static String UpdateProduct = 
    		"Update PRODUCTS SET PDNAME=?, PDSUBNAME=?, FACTNO=?, PDDATE=?, PDCOST=?, PDPRICE=?, PDAMOUNT = ?,  WHERE PDNO=?";
    public static String SelectProduct = 
    		"SELECT * FROM PRODUCTS WHERE PDNO = ?";
    public static String SelectAllProduct = 
    		"SELECT * FROM PRODUCTS";


    public static String insertFactory =
    		"INSERT INTO FACTORY VALUES(?,?,?)";
    public static String DeleteFactory =
    		"DELETE FROM FACTORY WHERE FACTNO = ?";
    public static String UpdateFactory =
    		"Update FACTORY SET FACNAME =?, FACLOC=?, WHERE FACTNO=?";
    public static String SelectFactory =
    		"SELECT * FROM FACTORY WHERE FACTNO = ?";
    public static String SelectAllFactory =
    		"SELECT * FROM FACTORY";


}


