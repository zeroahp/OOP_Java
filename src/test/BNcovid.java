package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class BNcovid extends BNhan {

	private String ngay, odich, noi;
	private char loai;
	
	public BNcovid() 
	{
		super();
		ngay = new String();
		odich = new String();
		noi = new String();
		loai = '\0';
	}
	
	public BNcovid(BNcovid b)
	{
		super(b);
		this.ngay = new String(b.ngay);
		this.odich = new String(b.odich);
		this.noi = new String(b.noi);
		this.loai = b.loai;
	}
	
	public String layodich()
	{
		return this.odich;
	}
	
	public String layNgay()
	{
		return this.ngay;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		
		super.nhap();
		
		System.out.println("Nhap ngay, thang, nam cach ly");
		ngay = sc.nextLine();
		
		System.out.println("Nhap ten o dich");
		odich = sc.nextLine();
		
		System.out.println("Nhap noi cach ly");
		noi = sc.nextLine();
		
		System.out.println("Nhap loai nguoi nhiem (ki tu)");
		loai = sc.next().charAt(0);
	}
	
	public void in()
	{		
		super.in();
		System.out.println("Ngay, thang, nam cach ly: " + ngay);
		System.out.println("Ten o dich: " + odich);
		System.out.println("Noi cach ly: " + noi);
		System.out.println("Loai nguoi nhiem: " + loai);
	}
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so luong benh nhan");
		int n = sc.nextInt();
		BNhan bn[];
		bn = new BNhan[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhap thong tin benh nhan thu " + (i+1));
			System.out.println("Nhap (0): Benh nhan - (1): Benh nhan Covid");
			int check = sc.nextInt();
			if (check == 0)
			{
				bn[i] = new BNhan();
				bn[i].nhap();
			}
			else if (check == 1)
			{
				bn[i] = new BNcovid();
				bn[i].nhap();
			}
		}
		
		for(BNhan it : bn)
		{
			System.out.println("Thong tin benh nhan: ");
			it.in();
			System.out.println();
		}
		
//		System.out.println("Danh sach cac benh nhan thuoc o dich cong ty Hosiden:");
//		for (int i = 0; i < n; i++)
//			if (bn[i].layodich().equals("Cong ty Hosiden"))
//				bn[i].in();
//		
//		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		
		System.out.println();
		System.out.println("Danh sach cac benh nhan het thoi han cach ly:");
		for (int i = 0; i < n; i++)
		{
			try {
				Date d1 = formatter.parse(bn[i].layNgay());
				Date ngaykt = formatter.parse("18-05-2022");
				
				boolean b = d1.before(ngaykt);
				if (b) bn[i].in();
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}

}












