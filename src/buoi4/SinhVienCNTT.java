package buoi4;

import java.util.Scanner;
import buoi3.SinhVien;
import buoi2.Date;
public class SinhVienCNTT extends SinhVien{
	private String taikhoan, matkhau , email;
	
	Scanner sc = new Scanner(System.in);
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(String m, String h, Date n,String tk, String mk, String mail) {
		super(m,h,n);
		taikhoan = new String(tk);
		matkhau = new String(mk);
		email = new String(mail);
	}
	
	public SinhVienCNTT(SinhVienCNTT p) {
		super((SinhVien)p);
		taikhoan = new String(p.taikhoan);
		matkhau = new String(p.matkhau);
		email = new String(p.email);
	}
	
	public void nhap() {
		super.nhap();
		System.out.println("Nhap ten tai khoan :");
		taikhoan = sc.nextLine();
		System.out.println("Nhap mat khau :");
		matkhau = sc.nextLine();
		System.out.println("Nhap email :");
		email = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("Tai khoan: "+taikhoan);
		System.out.println("Email: "+ email);

	}
	public String toString() {
		return super.toString() + "[ tai khoan : " +taikhoan + ", email : " + email+" ]";
	}
	
	public void doiMathau(String newpass) {
		matkhau = new String(newpass);
	}
	
	public String layEmail() {
		return email;
	}
	public String layTaiKhoan() {
		return taikhoan;
	}
}
