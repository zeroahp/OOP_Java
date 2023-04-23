package de;

import java.util.Scanner;

//MSSV:		B2103561
//HT:		Do Van Suong
//De:		01
//So May:	18
public class DCo {
	private String ten, ngay;
	private float dtich;
	
	public DCo() {
		ten = new String();
		dtich = 0.0f;
		ngay = new String();
	}
	public DCo(DCo dc) {
		ten = new String(dc.ten);
		dtich = dc.dtich;
		ngay = new String(dc.ngay);
	}
	
	public void nhap() {
		System.out.println("Nhap ten dong co");
		Scanner sc = new Scanner(System.in);
		ten = sc.nextLine();
		System.out.println("Nhap dtich");
		dtich = sc.nextFloat();
		sc.nextLine();
		System.out.println("Nhap ngay san xuat(dd-MM-yyyy");
		ngay = sc.nextLine();
	}
	
	public void in() {
		System.out.println("Ten dong co: "+ten);
		System.out.println("Dung tich: " + dtich);
		System.out.println("Ngay san xuat: "+ngay);
	}
	
	public String getngay() {
		return ngay;
	}
	
	public String getten() {
		return ten;
	}
	
	public static void main(String[] args) {
		DCo d1 = new DCo();
		d1.nhap();
		System.out.println("Thong tin dong co 1: ");
		d1.in();
		
		DCo d2 = new DCo(d1);
		System.out.println("Thong tin dong co d2 sao chep tu d1");
		d2.in();
	}
}
