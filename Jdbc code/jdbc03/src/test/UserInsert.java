package test;

import com.UserBiz;

import framef.Biz;
import vo.User;

public class UserInsert {

	public static void main(String[] args) {
		User u = new User("id67","pwd67","¼÷");
		Biz<String,User> biz = new UserBiz();
		
		try {
			biz.register(u);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
