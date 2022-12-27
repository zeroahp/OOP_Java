package buoi1;

import java.util.Scanner;

public class Tinh_tong_ab {
	
	public static int checkNum() {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		do {
			try {
				s = sc.nextLine();
				n = Integer.parseInt(s);
				
			}catch(java.lang.NumberFormatException e) {
				System.out.println("Nhap lai !");
				n = -1;
			}
		}while(n == -1);
		return n;
	}
	
	public static void main(String[] args) {
		Tinh_tong_ab Tong = new Tinh_tong_ab();
		System.out.println("Nhap hai so a va b : ");
		int a = Tong.checkNum();
		int b = Tong.checkNum();
		System.out.println("Tong cua hai so a va b la : " + (a+b));
		
	}
	
	
}
