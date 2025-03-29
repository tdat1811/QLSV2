	package gui;

import com.mongodb.client.MongoClient;
import dao.AccountDAO;
import pojo.Account;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class TaiKhoan extends JPanel implements ActionListener {
		private final AccountDAO dao;

	private JPanel jpn;
	private JLabel jl1;
	private Box box;
	private JLabel jl2;
	private JPanel jpcl;
	private JLabel iconLabel;
	private JPanel jpc;
	private Box box1;
	private JPanel jpcr;
	private JLabel jl3;
	private JLabel jltaikhoan;
	private JTextField txttaikhoan;
	
	private Box box3;
	private JLabel jlmatkhau;
	private JTextField txtmatkhau;
	private JLabel jlvaitro;
	private JTextField txtvaitro;
	private JLabel jptimkiem;
	private JTextField txtimkiem;
	private Box boxnorth;
	private JLabel jltimkiem;
	private JTextField txttimkiem;
	private JLabel jl4;
	private Box boxnorth1;
	private JPanel jpn1;
	private JLabel jln1;
	private JLabel jln2;
	private Box box2;
	private Box boxmainnorth;
	private JPanel jpcc;
	private Box boxjpcr;
	private JLabel jltaikhoan1;
	private JTextField txttaikhoan1;
	private JLabel jlmatkhau1;
	private JTextField txtmatkhau1;
	private JLabel jlvaitro1;
	private JTextField txtvaitro1;
	private Box boxmainjpcr;
	private JButton jbuttonthem;
//	private Box boxmainjpcr;
	private JButton jbuttonxoa;
	private JButton jbuttonsua;
	private JPanel jpbutton;
	private JPanel jps;
	private JLabel jls1;
	private DefaultTableModel tablemodel;
	private JTable table;
	private JPanel jps1;
	private JScrollPane scrollpane;
	private JLabel jls2;
	private Box boxsouth;

	private static final String URL = "mongodb://localhost:27017";
	private static final String dbName = "23704871";
	public TaiKhoan() {
		dao = new AccountDAO(URL, dbName);
		this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new BorderLayout());
        jpn = new JPanel(new BorderLayout());
        jpn.setBackground(Color.LIGHT_GRAY);
        boxmainnorth = Box.createVerticalBox();
        boxnorth = Box.createVerticalBox();
        boxnorth1 = Box.createHorizontalBox();
        
        jl1 = new JLabel("Danh Sách Tài Khoản", SwingConstants.CENTER);
        jl1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jl1.setFont(new Font("Arial", Font.BOLD, 30));
        jl1.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));

        jltimkiem = new JLabel("Tìm Kiếm");
        txttimkiem = new JTextField(10);
        boxnorth.add(jl1);
        boxnorth.add(Box.createVerticalStrut(10));
        boxnorth1.add(jltimkiem);
        boxnorth1.add(Box.createHorizontalStrut(5));
        boxnorth1.add(txttimkiem);
        boxnorth.add(boxnorth1);
        boxmainnorth.add(boxnorth);

        jpn1 = new JPanel(new BorderLayout());
        jpn1.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        jpn1.setBackground(Color.LIGHT_GRAY);
        jpn1.setPreferredSize(new Dimension(0, 40));

        jln1 = new JLabel("Thông tin Tài Khoản");
        jln1.setFont(new Font("Arial", Font.BOLD, 14));
        jln2 = new JLabel("Quản Lý Tài Khoản", SwingConstants.CENTER);
        jln2.setBorder(BorderFactory.createEmptyBorder(0,200,0,0));
        jln2.setFont(new Font("Arial", Font.BOLD, 14));

        jpn1.add(jln1, BorderLayout.WEST);
        jpn1.add(jln2, BorderLayout.CENTER);

        JPanel wrapperPanel = new JPanel(new BorderLayout());
        wrapperPanel.add(jpn1, BorderLayout.CENTER);
        boxmainnorth.add(wrapperPanel);

        jpn.add(boxmainnorth, BorderLayout.NORTH);
        this.add(jpn, BorderLayout.NORTH);
    	
    	
    	//jp center
    	jpc = new JPanel();
    	jpc.setLayout(new BorderLayout());
    	jpc.setPreferredSize(new Dimension(800,300));
    	jpcl = new JPanel();
    	jpcl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    	jpcl.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
    	jpcl.setSize(new Dimension(200,100));
    	
    	
    	box2 = box.createVerticalBox();
    	ImageIcon originalicon = new ImageIcon(getClass().getResource("/img/profile.png"));
    	Image img = originalicon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
    	ImageIcon reicon = new ImageIcon(img);
    	
    	jl2 = new JLabel(reicon);
    	
    	
    	jltaikhoan = new JLabel("Tên Tài Khoản");
    	txttaikhoan = new JTextField(10);
    	
    	jlmatkhau = new JLabel("Mật Khẩu");
    	txtmatkhau = new JTextField(10);
    	
    	jlvaitro = new JLabel("Vai Trò");
    	txtvaitro = new JTextField(10);
    	//add    
    	box2.add(jl2);
    	box2.add(jltaikhoan);
    	box2.add(txttaikhoan);
    	box2.add(jlmatkhau);
    	box2.add(txtmatkhau);
    	box2.add(jlvaitro);
    	box2.add(txtvaitro);
    	jpcl.add(box2);
    	jpc.add(jpcl,BorderLayout.WEST);
    	jpc.add(box.createHorizontalStrut(20));
    	jpcc = new JPanel();
    	jpcc.setSize(300,250);
    	jpcc.setBackground(Color.LIGHT_GRAY);
    	jpc.add(jpcc,BorderLayout.CENTER);
    	
    	
    	//jp center-right
    	jpcr = new  JPanel();
 
    	boxmainjpcr = box.createVerticalBox();
    	boxmainjpcr.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
    	ImageIcon originalicon1 = new ImageIcon(getClass().getResource("/img/profile.png"));
    	Image img1 = originalicon1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
    	ImageIcon reicon1 = new ImageIcon(img1);
    	
    	jl2 = new JLabel(reicon1);
    	
    	boxjpcr = box.createVerticalBox();
    	jltaikhoan1 = new JLabel("Tên Tài Khoản");
    	txttaikhoan1 = new JTextField(10);
    	
    	jlmatkhau1 = new JLabel("Mật Khẩu");
    	txtmatkhau1 = new JTextField(10);
    	
    	jlvaitro1 = new JLabel("Vai Trò");
    	txtvaitro1 = new JTextField(10);
    	
    	
    	boxjpcr.add(jltaikhoan1);
    	boxjpcr.add(txttaikhoan1);
    	boxjpcr.add(jlmatkhau1);
    	boxjpcr.add(txtmatkhau1);
    	boxjpcr.add(jlvaitro1);
    	boxjpcr.add(txtvaitro1);
    	
    	jpcr.add(boxjpcr,BorderLayout.WEST);
    	jpcr.add(jl2,BorderLayout.WEST);
    	boxmainjpcr.add(jpcr);
    	
    	jpbutton = new JPanel();
    	jbuttonthem = new JButton("Thêm");
    	jbuttonxoa = new JButton("Xóa");
    	jbuttonsua = new JButton("Sửa");
    	
    	jpbutton.add(jbuttonthem);
    	jpbutton.add(jbuttonxoa);
    	jpbutton.add(jbuttonsua);
    	boxmainjpcr.add(jpbutton);
    	
    	jpc.add(boxmainjpcr,BorderLayout.EAST);
    	
    	this.add(jpc,BorderLayout.CENTER);
    	
    	jps = new JPanel();
    	jps.setBackground(Color.LIGHT_GRAY);
    	boxsouth = box.createVerticalBox();
    	jls1 = new JLabel("Danh Sách ");
    	boxsouth.add(jls1);
    	jps1 = new JPanel();
    	jps1.setBackground(Color.LIGHT_GRAY);
    	jps1.setPreferredSize(new Dimension(800,300));
    	String coll[] = {"Tên Tài Khoản","Mật Khẩu","Vai Trò"};
    	
    	tablemodel = new DefaultTableModel(coll,0);
    	
    	table = new JTable(tablemodel);
    	table.setPreferredScrollableViewportSize(new Dimension(800, 300));
    	table.setFillsViewportHeight(true);
    	jps1.add(scrollpane = new JScrollPane(table));
    	scrollpane.setBorder(BorderFactory.createLineBorder(Color.black,1,true));
    	boxsouth.add(jps1);
    	jps.add(boxsouth);
    	this.add(jps,BorderLayout.SOUTH);
		this.jbuttonthem.addActionListener(this);
    }
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			if(o == jbuttonthem){
				dao.addAccounts(getInfo());
				JOptionPane.showMessageDialog(this, "Thêm thành công");
			}
		}

		public Account getInfo(){
			String id = AccountDAO.generateID();
			return new Account(id, txttaikhoan1.getText(), txtmatkhau1.getText(), Integer.parseInt(txtvaitro1.getText()));
		}
}
