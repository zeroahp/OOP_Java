package HangHoa;

import java.util.Scanner;

public class HHoa {
	private int mhh, slg;
	private String ten;
	private float dgia;
	
	public HHoa() {
		mhh = 0;
		slg = 0;
		ten = new String();
		dgia =0.0f;
	}
	
	public HHoa(int ma, int sluong, String tenhh, float gia) {
		mhh = ma;
		slg = sluong;
		ten = new String(tenhh);
		dgia = gia;
	}
	
	public HHoa(HHoa a) {
		mhh = a.mhh;
		slg = a.slg;
		ten = new String(a.ten);
		dgia = a.dgia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma hang hoa:");
		mhh = sc.nextInt();
		System.out.println("Nhap so luong:");
		slg = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten hang hoa:");
		ten = sc.nextLine();
		System.out.println("Nhap don gia:");
		dgia = sc.nextFloat();
	}
	
	public void in() {
		System.out.println("Ma: " + mhh + "\nSo luong: " + slg + "\nTen: " + ten + "\nDon gia: " + dgia);
	} 
	
	public String toString() {
		return "Ma: " + mhh + "\nSo luong: " + slg + "\nTen: " + ten + "\nDon gia: " + dgia;
	}
	
	public float layGia() {
		return dgia;
	}
	

	public char layDD() {
		return ' ';
	}
	
	public String layTen() {
		return ten;
	}
	
	public String getNgay() {
		return " ";
	}
	
	public static void main(String[] args) {
		HHoa hh1 = new HHoa();
		hh1.nhap();
//		hh1.in();
		
		HHoa hh2 = new HHoa(hh1.mhh, hh1.slg, hh1.ten, hh1.dgia);
		hh2.in();
//		hh2.getTen();
	}
}
