package buoi3;

import java.util.Scanner;

class SDSinhVien {

	public static void main(String[] args) {
//		SinhVien a = new SinhVien();
//		System.out.println("Nhap thong tinh cho sinh vien");
//		a.nhapThongTin();
//		a.nhapDiem();
//		System.out.println("Thong tin sinh vien "+a.toString());
//
//		a.themHocPhan("LTHDT", "A");
//		System.out.println("Sau khi them hoc phan LTHDT cho sinh vien:"+a.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien:");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		int i;
		for(i = 0; i < n ; i++){
			ds[i] = new SinhVien();
			System.out.println("Nhap thong tinh cho sinh vien thu "+(i+1));
			ds[i].nhap();
			ds[i].nhapDiem();
		}

		System.out.println("Thong tin cua "+n+" sinh vien vua nhap la:");
		for(SinhVien it:ds)
			System.out.println(it.toString());
		
		// sinh vien bi canh cao hoc vu
		System.out.println("Sinh vien bi canh bao hoc vu la :");
		for(i = 0; i < n ; i++){
			if(ds[i].diemTB() < 1)
				System.out.println(ds[i].layMaSo() + "-" + ds[i].HoTen());
			else {
				System.out.println("Khong co!");
				break;
			}
		}
		
		//sinh vien co diem tb cao nhat lop
		float max = Float.MIN_VALUE;
		String ten = " ";
		for(i = 0; i < n ; i++){
			if(ds[i].diemTB() >= max){
				max = ds[i].diemTB();
				ten += ds[i].HoTen()+", ";
			}
		}
		System.out.println("Sinh vien co diem trung binh cao nhat lop la: "+ten);

		//hien thi danh sach sinh vien theo ten
		System.out.println("Sap xep ten sinh vien:");
		SinhVien t = new SinhVien();
		for(i = 0; i < n-1 ; i++){
			for(int j = i+1; j < n ; j++){
				if(ds[i].layTen().compareTo(ds[j].layTen())>0)
					t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
			}
		}
		for(SinhVien s:ds){
			System.out.println(s.toString());
		}
	}
	
}
