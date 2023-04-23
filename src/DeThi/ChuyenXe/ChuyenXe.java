package ChuyenXe;

import java.util.Map;
import java.util.Scanner;


public class ChuyenXe {
	private int mso;
	private String tenlx, nden;
	private float dthu;
	private Xe a;
	Scanner sc = new Scanner(System.in);
	
	public ChuyenXe() {
		mso = 0;
		dthu = 0.0f;
		tenlx = new String();
		nden = new String();
		a = new Xe();
	}
	
	public ChuyenXe(int maso, float doanhthu, String ten, String noi, Xe b) {
		mso = maso;
		dthu = doanhthu;
		tenlx = new String(ten);
		nden = new String(noi);
		a = new Xe(b);
	}
	
	public ChuyenXe(ChuyenXe x) {
		mso = x.mso;
		dthu = x.dthu;
		tenlx = new String(x.tenlx);
		nden = new String(x.nden);
		a = new Xe(x.a);
	}
	
	public void nhap() {
		System.out.println("Nhap thong tin xe:");
		a.nhap();
		System.out.println("Nhap ma so chuyen xe:");
		mso = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten nguoi lai xe:");
		tenlx = sc.nextLine();
		System.out.println("Nhap noi den:");
		nden = sc.nextLine();
		System.out.println("Nhap doanh thu:");
		dthu = sc.nextFloat();
	}
	
	public void in() {
		System.out.println(a + "\nMa so chuyen xe: "+ mso + "\nTai xe: " + tenlx + "\nNoi den: "+ nden+ "\nDoanh thu: " + dthu);
	}
	
	public String toString() {
		return a + "\nMa so chuyen xe: "+ mso + "\nTai xe: " + tenlx + "\nNoi den: "+ nden+ "\nDoanh thu: " + dthu;
	}
	
	public float layDoanhThu() {
		return dthu;
	}
	
	
	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong chuyen xe:");
		m = sc.nextInt();
		
		ChuyenXe ds[] = new ChuyenXe[m];
		int i;
		for(i = 0 ; i < m; i++) {
			System.out.println("Nhap chuyen xe thu "+ (i+1));
			ds[i] = new ChuyenXe();
			ds[i].nhap();

		}
		
		System.out.println("Cac chuyen xe bi huy lan luot la:");
		for(i = 0 ; i < m; i++) {
			if(ds[i].a.laytThai() == 'K' || ds[i].dthu < 100000) {
				System.out.println(ds[i].mso);
			}
		}
		
//		float sum = 0;
//		System.out.println("Tong loi nhuan theo thang - nam:");
//		for(i = 0 ; i < m; i++) {
//			if(ds[i].a.layNgay().equals(ds[i+1].a.layNgay())) {
//				System.out.println("thu: " + (i+1));
//				sum += ds[i].layDoanhThu();
//			}
//		}
		
		
		
	}
	
	
}










