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
		
		JLabel lblNewLabel = new JLabel("Sản Phẩm");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 29, 73, 14);
		contentPane.add(lblNewLabel);
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bánh ngọt", "Đồ chơi", "Nước uống"}));
		comboBox.setBounds(131, 25, 120, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sản Phẩm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 71, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên Sản Phẩm");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 105, 93, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số Lượng");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(10, 137, 93, 19);
		contentPane.add(lblNewLabel_1_2);
		
		txttensp = new JTextField();
		txttensp.setColumns(10);
		txttensp.setBounds(131, 101, 120, 20);
		contentPane.add(txttensp);
		
		txtsoluong = new JTextField();
		txtsoluong.setColumns(10);
		txtsoluong.setBounds(131, 138, 120, 20);
		contentPane.add(txtsoluong);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Đơn Giá");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(10, 174, 93, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtdongia = new JTextField();
		txtdongia.setColumns(10);
		txtdongia.setBounds(131, 173, 120, 20);
		contentPane.add(txtdongia);
		
		JButton btnNewButton = new JButton("THÊM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sanpham SP = new sanpham(txtmasp.getText(), txttensp.getText(), Float.parseFloat(txtsoluong.getText()), Float.parseFloat(txtdongia.getText()));
				SP.setMasp(txtmasp.getText());
				SP.setTensp(txttensp.getText());
				SP.setSoluong(Integer.parseInt(txtsoluong.getText()));
				SP.setDongia(Float.parseFloat(txtdongia.getText()));
				Nhap(SP);
				dtm.setDataVector(Vndung, Vtieude);
				table.setModel(dtm);
			}
		});
		btnNewButton.setBounds(54, 207, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnXo = new JButton("XOÁ");
		btnXo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
		        if (selectedRow >= 0) {
		            float thanhTien = Float.parseFloat(table.getValueAt(selectedRow, 5).toString());
		            Vndung.remove(selectedRow);
		            dtm.setDataVector(Vndung, Vtieude);
		            table.setModel(dtm);
		            tt -= thanhTien; 
		            
		        }
			}
		});
		btnXo.setBounds(241, 207, 89, 23);
		contentPane.add(btnXo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 241, 414, 124);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 SP", "Lo\u1EA1i SP", "T\u00EAn SP", "S\u1ED1 L\u01B0\u1EE3ng", "\u0110\u01A1n Gi\u00E1", "Th\u00E0nh Ti\u1EC1n"
			}
		));
		scrollPane.setViewportView(table);
		
		txtmasp = new JTextField();
		txtmasp.setColumns(10);
		txtmasp.setBounds(131, 65, 120, 20);
		contentPane.add(txtmasp);
	}
}
