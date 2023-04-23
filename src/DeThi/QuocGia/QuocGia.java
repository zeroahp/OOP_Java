package QuocGia;

import java.util.Scanner;


public class QuocGia {
	private String msqg, tenqg, tenthudo;
	private float GDP;
	
	public QuocGia() {
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 0.0f;
	}
	
	public QuocGia(QuocGia x) {
		msqg = new String(x.msqg);
		tenqg = new String(x.tenqg);
		tenthudo = new String(x.tenthudo);
		GDP = x.GDP;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so quoc gia");
		msqg = sc.nextLine();
		System.out.println("Nhap ten quoc gia");
		tenqg = sc.nextLine();
		System.out.println("Nhap ten thu do");
		tenthudo = sc.nextLine();
		System.out.println("Nhap GDP");
		GDP = sc.nextFloat();
	}
	
	
	public void in() {
		System.out.println("Ma so: "+ msqg + "\nTen quoc gia: "+tenqg+"\nTen thu do: "+ tenthudo + "\nGDP: "+ GDP);
	}
	
	public String toString() {
		return "Ma so: "+ msqg + "\nTen quoc gia: "+tenqg+"\nTen thu do: "+ tenthudo + "\nGDP: "+ GDP;
	}
	
	public char getChauLuc() {
		return ' ';
	}
	
	public String gettenQG() {
		return tenqg;
	}
	
	public float getGDP() {
		return GDP;
	}
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		qg1.in();
		
		QuocGia qg2 = new QuocGia(qg1);
		qg2.in();
	}
}
