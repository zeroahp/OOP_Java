package buoi3;

import java.util.Scanner;

public class Gach {
	String mso,mau;
	int sluong,cdai,cngang;
	long gia;
	Scanner sc = new Scanner(System.in);
	
	public Gach(){
		mso = new String();
		mau = new String();
		sluong = cdai = cngang = 0;
		gia = 0;
	}
	public Gach(String maso, String color,int sl, int cd, int cn, long giaban ){
		mso = new String(maso);
		mau = new String(color);
		sluong = sl;
		cdai = cd;
		cngang = cn;
		gia = giaban;
	}
	
	public Gach(Gach g){
		mso = new String(g.mso);
		mau = new String(g.mau);
		sluong = g.sluong;
		cdai = g.cdai;
		cngang = g.cngang;
		gia = g.gia;
	}
	
	public void nhap(){
		System.out.println("Nhap ma so:");
		mso = sc.nextLine();
		System.out.println("Nhap mau:");
		mau = sc.nextLine();
		System.out.println("Nhap so luong:");
		sluong = sc.nextInt();
		System.out.println("Nhap chieu dai:");
		cdai = sc.nextInt();
		System.out.println("Nhap chieu ngang:");
		cngang = sc.nextInt();
		System.out.println("Nhap gia ban:");
		gia = sc.nextLong();
	}
	
	public void in(){
		System.out.println("Ma so:"+mso);
		System.out.println("Mau:"+mau);
		System.out.println("So Luong:"+sluong);
		System.out.println("Chieu dai:"+cdai);
		System.out.println("chieu ngang:"+cngang);
		System.out.println("Gia ban:"+gia);
	}
	
	public String toString(){
		return "Ma so:"+mso+", mau "+mau+", so luong "+
				sluong +", chieu dai "+ cdai+", chieu ngang "+
				cngang+",gia ban "+gia;
	}
	
	public float giaBanLe(){
		return (float)((1.2*gia)/sluong);
	}
	
	public int dienTich(){
		return cdai*cngang*sluong;
	}
	
	public int soLuongHop(int D, int N){
		int svd = D/cdai;
		if(D%cdai != 0) svd++;
		int svn = D/cngang;
		if(N%cngang != 0) svn++;
		int slv =  svn*svd;
		int sh = slv/sluong;
		if(sh % sluong != 0)
			sh ++;
		return sh;
	}
	
	public float getGia(){
		return gia;
	}

}
