package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem a = new Diem(3,4);
		System.out.print("Toa do diem a la :");
		a.in();
		Diem b = new Diem();
		
		b.nhap();
		System.out.print("Toa do diem b la :");
		b.in();
		
		//C doi xung voi B qua goc toa do
		Diem c = new Diem(-b.giaTriX(),-b.giaTriY());
		System.out.print("Toa do diem c la :");
		c.in();
		
		//khoang cach tu diem B den tam O
		System.out.println("Khoang cach tu diem B den tam O la:"+b.khoangCach());
		
		//Khoang cach tu A den B
		System.out.println("Khoang cach tu A den B la:"+a.khoangCach(b));
		
		
	}

}
