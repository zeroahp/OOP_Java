package buoi5;

import java.util.Scanner;

public class KhachHang {
	Scanner sc = new Scanner(System.in);
	private String maso, hoten, gt;
	private boolean gtinh;
	
	public KhachHang(){
		maso = new String();
		hoten = new String();
		gtinh = false;
	}
	
	public KhachHang(String mso, String hten, boolean b){
		maso = new String(mso);
		hoten = new String(hten);
		gtinh = b;
	}
	
	public KhachHang(KhachHang a){
		maso = new String(a.maso);
		hoten = new String(a.hoten);
		gtinh = a.gtinh;
	}
	
	public void nhap(){
		System.out.println("Nhap ma so khach hang:");
		maso = sc.nextLine();
		System.out.println("Nhap ten khach hang: ");
		hoten = sc.nextLine();
		System.out.println("Nhap gioi tinh khach hang:");
		gtinh = sc.nextBoolean();
		if(gtinh == true) gt = "nu";
		else gt = "nam";
	}
	
	public void in(){
		System.out.println("Ma so: " + maso + "\nHo ten: " + hoten + " - Gioi tinh: " + gt);
	}
	
	public String toString(){
		return "Ma so: " + maso + "\nHo ten: " + hoten + " - Gioi Tinh" + gtinh;
	}
	public float laytileGiam(){
		return 1;
	}
}

