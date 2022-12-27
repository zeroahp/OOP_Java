package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		System.out.print("Phan so a la : ");
		a.hienThi();
		PhanSo b = new PhanSo(4,9);
		System.out.print("Phan so b la : ");
		b.hienThi();
		
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so x");
		x.nhapPhanSo();
		System.out.println("Nhap phan so y");
		y.nhapPhanSo();
		
		System.out.print("Gia tri nghich dao cua phan so x la : ");
		x.nghichDao();
		
		System.out.print("Tong : x + y = ");
		x.cong(y).hienThi();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan so : ");
		int n = sc.nextInt();
		int i;
		PhanSo c[] = new PhanSo[n];
		PhanSo sum = new PhanSo();
		PhanSo max = new PhanSo(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for(i = 0 ; i < n ; i++)
		{
			System.out.println("Nhap phan so "+(i+1));
			c[i] = new PhanSo();
			c[i].nhapPhanSo();	
		}
		
		sum = c[0];
		for(i = 1 ; i < n ; i++)
		{
			sum = sum.cong(c[i]);
			if(c[i].lonHon(max)) max = c[i]; 
			
		}
		System.out.print("Tong cua n phan so la : ");
		sum.hienThi();
		System.out.print("Phan so lon nhat la : ");
		max.hienThi();
		PhanSo temp = new PhanSo();
		for (i = 0; i < n; i++)
//			for (int j = i+1; j < n; j++)
//				if (c[i].giaTriThuc() > c[j].giaTriThuc())
//				{
//					temp = c[i];
//					c[i] = c[j];
//					c[j] = temp;
//				}
		
		if(c[i].giaTriThuc() > c[i+1].giaTriThuc())
		{
			temp = c[i];
		 	c[i] = c[i+1];
		 	c[i+1] =temp;
	 	}
		
		System.out.println("Sap xep tang : ");
		for(PhanSo it:c)
		{
			it.hienThi();
		}	
		
		
			
	}	

	


}
