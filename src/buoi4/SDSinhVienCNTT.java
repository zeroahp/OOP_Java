package buoi4;

import java.util.Scanner;
import buoi3.SinhVien;
import buoi2.Date;
class SDSinhVienCNTT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien ");
		int n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		int i,c;
		for(i = 0 ; i < n ;i++) {
			System.out.println("Nhap sinh vien thu "+(i+1));
    		ds[i] = new SinhVienCNTT();
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		
		for(i = 0 ; i < n ;i++) {
			System.out.println("Sinh vien thu " +(i+1)+" vua nhap la :");
			ds[i].in();
			System.out.println();
		}
		
		System.out.println("Nhap dia chi email can tim");
		sc.nextLine();
		String change = sc.nextLine();

		for(i = 0 ; i < n ;i++) {
			if(ds[i].layEmail().equals(change)) {
				System.out.println("Email vua tim la tai khoan sinh vien : "+ds[i].layTaiKhoan());
				System.out.println("Ket qua hoc tap : "+ds[i].diemTB());
			}
			else {
				System.out.println("Khong tim thay!");
				break;
			}
		}
		
		
	}


}
