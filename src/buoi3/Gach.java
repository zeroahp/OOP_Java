package buoi3;

import java.util.Scanner;

public class Gach {
	private String maso, mau;
	private int soLuong, chieuDai, chieuNgang;
	private long giaBan;
	Scanner sc = new Scanner(System.in);
	
	public Gach()
	{
		this.maso = " ";
		this.mau = " ";
		this.soLuong = this.chieuDai = this.chieuNgang = 0;
		this.giaBan = 0;
	}
	
	public Gach(String maso, String mau, int soluong, int chieudai, int chieungang, long gia)
	{
		this.maso = maso;
		this.mau = mau;
		this.soLuong = soluong;
		this.chieuDai = chieudai;
		this.chieuNgang = chieungang;
		this.giaBan = gia;
	}
	
	public void nhap()
	{
		System.out.println("Nhap ma so :");
		this.maso = sc.nextLine();
		System.out.println("Nhap mau :");
		this.mau = sc.nextLine();
		System.out.println("Nhap so luong :");
		this.soLuong = sc.nextInt();
		System.out.println("Nhap chieu dai :");
		this.chieuDai = sc.nextInt();
		System.out.println("Nhap chieu ngang :");
		this.chieuNgang = sc.nextInt();
		System.out.println("Nhap gia ban :");
		this.giaBan = sc.nextLong();
	}
	
	public void hienThi()
	{
		System.out.println("THONG TIN");
		System.out.println("Ma so : "+ this.maso);
		System.out.println("Mau : "+this.mau);
		System.out.println("So luong : "+this.soLuong);
		System.out.println("Chieu dai : "+this.chieuDai);
		System.out.println("Chieu ngang : "+this.chieuNgang);
		System.out.println("Gia ban : "+this.giaBan);
	}
	
	public float giaBanLe()
	{
		return (float)(this.giaBan * (1.2));
	}
	
	public float dienTichNen()
	{
		return (float)(this.soLuong * this.chieuDai * this.chieuNgang);
	}
	
	public int soLuongHop(int D, int N)
	{
		return (int)Math.ceil((D*N)/(this.chieuDai * this.chieuNgang));
	}
	
	public long getGiaBan()
	{
		return this.giaBan;
	}
	
}
























