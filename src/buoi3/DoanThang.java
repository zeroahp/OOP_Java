package buoi3;

import java.util.Scanner;

import buoi2.Diem;
public class DoanThang {
	private Diem d1, d2;
	Scanner sc = new Scanner (System.in);

	public DoanThang(){
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem a, Diem b){
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	
	public DoanThang(DoanThang d){
		d1 = new Diem(d.d1);
		d2 = new Diem(d.d2);
	}
	
	public void nhap(){
		System.out.println("Nhap diem thu nhat");
		d1.nhap();
		System.out.println("Nhap diem thu hai");
		d2.nhap();
	}
	
	public void in(){
		System.out.println("["+d1+","+d2+"]");
	}
	
	public String toString(){
		return "["+d1+","+d2+"]";
	}
	
	public void tinhTien(int x, int y){
		d1.tinhTien(x, y);
		d2.tinhTien(x, y);
	}
	
	public float doDai(){
		return d1.khoangCach(d2);
	}
	
	public double goc(){
		return Math.acos(Math.abs(d1.giaTriX()-d2.giaTriX())/doDai());
	}
	
}
