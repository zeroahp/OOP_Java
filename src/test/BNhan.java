package test;

import java.util.Scanner;

public class BNhan {

	private String hten;
	private boolean gtinh;
	private int nsinh;
	private float cnang; 
	
	public BNhan()
	{
		hten = new String();
		gtinh = false;
		nsinh = 0;
		cnang = 0.0f;
	}
	
	public BNhan(BNhan b)
	{
		hten = new String(b.hten);
		gtinh = b.gtinh;
		nsinh = b.nsinh;
		cnang = b.cnang;
	}
	
	public String layodich()
	{
		return "";
	}
	
	public String layNgay()
	{
		return "";
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ho ten");
		this.hten = sc.nextLine();
		
		System.out.println("Nhap gioi tinh ");
		this.gtinh = sc.nextBoolean();
		
		System.out.println("Nhap nam sinh");
		this.nsinh = sc.nextInt();
		
		System.out.println("Nhap can nang");
		this.cnang = sc.nextFloat();
	}
	
	public void in()
	{		
		System.out.println("Ho ten: " + hten);
		System.out.println("Gioi tinh: " + gtinh);
		System.out.println("Nam sinh: " + nsinh);
		System.out.println("Can nang: " + cnang);
	}
	
//================================================
	public static void main(String[] args) {
		
		BNhan bn1 = new BNhan();
		bn1.nhap();
		bn1.in();
		
		BNhan bn2 = new BNhan(bn1);
		bn2.in();

	}

}






