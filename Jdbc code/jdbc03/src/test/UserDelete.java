package test;

import com.UserBiz;

import framef.Biz;
import vo.User;

public class UserDelete {

	public static void main(String[] args) {
		Biz<String,User> biz = new UserBiz();
	    try {
			biz.remove("id66");
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
