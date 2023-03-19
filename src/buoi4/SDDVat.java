package buoi4;

import java.util.Scanner;

public class SDDVat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong con vat :");
		int n =  sc.nextInt();
		DVat ds[] = new DVat[n];
		
		int c;
		int i;
		for( i = 0 ; i < n ;i++) {
			System.out.println("Ban muon nhap Bo(1), Heo(2), hay Cho(3) ?");
			c = sc.nextInt();
			if( c == 1) 
				{
					ds[i] = new Bo();
					ds[i].ganTen("Bo");
				}
			else if( c == 2 ) 
				{	
					ds[i] = new Heo();
					ds[i].ganTen("Heo");
				}
			else 
				{	
					ds[i] = new Cho();
					ds[i].ganTen("Cho");
				}
			
			ds[i].nhap();
		}
		
		System.out.println("Danh sach cac con vat vua nhap la:");
		for(DVat it : ds) {
			it.in();
			System.out.println();
		}

	}

}
