package buoi1;

import java.util.Scanner;

public class Nhap_chuoi_float {

	public static float checkNum() {
		Scanner sc = new Scanner(System.in);
		String s;
		float n;
		do {
			try {
				s = sc.nextLine();
				n = Float.parseFloat(s);
				
			}catch(java.lang.NumberFormatException e) {
				System.out.println("Nhap lai !");
				n = -1;
			}
		}while(n == -1);
		return n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nhap_chuoi_float Nhap = new Nhap_chuoi_float();
		System.out.println("Nhap so luong phan tu trong mang");
		int n = sc.nextInt();
		float a[] = new float[n];
		for(int i = 0; i<n ;i++) {
			a[i] = Nhap.checkNum();
		}
		for (float it:a)
			System.out.print(it + " ");

	}

}
