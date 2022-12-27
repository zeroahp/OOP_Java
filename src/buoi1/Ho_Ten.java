package buoi1;

import java.util.Scanner;

public class Ho_Ten {

	public static String inTen(String HT) {
		String s1 = HT.trim();
		int p = s1.lastIndexOf(" ");
		s1 = s1.substring(p+1);	
		return s1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String HT = sc.nextLine();
		System.out.println(inTen(HT)); 

	}

}

//package buoi1;
//
//import java.util.Scanner;
//
//public class Tinh_tong_ab {
//	
//	
//	public static int CheckNum() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String s;
//		int n;
//		
//		do 
//		{
//			try 
//			{
//				s = sc.nextLine();
//				n = Integer.parseInt(s);
//			}
//			catch (java.lang.NumberFormatException e)
//			{
//				System.out.println("Nhap ngu, nhap lai");
//				n = -1 ;
//			}
//		} while (n == -1);
//		return n;
//	}
//	
//	public static void main(String[] args) {
//		
//		Tinh_tong_ab tong = new Tinh_tong_ab();
//		
//		System.out.println("Nhap so a");
//		int a = tong.CheckNum();
//		System.out.println("Nhap so b");
//		int b = tong.CheckNum();
//		System.out.println("Tong: " + (a+b));
//		
//	}
//	
//}
