package app;

import java.util.ArrayList;
import java.util.Scanner;

import com.UserBiz;

import framef.Biz;
import vo.User;

public class App {

	public static void main(String[] args) {
		Biz<String, User> biz = new UserBiz();
		ArrayList<User> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		User u = new User();
		int num = 0;
		
		System.out.println("사용 목적을 고르시오: 1.삽입 2.제거 3.변경 4.선택 탐색 5.전체 탐색");
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("ID를 입력하세요:");
			String id = sc.next();
			System.out.println("PWD를 입력하세요:");
			String pwd = sc.next();
			System.out.println("이름을 입력하세요:");
			String name = sc.next();
			u.setId(id);
			u.setPwd(pwd);
			u.setName(name);
			try {
			
				biz.register(u);
				System.out.println("OK");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
