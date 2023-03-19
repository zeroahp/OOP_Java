package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		System.out.println("Phan so a co dang :");
		a.in();
		System.out.println("Phan so b co dang :");
		b.in();
		
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		
		System.out.println("Tao phan so x");
		x.nhap();
		System.out.println("Tao phan so y");
		y.nhap();
		
		System.out.print("Nghich dao cua phan so x la :");
		x.nghichDao();
		
		System.out.print("Tong x + y = ");
		x.cong(y).in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cho mang ");
		int n = sc.nextInt();
		PhanSo s[] = new PhanSo[n];
		PhanSo tong = new PhanSo();
		int i;
		for( i = 0 ; i<n ;i++){
			System.out.println("Nhap phan so thu "+(i+1));
			s[i] = new PhanSo();
			s[i].nhap();
		}
		
		// tinh tong n phan so
		tong = s[0];
		for( i = 1 ; i<s.length ;i++){
			tong = tong.cong(s[i]);
		}
		System.out.print("Tong n phan so la " );
		tong.in();
		
		//tim phan so lon nhat
		PhanSo max = new PhanSo(Integer.MIN_VALUE, Integer.MAX_VALUE);
		for( i = 1 ; i<n ;i++){
			if(s[i].lonHon(max))
				max = s[i];
		}
		System.out.print("Phan so lon nhat trong mang la : ");
		max.in();
		
		//sap xep tang
		int j;
		PhanSo temp = new PhanSo();
		for( i = 0 ; i<n-1 ;i++){
			for( j = i+1 ; j<n ;j++){
				if(s[i].lonHon(s[j])){
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}		
		
		System.out.println("Mang sau khi sap xep tang :");
		for(i = 0 ; i<n ;i++){
			s[i].in();
		}

	}
}


