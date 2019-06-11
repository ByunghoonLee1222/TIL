package test;

import com.UserBiz;

import framef.Biz;
import vo.User;

public class UserSelect {

	public static void main(String[] args) {
		Biz<String,User> biz = new UserBiz();
		User u = null;
	    try {
			u = biz.get("id02");
			System.out.println("OK");
			System.out.println(u.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
