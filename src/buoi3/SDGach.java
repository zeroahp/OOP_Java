package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong vien gach :");
		int n = sc.nextInt();
		Gach a[] = new Gach[n];
		
		int i;
		for( i= 0; i < n ; i++) {
			System.out.println("Nhap vien gach thu : " + (i+1));
			a[i] = new Gach();
			a[i].nhap();
		}
		
		for(Gach it:a) {
			it.hienThi();
		}
		

		float min = Float.MAX_VALUE;
		for(Gach g :a) {
			if((g.getGiaBan()/g.dienTichNen()) < min) {
				min = g.getGiaBan()/g.dienTichNen();
			}
		}
		
		System.out.println("Hop co chi phi thap nhat la:");
		for(Gach g :a) {
			if((g.getGiaBan()/g.dienTichNen()) == min) {
				g.hienThi();
			}
		}
		
		System.out.println("Chi phi thap nhat la :"+ min);
			
		
		System.out.println(" ");
		for(i = 0; i<n ;i++) 
		{
			System.out.println("Chi phi mua gach thu "+(i+1)+" khi lot dien tich"	+ " chieu dai la 20cm va chieu ngang la 5cm la : "+(float)(a[i].getGiaBan()*a[i].soLuongHop(20, 5)));

		}
	}

}
