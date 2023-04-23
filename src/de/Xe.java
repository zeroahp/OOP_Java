package de;
import java.util.Scanner;

//MSSV:		B2103561
//HT:		Do Van Suong
//De:		01
//So May:	18
public class Xe {
	private String so, ten;
	private long gia;
	private char tthai;
	private DCo dc;
	
	public Xe() {
		so = new String();
		ten = new String();
		gia = 0;
		tthai = '\0';
		dc = new DCo();
	}
	
	public Xe(Xe x) {
		so = new String(x.so);
		ten = new String(x.ten);
		gia = x.gia;
		tthai = x.tthai;
		dc = new DCo(x.dc);
	}
	public long lePhi() {
		return (long)(gia*0.1);
	}
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap Bien so xe");
		so = sc.nextLine();
		System.out.println("Nhap ten chu xe");
		ten = sc.nextLine();
		System.out.println("Nhap gia tien");
		gia = sc.nextLong();
		sc.nextLine();
		System.out.println("Nhap Trang thai xe C/K");
		tthai = sc.next().charAt(0);
		System.out.println("Nhap thong tin dong co");
		dc.nhap();
	}
	
	public void in() {
		System.out.println("Bien so xe: 	"+so);
		System.out.println("Ten chu xe: 	"+ten);
		System.out.println("Gia tien: 		"+gia);
		System.out.println("Thai thai xe: 	"+tthai);
		dc.in();
	}
	public boolean ktra() {
		int m = Integer.parseInt(dc.getngay().substring(dc.getngay().indexOf("-")+1, dc.getngay().lastIndexOf("-")));
		int y = Integer.parseInt(dc.getngay().substring(dc.getngay().lastIndexOf("-")+1));
		if(y == 2000 && m < 10)
			return true;
		else if(y < 2000)
			return true;
		return false;
	}
	public String getso() {
		return so;
	}
	public char gettthai() {
		return tthai;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong doi tuong");
		int m = sc.nextInt();
		Xe ds1[] = new Xe[m];
		for(int i = 0; i < m ; i++) {
			ds1[i] = new Xe();
			ds1[i].nhap();
		}
		System.out.println("\n\nDS Thong tin xe va le phi truoc ba");
		for(int i = 0; i < m; i++) {
			System.out.println("Thong tin xe thu " +(i+1) +":");
			ds1[i].in();
			System.out.println("Le phi truoc ba: "+ds1[i].lePhi());
			
		}
		
		System.out.println("\n\nDS Bien so xe bij huy hoac co gia tri duoi 10000000");
		System.out.println("Xe do huy chuyen\n");
		for(int i = 0; i < m; i++) {
			if(ds1[i].tthai == 'K' || ds1[i].tthai == 'k') {
				System.out.println(ds1[i].so);
				System.out.println("\n");
			}
		}
		System.out.println("Do gia duoi 10000000");
		for(int i = 0; i < m; i++) {
			if(ds1[i].gia < 10000000) {
				System.out.println(ds1[i].so);
				System.out.println("\n");
			}
		}
		
		
		
		for(int i = 0; i < m; i++) {
			if(ds1[i].ktra()) {
				long tong = 0;
				for(int j = 0; j < m; j++) {
					if(ds1[j].dc.getten().equals(ds1[i].dc.getten() ))
						{tong += ds1[j].lePhi();}
				}
				System.out.println("Tong le phi truoc ba cua dong co " + ds1[i].dc.getten() + "duoc san xuat truoc thang 10/2000: " + tong);
			} else {
				System.out.println("Khong co dc truoc thang 10/2000");
			}
		}
		
	
		
	}
	
}
