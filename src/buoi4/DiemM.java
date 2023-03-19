package buoi4;

import java.util.Scanner;

import buoi2.Diem;
public class DiemM extends Diem{
	private String mau;
	Scanner sc = new Scanner(System.in);
	public DiemM() {
		super();
		mau = new String();
	}
	
	public DiemM(int x, int y, String mau1) {
		super(x,y);
		mau = new String(mau1);
	}
	
	public DiemM(DiemM m) {
		super((Diem)m);
		mau = new String(m.mau);
	}
	
	public void ganMau(String gmau) {
		mau = new String(gmau);
	}
	
	public void nhap() {//nap de
		super.nhap();
		System.out.println("Nhap mau :");
		mau = sc.nextLine();	
	}
	
	public void in() {
		super.in();
		System.out.println(" mau : " + mau);
	}
	
	public String toString() {
		
		return super.toString() + "mau : " + mau;
	}
	
	
	

	
}
