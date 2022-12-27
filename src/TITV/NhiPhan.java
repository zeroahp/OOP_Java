package TITV;

import java.util.Scanner;

public class NhiPhan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so can chuyen :");
		int n = sc.nextInt();
		String nhiPhan = "";
		while(n > 0)
		{
			nhiPhan = (n%2) + nhiPhan;
			n/=2;
		}
		System.out.println("So nhi phan co dang : "+nhiPhan);
	}

}
