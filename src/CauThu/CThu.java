package CauThu;

import java.util.Scanner;

public class CThu extends Cnguoi {
	private int so;
	private String vtri, mua, clbo;
	private long bthang;
	
	public CThu() {
		super();
		so = 0;
		bthang = 0;
		vtri = new String();
		mua = new String();
		clbo = new String();
	}
	
	public CThu(String cd, String ht, String day , char c,int soao, long bth, String vt, String muagiai, String clb) {
		super(cd, ht, day, c);
		so = soao;
		bthang = bth;
		vtri = new String(vt);
		mua = new String(muagiai);
		clbo = new String(clb);
	}
	
	public CThu(CThu x) {
		super((Cnguoi)x);
		so = x.so;
		bthang = x.bthang;
		vtri = new String(x.vtri);
		mua = new String(x.mua);
		clbo = new String(x.clbo);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap so ao:");
		so = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vi tri:");
		vtri = sc.nextLine();
		System.out.println("Nhap mua giai:");
		mua = sc.nextLine();
		System.out.println("Nhap cau lac bo:");
		clbo = sc.nextLine();
		System.out.println("Nhap so ban thang:");
		bthang = sc.nextLong();
	}
	
	public void in() {
		super.in();
		System.out.println("So ao: "+ so + "\nVi tri: " + vtri + "\nMua giai: " + mua + "\nCLB: " + clbo + "\nSo ban thang: "+bthang);
	}
	
	public String toString() {
		return super.toString() + "So ao: "+ so + "\nVi tri: " + vtri + "\nMua giai: " + mua + "\nCLB: " + clbo + "\nSo ban thang: "+bthang;
	}
	
	public long tinhLuong() {
		long luong = 0;
		long luongcb = 7000000;
		if(vtri.equals("thu mon")) 
			luong  = luongcb + 3000000 + (bthang*500000);
		else if(vtri.equals("hau ve"))
			luong  = luongcb + 4000000 + (bthang*500000);
		else if(vtri.equals("trung ve"))
			luong  = luongcb + 4500000 + (bthang*500000);
		else if(vtri.equals("tien ve"))
			luong  = luongcb + 5000000 + (bthang*500000);
		else if(vtri.equals("tien dao"))
			luong  = luongcb + 7000000 + (bthang*500000);
		
		return luong;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so doi tuong:");
		int n = sc.nextInt();
		Cnguoi ds[] = new Cnguoi[n];
		
		int i,c;
		for(i = 0; i <n ; i++) {
			System.out.println("Ban muon nhap con nguoi(1) hay cau thu(2):");
			c = sc.nextInt();
			if(c == 1) ds[i] = new Cnguoi();
			else if(c == 2) ds[i] = new CThu();
			ds[i].nhap();
		}
		int x =0;
		for(i = 0; i <n ; i++){
			if(ds[i].tinhLuong() != 0) {
				System.out.println("Tien luong cua cau thu thu " + (x+1));
				System.out.println(ds[i].tinhLuong());
				x++;
			}
		}
		
		

		
	}
	
	
}
