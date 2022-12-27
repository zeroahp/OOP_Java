package TITV;

public class HoaDonCafe {

	private String tenCafe;
	private double khoiLuong;
	private double giaTien1kg;
	
	public HoaDonCafe(String ten, double kl, double tien1kg) {
		this.tenCafe = ten;
		this.khoiLuong = kl;
		this.giaTien1kg = tien1kg;
	}
	
	//thanh toan tien cafe
	public double thanhToan() {
		return this.khoiLuong*this.giaTien1kg;
	}
	
	//kiem tra khoi luong co lon hon muc quy dinh hay khong
	public boolean checkKL(double kl) {
		return this.khoiLuong > kl;
	}
	
	//kiem tra gia tien hoa don co lon hon 500$ hay khong
	public boolean checkGiaTien() {
		return this.thanhToan() >= 500;
	}
	
	//Giam gia x% cho cac hoa don >500$
	public double giamGia(double x) {
		if(this.thanhToan() > 500)
			return this.thanhToan()*(x/100);
		else return 0;
	}
	
	//So tien khach phai tra sao khi giam gia
	public double thanhToanGiamGia(double x) {
		return this.thanhToan()-this.giamGia(x);
	}

}
