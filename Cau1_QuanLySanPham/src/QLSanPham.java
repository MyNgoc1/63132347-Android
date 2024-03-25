import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QLSanPham extends JFrame {

	public class sanpham extends SanPham {

		public sanpham(String masp, String tensp, float soluong, float dongia) {
			super(masp, tensp, soluong, dongia);
			// TODO Auto-generated constructor stub
		}

		@Override
		float tinhtien() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttensp;
	private JTextField txtsoluong;
	private JTextField txtdongia;
	
	JComboBox comboBox = new JComboBox();
	private JTable table;
	
	Vector<String> Vtieude=new Vector<>();
	Vector<Vector<Object>> Vndung = new Vector<>();
	Vector Vdong;
	float tt=0;
	
	DefaultTableModel dtm=new DefaultTableModel();
	protected JTextComponent txtsl;
	protected JTextComponent txtdg;

	void Tieude() {
		Vtieude.add("Mã SP");
		Vtieude.add("Loại SP");
		Vtieude.add("Tên SP");
		Vtieude.add("Số Lượng");
		Vtieude.add("Đơn Giá");
		Vtieude.add("Thành Tiền");
	}

	void Nhap(SanPham SP) {
		Vector<Object> Vdong = new Vector<>();
		Vdong.add(SP.getMasp());
		Vdong.add(comboBox.getSelectedItem().toString());
		Vdong.add(SP.getTensp());
		Vdong.add(SP.getSoluong());
		Vdong.add(SP.getDongia());
		float thanhTien = SP.getSoluong() * SP.getDongia();
	    Vdong.add(thanhTien);
	    Vndung.add(Vdong);
	    tt += thanhTien;
	}
	/**
	 * Launch the application.
	 */
    private ArrayList<SanPham> danhSachSanPham;
	private JTextField txtmasp;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSanPham frame = new QLSanPham();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public QLSanPham() {
		Tieude();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	
}
