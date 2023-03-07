package buoi3;

import java.util.Scanner;

import buoi2.Diem;

public class DoanThang {
	
	private Diem d1, d2;
	Scanner sc = new Scanner(System.in);
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem x, Diem y) {
		d1 = new Diem(x);
		d2 = new Diem(y);
	}
	
	public DoanThang(DoanThang d3) {
		d1 = new Diem(d3.d1);
		d2 = new Diem(d3.d2);
	}
	
	public void nhap() {
		System.out.println("Nhap toa do cho diem thu 1:");
		d1.nhapDiem();
		System.out.println("Nhap toa do cho diem thu 2:");
		d2.nhapDiem();
	}
	
	public String toString() {
		return "[" + d1 + "," + d2 + "]";
	}
	
	public void tinhTien(int dx, int dy) {
		d1.tinhTien(dx, dx);
		d2.tinhTien(dx, dy);
	}
	
	public float doDai() {
		return d1.khoangCachDiem(d2);
	}
	
	
	
	
	
	
	
	
	
}























