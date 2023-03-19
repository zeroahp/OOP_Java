package buoi3;

import buoi2.Diem;

 class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		
		DoanThang AB = new DoanThang(A,B);
		System.out.print("Doan thang AB la:");
		AB.in();
		
		AB.tinhTien(5, 3);
		System.out.println("Doang thang AB sau khi tinh tien :"+AB.toString());
		
		DoanThang CD = new DoanThang();
		System.out.println("Tao doan thang CD");
		CD.nhap();
		System.out.print("Doan thang CD la:");
		CD.in();
		
		System.out.println("Do dai CD la: "+CD.doDai());
		
		System.out.println("Goc CD voi truc hoanh la: "+ CD.goc());


		
		

	}

}
