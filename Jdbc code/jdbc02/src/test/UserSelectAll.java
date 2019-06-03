package test;
import java.util.ArrayList;
import com.UserDao;
import frame.Dao;
import vo.User;

public class UserSelectAll {

	public static void main(String[] args) {
		Dao<String,User> dao = new UserDao();
		ArrayList<User> list = new ArrayList<>();
		try {
		list=dao.select();
		for( User t : list) {
			System.out.println(t);
		}
		System.out.println("User Selected All..");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
