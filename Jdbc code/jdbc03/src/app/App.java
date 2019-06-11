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
		
		System.out.println("��� ������ ���ÿ�: 1.���� 2.���� 3.���� 4.���� Ž�� 5.��ü Ž��");
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("ID�� �Է��ϼ���:");
			String id = sc.next();
			System.out.println("PWD�� �Է��ϼ���:");
			String pwd = sc.next();
			System.out.println("�̸��� �Է��ϼ���:");
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
