package com.sds.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.sds.component.UserBiz;
import com.sds.frame.Biz;
import com.sds.vo.Product;
import com.sds.vo.User;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user;
		ArrayList<User> list = new ArrayList<>();
		Biz<String,User> biz = new UserBiz();
		out:
		while (true) {
			System.out.println("MENU: r,g,q..");
			String cmd = sc.next();
			switch (cmd) {
			case "r":
				System.out.println("Intput User Info :");
				String id = sc.next();
				String name = sc.next();
				String pwd = sc.next();
				user = new User(id,name,pwd);
				try {
					biz.registor(user);
				} catch (Exception e) {
					System.out.println("Insert Error");
					System.out.println(e.getMessage());
				}
				break;
			case "g":
				try {
					list = biz.get();
					for(User u: list) {
						System.out.println(u);
					}
				} catch (Exception e) {
					System.out.println("Get Error");
				}
				break;
			case "q":
				System.out.println("Bye..");
				break out;
			}
		}
		sc.close();

	}

}
