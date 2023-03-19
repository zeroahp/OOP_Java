package buoi3;
import java.util.Scanner;

import buoi2.Date;;
public class SinhVien {
	private String mssv,hoTen;
	private Date nsinh;
	private int sLuongHocPhan;
	private String tenHocPhan[];
	private String diemHocPhan[];
	private final int max = 50;
	Scanner sc = new Scanner(System.in);
	
	public SinhVien(){
		mssv = new String();
		hoTen = new String();
		nsinh = new Date();
		sLuongHocPhan = 0;
		tenHocPhan = new String[max];
		diemHocPhan = new String[max];
	}
	public SinhVien(String ms, String hoten, Date n){
		mssv = new String(ms);
		hoTen = new String(hoten);
		nsinh = new Date(n);
		sLuongHocPhan = 0;
		tenHocPhan = new String[max];
		diemHocPhan = new String[max];

	}
	
	
	public SinhVien(SinhVien s){
		mssv = new String(s.mssv);
		hoTen = new String(s.hoTen);
		nsinh = new Date(s.nsinh);
		sLuongHocPhan = s.sLuongHocPhan;
		tenHocPhan = new String[max];
		diemHocPhan = new String[max];
		for(int i = 0; i < sLuongHocPhan ; i++){
			tenHocPhan[i] = new String(s.tenHocPhan[i]);
			diemHocPhan[i] = new String(s.diemHocPhan[i]);
		}
	}
	
	public void nhap(){
		System.out.print("Nhap ma so sinh vien: ");
		mssv = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		nsinh.nhap();
	}
	
	public void nhapDiem(){
		System.out.print("Nhap so luong mon hoc :");
		sLuongHocPhan = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < sLuongHocPhan ; i++){
			System.out.println("Nhap mon thu "+(i+1));
			tenHocPhan[i] = sc.nextLine();
			System.out.println("Nhap diem thu "+(i+1));
			diemHocPhan[i] = sc.nextLine();
		}
	}
	
	public void in(){
		System.out.println(mssv+ "-" +hoTen+ "-" + nsinh);
		for(int i = 0 ; i < sLuongHocPhan ; i++){
			System.out.println(tenHocPhan[i] + "-" +diemHocPhan[i]);
		}
	}
	public String toString(){
		String S = "["+mssv+ "-" +hoTen+ "-" + nsinh;
		for(int i = 0 ; i < sLuongHocPhan ; i++){
			S += "-"+tenHocPhan[i]+"-" + diemHocPhan[i];
		}
		S += "]";
		return S;
	}
	
	public float diemTB(){
		float diem = 0.0f;
		for(int i = 0; i < sLuongHocPhan ; i++){
			if(diemHocPhan[i].equals("A")) diem += 4.0f;
			else if(diemHocPhan[i].equals("B+")) diem += 3.5f;
			else if(diemHocPhan[i].equals("B")) diem += 3.0f;
			else if(diemHocPhan[i].equals("C+")) diem += 2.5f;
			else if(diemHocPhan[i].equals("C")) diem += 2.0f;
			else if(diemHocPhan[i].equals("D+")) diem += 1.5f;
			else if(diemHocPhan[i].equals("D")) diem += 1.0f;
			else if(diemHocPhan[i].equals("F")) diem += 0.0f;
			
		}
		return diem/sLuongHocPhan;
	}
	
	public void themHocPhan(String ten, String diem){
		if(sLuongHocPhan<max){		
			tenHocPhan[sLuongHocPhan] = new String(ten);
			diemHocPhan[sLuongHocPhan] = new String(diem);
			sLuongHocPhan++;
		}
	}
	
	public void xoaHocPhan(String x){
		int i = 0;
		for(i = 0 ; i < sLuongHocPhan ;i++)
			if(tenHocPhan[i].equals(x))
				break;
		if(sLuongHocPhan < max)
			for(int j = i ;  j < sLuongHocPhan-1 ; j++){
				tenHocPhan[j] = tenHocPhan[j+1];
				diemHocPhan[j] = diemHocPhan[j+1];
			}
	}
	
	public boolean canhBaoHocVu(){
		return diemTB()<1.0;
	}
	
	public String layMaSo(){
		return mssv;
	}
	
	public String HoTen(){
		return hoTen;
	}
	
	public String layTen(){
		return hoTen.substring(hoTen.trim().lastIndexOf(" ")+1);
	}
	
	
}
