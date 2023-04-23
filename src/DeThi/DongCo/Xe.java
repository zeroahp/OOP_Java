package DongCo;

import java.util.Scanner;

public class Xe {
	private DCo d;
	private String so, ten;
	private long gia;
	private char tthai;
	
	public Xe() {
		d = new DCo();
		so = new String();
		ten = new String();
		gia = 0;
		tthai = '\0';
	}
	
	public Xe(DCo x, String soxe, String t, long a, char s) {
		d = new DCo(x);
		so = new String(soxe);
		ten = new String(t);
		gia = a;
		tthai = s;
	}
	
	public Xe(Xe h) {
		d = new DCo(h.d);
		so = new String(h.so);
		ten = new String(h.ten);
		gia = h.gia;
		tthai = h.tthai;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap bien so xe:");
		so = sc.nextLine();
		System.out.println("Nhap ten chu xe:");
		ten = sc.nextLine();
		System.out.println("Nhap gia tien:");
		gia = sc.nextLong();
		System.out.println("Nhap trang thai xe:");
		tthai = sc.next().charAt(0);
		System.out.println("Nhap thong tin dong co:");
		d.nhap();
	}
	
	public void in() {
		System.out.println("Bien so xe: "+ so + "\nTen chu xe: " +ten+"\nGia tien: " +gia+"\nTrang thai xe: "+tthai+"\n"+d );
	}
	
	public String toString() {
		return "Bien so xe: "+ so + "\nTen chu xe: " +ten+"\nGia tien: " +gia+"\nTrang thai xe: "+tthai+"\n"+d;
	}
	
	public char laytthai() {
		return tthai;
	}
	
	public long layGia() {
		return gia;
	}
	
	public long lePhi() {
		return (long)(gia * (0.1));
	}
	
	public int layThang() {
		int n;
		String s = d.getNgay();
		n = Integer.parseInt(s.trim().substring(s.indexOf("/")+1,s.lastIndexOf("/")));
		return n;
	}
	public int layNam() {
		int y;
		y = Integer.parseInt(d.getNgay().substring(d.getNgay().trim().lastIndexOf("/")+1));
		return y;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so xe:");
		int m = sc.nextInt();
		
		long lephi[] = new long[m];
		Xe ds[] = new Xe[m];
		int i;
		for(i = 0; i < m ; i++) {
			System.out.println("Nhap thong tin xe thu "+(i+1));
			ds[i] = new Xe();
			ds[i].nhap();
		}
		for(i = 0; i < m ; i++) {
			System.out.println("Thong tin xe thu "+(i+1));
			ds[i].in();
			System.out.println("Le phi truoc ba cua xe la: " + ds[i].lePhi());
		}
		
		System.out.println("Cac chuyen xe bi huy lan luot la:");
		for(i = 0 ; i < m; i++) {
			if(ds[i].laytthai() == 'K' || ds[i].gia < 10000000) {
				System.out.println(ds[i].so);
			}
		}
		
		float tong = 0;
		
		System.out.println("Tong le phi truoc ba cho tung loai dong co truoc thang 10 nam 2000 la :");
		for(i = 0 ; i < m; i++) {
			if(ds[i].layThang() < 10 && ds[i].layNam() == 2000) {
				tong += ds[i].lePhi();
//				System.out.println(ds[i].layThang() + "-" +ds[i].layNam());
			}
		}
		
		if(tong != 0) System.out.println(tong);
		else {
			System.out.println("Khong co dong co nao dap ung.");
		}
		
	}
}















