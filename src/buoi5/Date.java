package buoi5;

import java.util.Scanner;

public class Date {
	private int d,m,y;
	Scanner sc = new Scanner(System.in);
	
	public Date (){
		d = 15;
		m = 2;
		y = 2023;
	}
	
	public Date(int d1, int m1, int y1){
		d = d1;
		m = m1;
		y = y1;
	}
	
	public void in(){
		System.out.println(d+"/"+m+"/"+y);
	}
	
	public Date (Date x){
		d = x.d;
		m = x.m;
		y = x.y;
	}
	
	public boolean hopLe(){
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((y%4==0 && y%100 != 0) || (y%400 == 0))
			max[2] = 29;
		boolean h = false;
		if(y>0 && m>=1 && m<13 && d >= 1 && d <= max[m])
			h = true;
		return h;
	}
	
	public void nhap(){
		do {
			System.out.println("Nhap ngay thang nam :");
			d = sc.nextInt();
			m = sc.nextInt();
			y = sc.nextInt();
			if(!hopLe()) System.out.println("Nhap sai nhap lai !");
		}while(!hopLe());
	}
	
	public Date ngayHomSau(){
		Date n = new Date(d,m,y);
		n.d++;
		if(!hopLe()){
			n.d = 1;
			n.m++;
			if(!hopLe()){
				n.m = 1;
				n.y ++;
			}
		}
		return n;
	}
	
	public Date congNgay(int k){
		Date n = new Date(d,m,y);
		for(int i = 0; i < k ; i++){
			n = n.ngayHomSau();
		}
		return n;
	}
	
}

