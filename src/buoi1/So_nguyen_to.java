package buoi1;

import java.util.Scanner;

public class So_nguyen_to {
	
	public static boolean SNT(int n) {
		for(int i = 2; i*i<n ; i++) 
			if(n % i == 0) return false;
		return n >1;
	}
	
	public static void Nhi_Phan(int n){
		int i = 0,temp , cnt = 0;
		int a[] = new int[100];
		while(n != 0) {
			temp = n %2;
			n/=2;
			a[i++] = temp;
			cnt++;
		}
		for(i = cnt; i>=0 ; i--) {
			System.out.print(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(SNT(n)) System.out.print(n + " la so nguyen to co dang ");
		
		else System.out.print(n + " khong la so nguyen to co dang ");
		
		Nhi_Phan(n);
		
	}
	
	
}
