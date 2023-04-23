package ChuyenXe;

import java.util.Scanner;

public class Xe {
	private String soxe, loaixe, ngay;
	private char tthai;
	Scanner sc = new Scanner(System.in);
	private int d,m, y;
	
	public Xe() {
		soxe = new String();
		loaixe = new String();
		ngay = new String();
		tthai = '\0';
	}
	
	public Xe(String so, String loai, String day, char tt) {
		soxe = new String(so);
		loaixe = new String(loai);
		ngay = new String(day);
		tthai = tt;	
		
		
	}
	
	
	
	public Xe(Xe g63) {
		soxe = new String(g63.soxe);
		loaixe = new String(g63.loaixe);
		ngay = new String(g63.ngay);
		tthai = g63.tthai;	
	}
	
	public void nhap() {
		System.out.println("Nhap so xe:");
		soxe = sc.nextLine();
		System.out.println("Nhap loai xe:");
		loaixe = sc.nextLine();
		System.out.println("Nhap ngay dang kiem:");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai cho phep luu hanh:");
		tthai = sc.next().charAt(0);
		
		String []arr = ngay.split("/");
		d = Integer.parseInt(arr[0]+arr[1]);
		m = Integer.parseInt(arr[0]);
		y = Integer.parseInt(arr[2]);
	}
	
	public int layThang()
	{
		return m;
	}
	
	public int laynam()
	{
		return y;
	}
	
	public void in() {
		System.out.println("Thong tin xe:");
		System.out.println("So xe: " + soxe + "\nLoai xe: " + loaixe + "\nNgay dang kiem: " +  ngay + "\nTrang thai: "+ tthai);
	}
	
	public String toString() {
		return "So xe: " + soxe + "\nLoai xe: " + loaixe + "\nNgay dang kiem: " +  ngay + "\nTrang thai: "+ tthai;
	}
	
	public char laytThai() {
		return tthai;
	}
	
	//hoTen.substring(hoTen.trim().lastIndexOf(" ")+1);
	//29/09/2002
	public String layNgay() {
		return ngay.substring(ngay.trim().indexOf("/")+1);
	}
	
	
	public static void main(String[] args) {
		Xe x1 = new Xe();
		x1.nhap();
		Xe x2 = new Xe(x1);
		x2.in();
	}
	
	
	
}
