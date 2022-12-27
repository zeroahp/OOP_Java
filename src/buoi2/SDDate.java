package buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		Date date = new Date(15, 1, 2003);
		Scanner sc = new Scanner(System.in);
		System.out.println("Ngay ban nhap la :");
		date.printDay();
		
		System.out.println("Ngay hom sau la ngay ");
		Date date_tomorrow = date.ngayHomSau();
		date_tomorrow.printDay();
		
		System.out.println("Nhap so can cong vao ngay : ");
		int n = sc.nextInt();
		System.out.println("Ngay sau khi cong "+n+" ngay vao la :");
		date = date.congNgay(n);
		date.printDay();

	}

}
