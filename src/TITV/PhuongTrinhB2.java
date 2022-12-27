package TITV;

import java.util.Scanner;

public class PhuongTrinhB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a, b va c :");
		double a, b, c, x1, x2, delta;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c =sc.nextDouble();
		delta = Math.pow(b, 2) - 4*a*c;
		if(delta < 0) System.out.println("Phuong trinh Vo Nghiem!");
		else if(delta == 0) System.out.println(" Phuong trinh co nghiem kep x1 = x2 = "+ (-b)/(2*a));
		else {
			System.out.println("Phuong trinh co 2 nghiem");
			System.out.println("x1 = "+(-b - Math.sqrt(delta))/(2*a));
			System.out.println("x1 = "+(-b + Math.sqrt(delta))/(2*a));

		}
	}

}
