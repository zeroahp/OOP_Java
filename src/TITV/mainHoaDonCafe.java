package TITV;

public class mainHoaDonCafe {

	public static void main(String[] args) {
		HoaDonCafe hd = new HoaDonCafe("Chon", 10, 250);
		System.out.println("***Hoa Don Cafe***");
		System.out.println("So tien Cafe can phai thanh toan la : " +hd.thanhToan()+"$" );
		
		//kiem tra khoi luong co lon hon muc quy dinh hay khong
		System.out.println("Khoi luong co lon hon 5kg ? : "+hd.checkKL(5));
		
		//kiem tra gia tien hoa don co lon hon 500$ hay khong
		System.out.println("Gia tien lon hon 500$ ? : "+hd.checkGiaTien());
		
		//Giam gia x% cho cac hoa don >500$
		System.out.println("Giam gia 20% cho hoa don > 500$ : "+hd.giamGia(20)+"$");
		
		//So tien khach phai tra sao khi giam gia
		System.out.println("So tien sau khi giam gia la : "+hd.thanhToanGiamGia(20)+"$");

	}

}
