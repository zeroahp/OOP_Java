package buoi2;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	
	Scanner sc = new Scanner(System.in);
	public Diem(){
		x = 0;
		y = 0;
	}
	
	public Diem(int x1, int y1){
		x = x1;
		y = y1;
	}
	
	public Diem(Diem a){
		x = a.x;
		y = a.y;
	}
	
	public void in(){
		System.out.print("("+x+","+y+")");
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public void nhap(){
		System.out.println("Nhap diem x:");
		x = sc.nextInt();
		System.out.println("Nhap diem y:");
		y = sc.nextInt();
	}
	
	public void tinhTien(int dx, int dy){
		 x += dx;
		 y += dy;
	}
	
	public int giaTriX(){
		return x;
	}
	
	public int giaTriY(){
		return y;
	}
	
	//khoang cach tu A-0
	public float khoangCach(){
		return (float)Math.sqrt((x*x)+(y*y));
	}
	
	//khoang cach A-B
	public float khoangCach(Diem b){
		return (float)Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2));
	}
	
}
