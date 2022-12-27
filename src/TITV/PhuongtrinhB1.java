package TITV;

import java.util.Scanner;

public class PhuongtrinhB1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,x;
		System.out.println("Nhap a va b :");
		a = sc.nextDouble();
		b = sc.nextDouble();
		if(a==0) {
			if(b==0)System.out.println("Phuong trinh VSN!");
			else System.out.println("Phuong trinh vo nghiem !");
		}else {
			System.out.println("Phuong trinh co nghiem x ="+ (-b)/a);
		}
		
	}

}
