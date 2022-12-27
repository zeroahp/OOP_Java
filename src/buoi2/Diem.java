package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	Scanner sc = new Scanner(System.in);
	
	public Diem(){
		this.x = 0;
		this.y = 0;
	}
	
	public Diem(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void nhapDiem()
	{
		System.out.println("Nhap diem x : ");
		this.x = sc.nextInt();
		System.out.println("Nhap diem y : ");
		this.y = sc.nextInt();
	}
	
	public void hienThi()
	{
		System.out.println("(" + this.x + ","+ this.y +")");
	}
	
	public void doiDiem(int dx, int dy)
	{
		this.x += dx;
		this.y += dy;
	}
	
	public int giaTriX()
	{
		return this.x;
	}
	
	public int giaTriY()
	{
		return this.y;
	}
	
	public float khoangCach()
	{
		return (float)Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y, 2));
	}
	
	public float khoangCachDiem(Diem d){
		return (float)Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
	}
		
	
}
