package test;

import com.UserBiz;
import com.UserDao;

import framef.Biz;
import vo.User;

public class UserUpdate {

	public static void main(String[] args) {
		User u = new User("id67","pwd7","°ø¸»");
		Biz<String,User> biz = new UserBiz();
		
		try {
			biz.modify(u);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
