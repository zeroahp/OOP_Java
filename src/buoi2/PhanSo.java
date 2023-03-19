package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuSo, mauSo;
	Scanner sc = new Scanner(System.in);
	
	public PhanSo(){
		tuSo = 0;
		mauSo = 1;
	}
	
	public PhanSo(int tuso, int mauso){
		tuSo = tuso;
		mauSo = mauso;
	}
	
	public void nhap(){
		do{
			System.out.println("Nhap tu so va mau so :");
			tuSo = sc.nextInt();
			mauSo = sc.nextInt();
			if(mauSo == 0) System.out.println("Nhap sai nhap lai !");
		}while(mauSo == 0);
	}
	
	public void in(){
		
		if(tuSo == 0) System.out.println("0");
		else if(mauSo == 1) System.out.println(tuSo);
		else {
			if(tuSo <0 || mauSo <0 )
				System.out.println("-"+tuSo+"/"+mauSo);
			System.out.println(tuSo+"/"+mauSo);
		}
			
	}
	
	public void nghichDao(){
		System.out.println(mauSo + "/" + tuSo);
	}
	
	public PhanSo giatriNghichDao(){
		PhanSo x = new PhanSo();
		x.tuSo = mauSo;
		x.mauSo = tuSo;
		return x;
	}
	
	public float giatri(){
		return (float)tuSo/mauSo;
	}
	
	public boolean lonHon(PhanSo a){
		return giatri() > a.giatri();
	}
	
	public int UCLN(int a, int b){
		if(b==0) return a;
		return UCLN(b, a%b);
	}
	
	public void toiGian(){
		int uc = UCLN(tuSo, mauSo);
		tuSo /= uc;
		mauSo /= uc;
	}
	
	public PhanSo cong(PhanSo a){
		PhanSo x = new PhanSo();
		x.tuSo = (tuSo*a.mauSo) + (mauSo*a.tuSo);
		x.mauSo = a.mauSo * mauSo;
		x.toiGian();
		return x;
	}
	
	public PhanSo tru(PhanSo a){
		PhanSo x = new PhanSo();
		x.tuSo = (tuSo*a.mauSo) - (mauSo*a.tuSo);
		x.mauSo = a.mauSo * mauSo;
		x.toiGian();
		return x;
	}
	
	public PhanSo nhan(PhanSo a){
		PhanSo x = new PhanSo();
		x.tuSo = (tuSo*a.tuSo);
		x.mauSo = a.mauSo * mauSo;
		x.toiGian();
		return x;
	}
	
	public PhanSo chia(PhanSo a){
		PhanSo x = new PhanSo();
		x.tuSo = (tuSo*a.mauSo);
		x.mauSo = a.tuSo * mauSo;
		x.toiGian();
		return x;
	}
}
