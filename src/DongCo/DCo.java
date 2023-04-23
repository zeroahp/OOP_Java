package DongCo;

import java.util.Scanner;

public class DCo {
	private String ten, ngay;
	private float dungtich;
	
	public DCo() {
		ten = new String();
		ngay = new String();
		dungtich = 0.0f;
	}
	
	public DCo(String t, String day, float dt) {
		ten = new String(t);
		ngay = new String(day);
		dungtich = dt;
	}
	
	public DCo(DCo x) {
		ten = new String(x.ten);
		ngay = new String(x.ngay);
		dungtich = x.dungtich;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten dong co:");
		ten = sc.nextLine();
		System.out.println("Nhap dung tich:");
		dungtich = sc.nextFloat();
		sc.nextLine();
		System.out.println("Nhap ngay thang nam san xuat:");
		ngay = sc.nextLine();
		
	}
	
	public void in() {
		System.out.println("Ten dong co: " + ten + "\nDung tich: "+ dungtich + "\nNSX: " +ngay);
	}
	
	public String toString() {
		return "Ten dong co: " + ten + "\nDung tich: "+ dungtich + "\nNSX: " +ngay;
	}
	
	public String getNgay() {
		return ngay;
	}
	public static void main(String[] args) {
		DCo d1 = new DCo();
		d1.nhap();
		
		DCo d2 = new DCo(d1);
		d2.in();
		
	}
}
