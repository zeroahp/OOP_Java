package buoi3;

import java.util.Scanner;

import buoi3.Gach;

public class SDGach {

	public static void main(String[] args) {
		Gach gach = new Gach();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong loai gach :");
		int n = sc.nextInt();
		int i;
		Gach a[] = new Gach[n];
		for(i = 0; i < n ; i++)
		{
			System.out.println("Vien thu : "+(i+1));
			a[i] = new Gach();
			a[i].nhap();
			
		}
		
		for (Gach it:a)
		{
			it.hienThi();
			System.out.println(" ");
		}
		
		Gach min = a[0];
		float giamin = 0;
		float giathap = a[0].getGiaBan()/a[0].dienTichNen();
		for(i = 0 ; i < n ; i++)
		{
			giamin = a[i].getGiaBan()/a[i].dienTichNen();
			if(giathap > giamin)
			{
				giathap = giamin;
				min = a[i];
			}
		}
		System.out.println("Loai gach co chi phi thap nhat la : ");
		min.hienThi();
		
		System.out.println(" ");
		for(i = 0; i<n ;i++) 
		{
			System.out.println("Chi phi mua gach thu "+(i+1)+" khi lot dien tich"	+ " chieu dai la 20cm va chieu ngang la 5cm la : "+(float)(a[i].getGiaBan()*a[i].soLuongHop(20, 5)));

		}
		
		
	}

}
