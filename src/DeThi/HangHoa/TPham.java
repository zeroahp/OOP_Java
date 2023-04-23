package HangHoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TPham extends HHoa {
	private String ngaysx, hsd;
	private char dd; //A,B,C,D,E
	
	public TPham() {
		super();
		ngaysx = new String();
		hsd = new String();
		dd = '\0';
	}
	
	public TPham(TPham x) {
		super((HHoa)x);
		ngaysx = new String(x.ngaysx);
		hsd = new String(x.hsd);
		dd = x.dd;
	}
	
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay san xuat:");
		ngaysx = sc.nextLine();
		System.out.println("Nhap han su dung: ");
		hsd = sc.nextLine();
		System.out.println("Nhap ham luong dinh duong:");
		dd = sc.next().charAt(0);
	}
	
	public void in() {
		super.in();
		System.out.println("NSX: " + ngaysx + "\nHSD: " + hsd + "\nDinh duong: " +dd);
	}
	
	public String toString() {
		return super.toString() + "NSX: " + ngaysx + "\nHSD: " + hsd + "\nDinh duong: " +dd;
	}
		
	public char layDD() {
		return dd; 
	}
		
	public String getNgay() {
		return hsd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Nhap so doi tuong:");
		int n = sc.nextInt();
		HHoa ds[] = new HHoa[n];
		int i, c;
		for(i = 0; i < n ; i++) {
			System.out.println("Nhap Hang Hoa(1) hoac Thuc Pham(2):");
			c = sc.nextInt();
			if( c == 1) ds[i] = new HHoa();
			else ds[i] = new TPham();
			ds[i].nhap();
		}
		
		for(HHoa it:ds) {
			it.in();
			System.out.println("\n---------\n");
		}
			
		
		System.out.println("Thuc pham co gia duoi 1000000 va dinh duong muc A la: ");
		for(i = 0; i < n ; i++) {
			if(ds[i].layGia() < 1000000 && (ds[i].layDD() == 'A' || ds[i].layDD() == 'B' )) {
				System.out.println(ds[i].layTen());
			}
		}
		
		int x = 0;
		TPham del[] = new TPham[20];
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		for(i = 0; i < n ; i++) {
			try {
				Date day = formatter.parse(ds[i].getNgay());
				Date check = formatter.parse("21-11-2021");
				
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(day);
				
				boolean kiemtra1 = day.before(check);
				
				if(kiemtra1 ) {
					del[x] = new TPham((TPham)ds[i]);
					x++;
				}	
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Cac hang thuc pham con han su dung la:");
		for(i = 0; i < x ; i++) {
			del[i].in();
			System.out.println("\t----------------");
		}
		
	}
}











