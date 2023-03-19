package buoi2;

import java.util.Scanner;

public class SDDate {
	
	public static void main(String[] args) {
		Date date = new Date();
		date.in();
		
		Date n = new Date();
		n.nhap();
		System.out.println("Ngay vua nhap la :");
		n.in();
		
		//ngay hom sau cua n la
		System.out.println("Ngay hom sau cua n la :" );
		Date homSau = new Date();
		homSau = n.ngayHomSau();
		homSau.in();
		
		//cong K ngay vao n la ngay 
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap K :");
		k = sc.nextInt();
		System.out.println("Cong K ngay vao n la ngay :");
		n = n.congNgay(k);
		n.in();
		
	}

}
