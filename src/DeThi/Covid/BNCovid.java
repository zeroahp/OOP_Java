package Covid;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.text.ParseException;
import java.util.Scanner;



public class BNCovid extends BNhan {
	private String ngay, odich, noi;
	private char loai;
	
	public BNCovid() {
		super();
		ngay = new String();
		odich = new String();
		noi = new String();
		loai = '\0';
	}
	
	public BNCovid(String ten, boolean a, int nam, float can, String phai,String day, String od, String noi, char c) {
		super(ten,a,nam,can,phai);
		ngay = new String(day);
		odich = new String(od);
		noi = new String(noi);
		loai = c;
	}
	
	public BNCovid(BNCovid a) {
		super((BNhan)a);
		ngay = new String(a.ngay);
		odich = new String(a.odich);
		noi = new String(a.noi);
		loai = a.loai;
	}
	
	public void nhap() {
		System.out.println("Nhap thong tin benh nhan:");
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay cach ly:");
		ngay = sc.nextLine();
		System.out.println("Nhap phan loai ('0'F0, '1'F1,..):");
		loai = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Nhap o dich:");
		odich = sc.nextLine();
		System.out.println("Nhap noi cach ly:");
		noi = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("Ngay cach ly: "+ ngay + "\nLoai: " + loai + "\nO dich: "+odich+"\nNoi cach ly: "+noi);
	}
	
	public String toString() {
		return super.toString() + "Ngay cach ly: "+ ngay + "\nLoai: " + loai + "\nO dich: "+odich+"\nNoi cach ly: "+noi;
	}
	
	public char layLoai() {
		return loai;
	}
	
	public String layOdich() {
		return odich;
	}
	
	public String layDay() {
		return ngay;
	}
//	public int layNgay() {
//		int n;
//		n = Integer.parseInt(ngay.trim().substring(0, ngay.indexOf("/")));
//		return n;
//	}
//	
//	public int layThang() {
//		int m;
//		m = Integer.parseInt(ngay.trim().substring(ngay.indexOf("/")+1, ngay.lastIndexOf("/")));
//		return m;
//	}
//	
//	public int layNam() {
//		int y;
//		y = Integer.parseInt(ngay.trim().substring(ngay.lastIndexOf("/")+1));
//		return y;
//	}
//	
//	public boolean hople() {
//		int max[] = {0,31,20,31,30,31,30,31,31,30,31,30,31};
//		if((layNgay()%4==0 && layNam()%100!=0 )||(layNam()%400==0))	
//			if(layThang() == 2) {
//					max[layThang()] = 29;
//				}
//		boolean h = false;
//		if(layNgay() <= max[layThang()] && layNgay() >0 && layThang() >0 && layThang()<13 && layNam()>0) {
//			h = true;
//		}
//		return h;
//	}
//	
//	public boolean check() {
//		boolean checkNgay = false;
//		if(hople()) {
//			if((layNgay()+14 <= 18) && (layThang() == 5) && (layNam() == 2021)) {
//				checkNgay = true;
//			}
//		}
//		return checkNgay;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong benh nhan :");
		int n = sc.nextInt();
		
		BNhan ds[] = new BNhan[n];
		BNCovid cv[] = new BNCovid[50];
		int i,c;
		int z = 0;
		for(i = 0 ; i<n ;i++) {
			System.out.println("Nhap thong tin benh nhan(1) hay benh nhan Covid-19(2) ?");
			c = sc.nextInt();
			if(c == 1) 
				{
					ds[i] = new BNhan();
					ds[i].nhap();
				}
			else {
				ds[i] = new BNCovid();
				ds[i].nhap();
				cv[z] = new BNCovid((BNCovid)ds[i]);
				z++;
			}			
		}
		
		int x = 0;
		for(i = 0 ; i<n ;i++) {
			if(ds[i].layLoai() == '1' && ds[i].layOdich().equals("Cong ty Hosiden")) {
				
				System.out.print("Benh nhan mac Covid-19 thu " + (x+1) + " la: ");
				System.out.println(ds[i].layTen());
				x++;
				
			}
		}
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		
		System.out.println("Tat ca benh nhan nhiem Covid da het thoi gian cach ly la:");
		for(i = 0 ; i<z ;i++) {			
			try {
				Date d = formatter.parse(cv[i].layDay());
				Date kt = formatter.parse("18-05-2021");
				
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(d);
				calendar.add(Calendar.DATE, 14);
				Date newdate = calendar.getTime();
				
				boolean b = newdate.before(kt);
				if(b) cv[i].in();
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
