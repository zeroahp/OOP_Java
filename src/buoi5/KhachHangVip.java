package buoi5;

import java.util.Scanner;

public class KhachHangVip extends KhachHang {
	private float tileGiam;
	Scanner sc = new Scanner(System.in);
	private String checkKH;
	
	public KhachHangVip(){
		super();
		tileGiam = 0.0f;
	}
	
	public KhachHangVip(float a, String maso, String hten, boolean c ){
		super(maso,hten,c);
		tileGiam = a;
	}
	
	public KhachHangVip(KhachHangVip v){
		super((KhachHang)v);
		tileGiam = v.tileGiam;
	}
	
	public void nhap(){
		super.nhap();
		System.out.println("Co phai khach hang Vip khong? (Y/N)");
		checkKH = sc.nextLine();
		if(checkKH.equals("Y")){
			System.out.println("Nhap ti le giam: ");
			tileGiam = sc.nextFloat();
		}
	}
	
	public float laytileGiam(){
		return tileGiam/100;
	}
	
	public void in(){
		super.in();
		System.out.println("Ti le giam: " +tileGiam);
	}
	
	public String toString(){
		return super.toString() + "Ti le giam: " +tileGiam;
	}
}
