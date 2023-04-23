package QuocGia;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia {
	private float ttho, dtich;
	private char chluc;
	
	
	public QuocGiaPT() {
		super();
		ttho = 0.0f;
		chluc = '\0';
		dtich = 0.0f;
	}
	
	public QuocGiaPT(QuocGiaPT a) {
		super((QuocGia)a);
		ttho = a.ttho;
		chluc = a.chluc;
		dtich = a.dtich;
	}
	
	public void nhap() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin quoc gia\n");
		super.nhap();
		System.out.println("Nhap chau luc:");
		chluc = sc.next().charAt(0);
		System.out.println("Nhap dien tich:");
		dtich = sc.nextFloat();
		System.out.println("Nhap tuoi tho:");
		ttho = sc.nextFloat();
	}
	
	
	public void in() {
		System.out.println(super.toString() + "\nChau luc: " + chluc + "\nDien tich: "+ dtich+ "\nTuoi tho: "+ ttho);
	}
	public String toString() {
		return super.toString() + "\nChau luc: " + chluc + "\nDien tich: "+ dtich+ "\nTuoi tho: "+ ttho;
	}
	
	public char getChauLuc() {
		return chluc;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so doi tuong:");
		int n = sc.nextInt();
		QuocGia ds[] = new QuocGia[n];
		
		int i, c;
		for( i= 0; i < n; i++) {
			System.out.println("Nhap quoc gia(0) hoac quoc gia phat trien(1):");
			c = sc.nextInt();
			if( c==0) ds[i] = new QuocGia();
			else ds[i] = new QuocGiaPT();
			ds[i].nhap();
		}
		
		System.out.println("Thong tin vua nhap: ");
		for( i= 0; i < n; i++) {
			ds[i].in();
			System.out.println("- - - - - - ");
		}
		
		System.out.println("Cac quoc gia co GDP tren 500 den tu Chau Phi la:");
		int mark = 0;
		for( i= 0; i < n; i++) {
			if(ds[i].getChauLuc() == 'P' && ds[i].getGDP() > 500) {
				System.out.println(ds[i].gettenQG());
				mark++;
			}
		}
		if(mark == 0) System.out.println("Khong co!");
		
		float gdpA = 0, gdpW =0, gdpP = 0, gdpM = 0, gdpU = 0 ;
		for( i= 0; i < n; i++) {
			if(ds[i] instanceof QuocGiaPT ) {
				if(ds[i].getChauLuc() == 'A') {
					gdpA += ds[i].getGDP();
				}
				if(ds[i].getChauLuc() == 'M') {
					gdpM += ds[i].getGDP();
				}
				if(ds[i].getChauLuc() == 'U') {
					gdpU += ds[i].getGDP();
				}
				if(ds[i].getChauLuc() == 'P') {
					gdpP += ds[i].getGDP();
				}
				if(ds[i].getChauLuc() == 'W') {
					gdpW += ds[i].getGDP();
				}
			}
		}
		
		System.out.println("Danh sach tong GDP thuoc moi cau luc la:");
		System.out.println("Chau A: " + gdpA);
		System.out.println("Chau My: " + gdpM);
		System.out.println("Chau Uc: " + gdpU);
		System.out.println("Chau Phi: " + gdpP);
		System.out.println("Chau Au: " + gdpW);
		
	}
}


























