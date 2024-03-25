
public class BanhNgot extends SanPham {

	public BanhNgot(String masp, String tensp, float soluong, float dongia) {
		super(masp, tensp, soluong, dongia);
		// TODO Auto-generated constructor stub
	}

	@Override
	float tinhtien() {
		// TODO Auto-generated method stub
		
		float tt=getDongia()*getSoluong();
		return tt;
	}
	
}
