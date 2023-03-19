package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong vien gach");
		int n = sc.nextInt();
		Gach ds[] = new Gach[n];
		int i;
		for(i = 0; i < n ; i++){
			ds[i] = new Gach();
			System.out.println("Nhap vien gach thu "+(i+1));
			ds[i].nhap();
		}
		for(Gach it:ds)
			it.in();
		
		System.out.print("gach co chi phi lot thap nhat la ");
		float min = Float.MAX_VALUE;
		
		for(Gach g:ds)
			if(g.getGia()/g.dienTich() < min)
				min = g.getGia()/g.dienTich();
		System.out.println("voi gia :"+min+" la:");
		for(Gach g:ds)
			if(g.getGia()/g.dienTich() == min)
				g.in();
		
		System.out.println("Chi phi mua gach chieu ngang 5m, va chieu dai 20m");
		for(i = 0; i < n ; i++){
			System.out.println("Vien thu "+(i+1) + " la " + ds[i].soLuongHop(5, 20)*ds[i].getGia()+" dong");
		}
			
		
	}

}
