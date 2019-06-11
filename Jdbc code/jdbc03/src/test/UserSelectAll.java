package test;

import java.util.ArrayList;

import com.UserBiz;

import framef.Biz;
import vo.User;

public class UserSelectAll {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		Biz<String,User> biz = new UserBiz();
		
		try {
			list=biz.get();
			for( User t : list) {
				System.out.println(t);
			}
			System.out.println("User Selected All..");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
