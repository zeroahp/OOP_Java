package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class SDDiemM {

	public static void main(String[] args) {
//		DiemM A = new DiemM(5,10,"trang");
//		System.out.print("Diem A : ");
//		A.in();
//		DiemM B = new DiemM();
//		B.nhap();
//		System.out.print("Diem B : ");
//		B.in();
//		B.tinhTien(10,8);
//		System.out.print("Diem B sau khi tinh tien : ");
//		B.in();
//		System.out.println("Gan mau vang cho B");
//		B.ganMau("vang");
//		B.in();
//		
		System.out.println("Nhap so diem can quan ly :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Diem ds[] = new Diem[n];
		int c;
		for(int i = 0; i < n ; i++) {
			System.out.println("Ban muon nhap diem (1) hay diem mau (2)");
			c = sc.nextInt();
			if(c == 1) ds[i] = new Diem();
			else  ds[i] = new DiemM();
			ds[i].nhap(); 
		}
		
		for(Diem x:ds) {
			System.out.println("Diem "+ x.toString());
		}
			
		
		
		
	}

}
