package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu, mau;
	Scanner sc = new Scanner(System.in);
	
	public PhanSo()
	{
		tu = mau = 0;
		
	}
	
	public PhanSo(int tu, int mau)
	{
		this.tu = tu;
		this.mau = mau;
		
	}
	
	public void nhapPhanSo()
	{
		do {
			System.out.println("Nhap tu :");
			this.tu = sc.nextInt();
			System.out.println("Nhap mau :");
			this.mau = sc.nextInt();
			
			if(this.mau == 0) 
				System.out.println("Nhap sai nhap lai !");
			
		} while (this.mau == 0);
	}

	
	public void hienThi()
	{
		if(this.tu == 0)
			System.out.println("0");
		else if(this.mau == 1)
			System.out.println(this.tu);
		else {
			if(this.tu < 0 || this.mau <0)
				System.out.println("-"+this.tu + "/" + this.mau);
			System.out.println(this.tu + "/" + this.mau);
		}
	}
	
	public void nghichDao()
	{
		System.out.println(this.mau + "/" + this.tu);
		
	}
	
	public PhanSo giaTriNghichDao()
	{
		PhanSo nd = new PhanSo(this.tu, this.mau);
		nd.tu = this.mau;
		nd.mau = this.tu;
		return nd;
	}
	
	public double giaTriThuc()
	{
		return 	(double)this.tu/this.mau;
	}
	
	public boolean lonHon(PhanSo a)
	{
		return giaTriThuc() > a.giaTriThuc();
	}
	
	public int UCLN(int a, int b)
	{
		if(b == 0) return a;
		return UCLN(b,a%b);
	}
	
	public void toiGian()
	{	
		int uc = UCLN(this.tu,this.mau);
		this.tu /= uc;
		this.mau /= uc;
	}
	
	public PhanSo cong(PhanSo a)
	{
		PhanSo x = new PhanSo();
		x.tu = (this.tu*a.mau)+(this.mau*a.tu);
		x.mau = this.mau * a.mau;
		x.toiGian();
		return x;
	}
	
	public PhanSo tru(PhanSo a)
	{
		PhanSo x = new PhanSo();
		x.tu = (this.tu*a.mau) - (this.mau*a.tu);
		x.mau = this.mau * a.mau;
		x.toiGian();
		return x;
	}
	
	public PhanSo nhan(PhanSo a)
	{
		PhanSo x = new PhanSo();
		x.tu = this.tu * a.tu;
		x.mau = this.mau * a.mau;
		x.toiGian();
		return x;
	}
	
	public PhanSo chia(PhanSo a)
	{
		PhanSo x = new PhanSo();
		x.tu = this.tu * a.mau;
		x.mau = this.mau * a.tu;
		x.toiGian();
		return x;
	}
	
	public PhanSo congNguyen(int n)
	{
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		y.tu = n * this.tu;
		y.mau = this.mau;
		x.cong(y);
		return x;
				
	}
	
	public PhanSo truNguyen(int n)
	{
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		y.tu = n * this.tu;
		y.mau = this.mau;
		x.tru(y);
		return x;
				
	}
	
	public PhanSo nhanNguyen(int n)
	{
		PhanSo x = new PhanSo();
		x.tu = this.tu * n;
		x.mau = this.mau;
		x.toiGian();
		return x;
				
	}
	
	public PhanSo chiaNguyen(int n)
	{
		PhanSo x = new PhanSo();
		x.tu = this.tu;
		x.mau = this.mau * n;
		x.toiGian();
		return x;
				
	}
	
	
}






















