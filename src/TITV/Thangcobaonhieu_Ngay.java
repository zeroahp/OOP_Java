package TITV;

import java.util.Scanner;

public class Thangcobaonhieu_Ngay {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so Thang va Nam can kiem tra :");
		int n = sc.nextInt();
		int m = sc.nextInt();
		switch (n) {
		case 1: 
		case 3:
		case 5: 
		case 7:
		case 9: 
		case 10:
		case 12:
		{
			System.out.println("Thang "+n+" nam " +m+ " co 31 ngay !");
			break;
		}
		case 4: 
		case 6:
		case 8: 
		case 11:
		{
			System.out.println("Thang "+n+" nam " +m+ " co 30 ngay !");
			break;
		}
		case 2:
		{
			if((m % 400 == 0) || (m %4 == 0 && m %100 !=0 ))
				System.out.println("Thang "+n+" nam " +m+ " co 29 ngay !");
			else 		
				System.out.println("Thang "+n+" nam " +m+ " co 28 ngay !");
			break;

		}
	}
	}
}
