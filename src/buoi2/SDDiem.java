package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3, 4);
		System.out.print("Toa do cua diem A la : ");
		a.hienThi();
		
		Diem b = new Diem();
		System.out.println("Nhap toa do cua B");
		b.nhapDiem();
		System.out.print("Toa do cua diem B la : ");
		b.hienThi();
		
		Diem c = new Diem(-b.giaTriX(),-b.giaTriY());
		System.out.print("Toa do cua diem C la : ");
		c.hienThi();
		
		System.out.println("Khoang cach tu diem B den tam O la : ");
		System.out.println(b.khoangCach());
		System.out.println("Khoang cach tu diem A den B la : ");
		System.out.print(b.khoangCachDiem(a));
		
		

	}

}
