package CauThu;

import java.util.Scanner;


public class Cnguoi {
	
	private String id, hten, ngay;
	private char phai;
	Scanner sc = new Scanner(System.in);
	
	public Cnguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = '\0';
	}
	
	public Cnguoi(String cmnd, String ht, String day, char c) {
		id = new String(cmnd);
		hten = new String(ht);
		ngay = new String(day);
		phai = c;
	}
	
	public Cnguoi(Cnguoi K) {
		id = new String(K.id);
		hten = new String(K.hten);
		ngay = new String(K.ngay);
		phai = K.phai;
	}
	
	public void nhap() {
		System.out.println("Nhap so can cuoc cong dan:");
		id = sc.nextLine();
		System.out.println("Nhap ho va ten:");
		hten = sc.nextLine();
		System.out.println("Nhap ngay thang nam sinh:");
		ngay = sc.nextLine();
		System.out.println("Nhap gioi tinh:");
		phai = sc.next().charAt(0);
	}
	
	public void in() {
		System.out.println("So can cuoc: "+ id + "\nHo ten: " + hten + "\nNgay sinh: " + ngay + "\nGioi tinh: "+phai);
	}
	
	public String toString() {
		return "So can cuoc: "+ id + "\nHo ten: " + hten + "\nNgay sinh: " + ngay + "\nGioi tinh: "+phai;
	}
	
	public static void main(String[] args) {
		Cnguoi c1 = new Cnguoi();
		c1.nhap();
		
		Cnguoi c2 = new Cnguoi(c1);
		System.out.println("Thong tin:");
		c2.in();
	}
	
	public long tinhLuong() {
		return 0;
	}
	
}
