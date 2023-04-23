package buoi5;

import java.util.Scanner;

public class ChiTiet {
	Scanner sc = new Scanner(System.in);
	private HangHoa d;
	private int sluong;
	private long dongia;
	
	public ChiTiet(){
		d = new HangHoa();
		sluong = 0;
		dongia = 0;
	}
	
	public ChiTiet(HangHoa a, int n, long m){
		d = new HangHoa(a);
		sluong = n;
		dongia = m;
	}
	
	public ChiTiet(ChiTiet c){
		d = new HangHoa(c.d);
		sluong = c.sluong;
		dongia = c.dongia;
	}
	
	public void nhap(){
		d.nhap();
		System.out.println("Nhap so luong hang hoa: ");
		sluong = sc.nextInt();
		System.out.println("Nhap don gia san pham: ");
		dongia = sc.nextLong();
	}
	
	public void in(){
		d.in();
		System.out.println("So luong: " + sluong + "\nTong don gia: " + dongia*sluong +" VND");
	}
	
	public String toString(){
		return d + "So luong: " + sluong + "\nDon gia: " + dongia;
	}
	
	public float laygia(){
		return dongia*sluong;
	}
	
}
