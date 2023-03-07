package buoi3;

import java.util.Scanner;
import buoi2.Diem;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		A.khoangCach();
		Diem B = new Diem(20,35);
		B.khoangCach();
		
		DoanThang AB =  new DoanThang(A,B);
		System.out.println("Doan thang AB :" + AB.toString());

		AB.doDai();
		AB.tinhTien(5, 3);
		System.out.println("Doan thang AB khi tinh tien doan(5,3) la: "+ AB.toString());

		DoanThang CD = new DoanThang();
		CD.nhap();
		CD.doDai();
		System.out.println("Do dai CD la : " +  CD.doDai());
		
	}

}
