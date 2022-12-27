package buoi1;

import java.util.Scanner;
import java.util.Arrays;

public class buoi1_bai8 {
	
	static int a[];
	static Scanner sc = new Scanner(System.in);
	
	public static void input()//ham nhap
	{
		int i;
		int n = sc.nextInt();
		System.out.println("Nhap cac phan tu :");
		a = new int[n];
		for(i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	public static int check()//ham kiem tra
	{
		int x = sc.nextInt();
		int cnt = 0;
		for (int it:a) {
			if(it == x) 
				cnt ++;
		}
		return cnt;
	}
	
	public void SapXep_Tang()//ham sap xep
	{
		int tmp;
		for(int i = 0; i< a.length-1; i++)
		{
			if(a[i] > a[i+1])
			{
				tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
	}
	
	public void print()//ham in
	{
		System.out.println("Danh sach co dang :");
		for(int it:a)
			System.out.print(it + " ");
			System.out.println();
	}
	
	public static void main(String[] args) {
		buoi1_bai8 A = new buoi1_bai8();
		System.out.println("Nhap so luong phan tu trong danh sach :");
		A.input();
		A.print();
		System.out.println("Nhap x :");
		System.out.println("Danh sach co "+A.check()+ " so x");
		System.out.println("Sau khi sap xep tang :");
		A.SapXep_Tang();
		A.print();
		
	}

}
