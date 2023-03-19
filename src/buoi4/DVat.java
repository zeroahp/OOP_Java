package buoi4;

import java.util.Scanner;

public abstract class DVat {
	private String ten,giong, mauLong;
	private float cannang;
	public abstract void keu();
	Scanner sc = new Scanner(System.in);
	public DVat(){
		ten = new String();
		giong =  new String();
		mauLong = new String();
		cannang = 0.0f;
	}
	
	public DVat(String t,String g, String mau, float can) {
		ten = new String(t);
		giong =  new String(g);
		mauLong = new String(mau);
		cannang = can;
	}
	
	public DVat(DVat a) {
		ten = new String(a.ten);
		giong =  new String(a.giong);
		mauLong = new String(a.mauLong);
		cannang = a.cannang;
	}
	
	public void nhap() {
		System.out.print("Nhap giong :");
		giong = sc.nextLine();
		System.out.print("Nhap mau long :");
		mauLong = sc.nextLine();
		System.out.print("Nhap can nang :");
		cannang = sc.nextFloat();
	}

	public void ganTen(String t) {
		ten = new String(t);
	}
	
	public void in() {
		System.out.println("Ten thu cung : " + ten);
		System.out.println("Giong : " +giong);
		System.out.println("Mau long : " +mauLong);
		System.out.println("Can nang : " +cannang);

	}
	
	

}
