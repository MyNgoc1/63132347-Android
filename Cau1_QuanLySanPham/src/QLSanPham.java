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
	
}
