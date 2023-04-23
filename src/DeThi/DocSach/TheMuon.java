package DocSach;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TheMuon {
	private BDoc bd;
	private int mst;
	private String nmuon, ntra;
	
	public TheMuon() {
		bd = new BDoc();
		mst = 0;
		nmuon = new String();
		ntra = new String();
	}
	
	public TheMuon(TheMuon a) {
		bd = new BDoc(a.bd);
		mst = a.mst;
		nmuon = new String(a.nmuon);
		ntra = new String(a.ntra);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Nhap thong tin ban doc!");
		bd.nhap();
		System.out.println("Nhap ma so the:");
		mst = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ngay muon sach:");
		nmuon = sc.nextLine();
		System.out.println("Nhap ngay tra sach:");
		ntra = sc.nextLine();
	}
	
	public void xuat() {
		System.out.println(bd + "\nMa the: " + mst + "\nNgay muon: " + nmuon + "\nNgay tra: "+ntra);
	}
	
	public String toString() {
		return bd + "\nMa the: " + mst + "\nNgay muon: " + nmuon + "\nNgay tra: "+ntra;
	}
	
	public int getMuon()
	{
		return Integer.parseInt(nmuon.trim().substring(0,nmuon.indexOf("-"))) ;
	}
	
	public String getTra()
	{
		return ntra;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so doi tuong:");
		int k = sc.nextInt();
		TheMuon dsach[] = new TheMuon[k];
		
		int i;
		for(i = 0; i < k ; i++) {
			System.out.println("Nhap the muon thu "+(i+1));
			dsach[i] = new TheMuon();
			dsach[i].nhap();
		}
		
		
		System.out.println("\n");
		for(i = 0; i < k ; i++) {
			System.out.println("The muon thu "+(i+1));
			dsach[i].xuat();
			System.out.println(dsach[i].getMuon());
			System.out.println("\t*---*---*");
		}
		
		
		int daymax[] = new int[50];
		String name[] = new String[50];
		int max = 0, x = 0;
		
		System.out.println("Cac ban doc co so ngay muon hon 36 ngay la:");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		for(i = 0; i < k ; i++) {
			try {
				
				Date daymuon = formatter.parse(dsach[i].nmuon);
				Date daytra = formatter.parse(dsach[i].ntra);
				
				long n = Math.abs(daytra.getTime() - daymuon.getTime());
		        long m = TimeUnit.DAYS.convert(n, TimeUnit.MILLISECONDS);
				
		        if( m > 36) { // so sanh voi 36, in ra
		        	System.out.println("Tong so ngay: " +m);
					System.out.println("Ma so: " +dsach[i].bd.getMaso());
					
					if(daymax[x] < m) { //muon sach lau nhat
						max = (int)m;
						daymax[x] = (int)m;
						name[x] = dsach[i].bd.getTen();
						x++;
					}
				}
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Cac ban doc, co so ngay muon lau nhat la:");
		for(i = 0; i < x ; i++) {
			if(daymax[i] == max)
				System.out.println(name[i] +", voi: " + max +"ngay");
		}
	}
}

























