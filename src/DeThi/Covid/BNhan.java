package Covid;

import java.util.Scanner;

public class BNhan {
	private String hten;
	private String gt;
	private boolean gtinh;
	private int nsinh;
	private float cnang;
	
	
	public BNhan() {
		hten = new String();
		gtinh = false;
		nsinh = 0;
		cnang = 0.0f;
		gt = new String();
	}
	
	public BNhan(String ten, boolean a, int nam, float can, String phai) {
		hten = new String(ten);
		gtinh = a;
		nsinh = nam;
		cnang = can;		
		gt = new String(phai);
	}
	
	public BNhan(BNhan a) {
		hten = new String(a.hten);
		gtinh = a.gtinh;
		gt = a.gt;
		nsinh = a.nsinh;
		cnang = a.cnang;		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten benh nhan:");
		hten = sc.nextLine();
		System.out.println("Nhap gioi tinh:");
		gtinh = sc.nextBoolean();
		if(gtinh == true) gt = "nu";
		else gt = "nam";
		System.out.println("Nhap nam sinh:");
		nsinh = sc.nextInt();
		System.out.println("Nhap can nang:");
		cnang = sc.nextFloat();
		
	}
	
	public void in() {
		System.out.println("Ho ten: " + hten + "\nGioi tinh: "+ gt + "\nNam sinh: " + nsinh + "\nCan nang: "+ cnang+"kg");
	}
	
	public String toString() {
		return "Ho ten: " + hten + "\nGioi tinh: "+ gt + "\nNam sinh: " + nsinh + "\nCan nang: "+ cnang+"kg";
	}
	
	public char layLoai() {
		return ' ';
	}
	
	public String layOdich() {
		return " ";
	}
	
	public String layTen() {
		return hten;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BNhan bn1 = new BNhan();
		bn1.nhap();
//		bn1.in();
		
		BNhan bn2 = new BNhan(bn1);
		bn2.in();
	}
}


















