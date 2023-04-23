package buoi5;

import java.util.Scanner;

public class HangHoa {

		private String maso, tensp, nsxuat;
		Scanner sc = new Scanner(System.in);
		
		public HangHoa(){
			maso = new String();
			tensp = new String();
			nsxuat = new String();
		}
		
		public HangHoa(String mso, String ten, String nsx){
			maso = new String(mso);
			tensp = new String(ten);
			nsxuat = new String(nsx);
		}
		
		public HangHoa(HangHoa d){
			maso = new String(d.maso);
			tensp = new String(d.tensp);
			nsxuat = new String(d.nsxuat);
		}
		
		public void nhap(){
			System.out.println("Nhap ma so san pham:");
			maso = sc.nextLine();
			System.out.println("Nhap ten san pham: ");
			tensp = sc.nextLine();
			System.out.println("Nhap ten nha san xuat:");
			nsxuat = sc.nextLine();
		}
		
		public void in(){
			System.out.println("Ma so: "+maso + " - San pham: " + tensp + "\nNha san xuat: " + nsxuat);
		}
		
		public String toString(){
			return "Ma so: "+maso + " - San pham: " + tensp + "\nNha san xuat: " + nsxuat;
		}
}

