package buoi5;

import java.util.Scanner;

public class HoaDon {
	private ChiTiet c[];
	private KhachHang k;
	private Date d;
	Scanner sc = new Scanner(System.in);
	private String maso, tieude, nvien;
	private int soluong;
	private float tong = 0, giam = 0;
	
	public HoaDon(){
		k = new KhachHangVip();
		d = new Date();
		maso = new String();
		tieude = new String();
		nvien = new String();
		soluong = 0;
		c = new ChiTiet[100];
	}
	
	public HoaDon(HoaDon x){
		k = new KhachHangVip((KhachHangVip)x.k);
		d = new Date(x.d);
		maso = new String(x.maso);
		tieude = new String(x.tieude);
		nvien = new String(x.nvien);
		soluong = x.soluong;
		c = new ChiTiet[x.c.length];
		int i;
		for(i = 0; i < soluong ; i++){
			c[i] = new ChiTiet(x.c[i]);
		}
	}
		
	public void nhap(){
		System.out.println("Nhap ma so hoa don: ");
		maso = sc.nextLine();
		System.out.println("Nhap tieu de hoa don: ");
		tieude = sc.nextLine();
		System.out.println("Nhap ten nhan vien thanh toan: ");
		nvien = sc.nextLine();
		System.out.println("Nhap thong tin khach hang: ");
		k.nhap();
		System.out.println("Nhap so luong hang hoa:");
		soluong = sc.nextInt();
		System.out.println("Nhap thong tin chi tiet hang hoa: ");
		int i;		
		for(i = 0; i < soluong ; i++){
			System.out.println("Nhap thong tin thu "+ (i+1));
			c[i] = new ChiTiet();
			c[i].nhap();
			tong += c[i].laygia();
		}
		giam = tong  * k.laytileGiam();
		tong = tong - giam;
		System.out.println("Nhap thoi gian thanh toan:");
		d.nhap();
	}
	
	public void in(){
		System.out.println("=====================================");
		System.out.println("Hoa don: "+ maso);
		System.out.println("\t***" + tieude +"***");
		System.out.println("Nhan vien: "+ nvien);
		System.out.println("Thong tin khach hang:");
		k.in();
		System.out.println("So luong hang hoa: "+ soluong);
		int i;
		System.out.println("\t--------------------");
		for(i = 0; i < soluong ; i++){
			c[i].in();
			System.out.println("\t--------------------");
			
		}
		System.out.println("Ti le giam: "+k.laytileGiam()+ "%");
		System.out.println("Tong tien duoc giam: "+ giam + " VND");
		System.out.println("Tong tien thanh toan: "+ tong + " VND");

	}
	
	public void in2(){
		System.out.println("=====================================");
		System.out.println("Hoa don: "+ maso);
		System.out.println("\t***" + tieude +"***");
		System.out.println("Nhan vien: "+ nvien);
		System.out.println("Thong tin khach hang:");
		k.in();
		System.out.println("So luong hang hoa: "+ soluong);
		int i;
		System.out.println("\t--------------------");
		for(i = 0; i < soluong ; i++){
			c[i].in();
			System.out.println("\t--------------------");
			
		}
		System.out.println("Ti le giam: "+k.laytileGiam()+ "%");
		System.out.println("Tong tien duoc giam: "+ giam + " VND");
		System.out.println("Tong tien thanh toan: "+ tong + " VND");

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HoaDon hd = new HoaDon();
		hd.nhap();
		hd.in();
		float n;	
		System.out.println("Thanh toan tien mat: ");
		n = sc.nextFloat();
		hd.in2();
		System.out.println("So tien khach tra: " + n);
		System.out.println("Tien du: " + (n - hd.tong) + " VND");
		if(hd.tong >= 500000)
			System.out.println("Hoa don cua ban duoc tich +10 diem !");
		System.out.println("\tCam on quy khach!");
		System.out.println("=====================================");

	}

}
