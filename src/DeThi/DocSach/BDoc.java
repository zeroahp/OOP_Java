package DocSach;

import java.util.Scanner;

public class BDoc {
	private int msbd;
	private String tenbd, ngsinh;
	private boolean VIP;
	
	public BDoc(){
		msbd = 0;
		VIP = false;
		tenbd = new String();
		ngsinh = new String();
	}
	
	public BDoc(BDoc a){
		msbd = a.msbd;
		VIP = a.VIP;
		tenbd = new String(a.tenbd);
		ngsinh = new String(a.ngsinh);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so ban doc sach:");
		msbd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten:");
		tenbd = sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngsinh = sc.nextLine();
		System.out.println("Co phai la thanh vien khong:");
		VIP = sc.nextBoolean();
	}
	
	public void xuat() {
		System.out.println("Ma so: " + msbd + "\nTen: " + tenbd + "\nNgay sinh: "+ ngsinh + "\nThanh vien: " + VIP);
	}
	
	public String toString(){
		return "Ma so: " + msbd + "\nTen: " + tenbd + "\nNgay sinh: "+ ngsinh + "\nThanh vien: " + VIP;
	}
	
	public int getMaso() {
		return msbd;
	}
	public String getTen() {
		return tenbd;
	}
	
	public static void main(String[] args) {
		BDoc bd1 = new BDoc();
		bd1.nhap();
//		bd1.xuat();
		
		BDoc bd2 = new BDoc(bd1);
		bd2.xuat();
	}
}


















