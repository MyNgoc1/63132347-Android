
public abstract class SanPham {
	private String masp;
	private String tensp;
	private float soluong;
	private float dongia;
    abstract float tinhtien();
    public SanPham(String masp, String tensp, float soluong, float dongia){
    	setDongia(dongia);
    	setMasp(masp);
    	setSoluong(soluong);
    	setTensp(tensp);
    }
    
	String getMasp() {
		return masp;
	}
	void setMasp(String masp) {
		this.masp = masp;
	}
	String getTensp() {
		return tensp;
	}
	void setTensp(String tensp) {
		this.tensp = tensp;
	}
	float getSoluong() {
		return soluong;
	}
	void setSoluong(float soluong) {
		this.soluong = soluong;
	}
	float getDongia() {
		return dongia;
	}
	void setDongia(float dongia) {
		this.dongia = dongia;
	}
}
