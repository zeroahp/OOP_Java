package buoi2;

import java.util.Scanner;

public class Date {
	private int day, month, year;
	Scanner sc = new Scanner(System.in);
	
	public Date() //ham mac nhien
	{
		day = month = year = 0;
	}
	
	public Date(int d, int m, int y)//ham co doi so
	{
		this.day = d;
		this.month = m;
		this.year = y;
	}

	//ham xay dung sao chep
	public Date(Date d) {
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}
	
	public void printDay() {
		System.out.println(this.day +"/"+ this.month + "/" + this.year);
	}
	
	public boolean hopLe(){		
		int ngaytrongthang[] = {0, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (this.month == 2)
		{
			if ( (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0) 
				ngaytrongthang[2] = 29;
			else ngaytrongthang[2] = 28;
		}
		if (this.day > 0 && this.day <= ngaytrongthang[this.month] && this.month > 0 && this.month < 13)
			return true;
		return false;
		
	}
	
	public void nhapDay() {
		do {
			System.out.println("Nhap ngay : ");
			this.day = sc.nextInt();
			System.out.println("Nhap thang : ");
			this.month = sc.nextInt();
			System.out.println("Nhap nam : ");
			this.year =sc.nextInt();
			if(!hopLe())
				System.out.println("Nhap sai moi nhap lai !");	
		} while (!hopLe());
	}
	
	public Date ngayHomSau()
	{
		Date res = new Date(this.day, this.month, this.year);
		res.day ++;
		if(!res.hopLe())
		{
			res.day = 1;
			res.month ++;
			if(!res.hopLe()) {
				res.month = 1;
				res.year ++;
			}
		}
		return res;
	}
	
	public Date congNgay(int n)
	{
		Date cong = new Date(this.day, this.month, this.year);
		
		while(n!=0)
		{
			cong = cong.ngayHomSau();
			n--;
		}
		return cong;
	}
	
}
