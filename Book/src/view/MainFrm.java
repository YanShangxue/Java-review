package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table =null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
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
	public MainFrm() {
		setTitle("�������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("�������");
		mnNewMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/base.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("�鼮������");
		mnNewMenu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/bookTypeManager.png")));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem menuItem = new JMenuItem("�鼮������");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookTypeAddInterFrm bookTypeAddInterFrm=new BookTypeAddInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				table.add(bookTypeAddInterFrm);
			}
		});
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/add.png")));
		mnNewMenu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("�鼮���ά��");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookTypeManageInterFrm bookTypeManageInterFrm=new BookTypeManageInterFrm();
				bookTypeManageInterFrm.setVisible(true);
				table.add(bookTypeManageInterFrm);
			}
		});
		menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/edit.png")));
		mnNewMenu_1.add(menuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("�鼮����");
		mnNewMenu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/bookManager.png")));
		mnNewMenu.add(mnNewMenu_2);
		
		JMenuItem menuItem_2 = new JMenuItem("�鼮���");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookAddInterFrm bookAddInterFrm=new BookAddInterFrm();
				bookAddInterFrm.setVisible(true);
				table.add(bookAddInterFrm);
			}
		});


		menuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/add.png")));
		mnNewMenu_2.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("�鼮ά��");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookManageInterFrm bookManageInterFrm=new BookManageInterFrm();
				bookManageInterFrm.setVisible(true);
				table.add(bookManageInterFrm);
			}
		});
		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/edit.png")));
		mnNewMenu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("�˳��̳�");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "�Ƿ��˳�ϵͳ");
				if(result==0){
					dispose();
				}
			}
		});
		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/exit.png")));
		mnNewMenu.add(menuItem_4);
		
		JMenu menu = new JMenu("���ڳ��������");
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/about.png")));
		menuBar.add(menu);
		
		JMenuItem mntmjava = new JMenuItem("yanshangxue");
		mntmjava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				yanshangxueInterFrm java1234InterFrm=new yanshangxueInterFrm();
				java1234InterFrm.setVisible(true);
				table.add(java1234InterFrm);
			}
		});
		mntmjava.setIcon(new ImageIcon(MainFrm.class.getResource("/images/about.png")));
		menu.add(mntmjava);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		table = new JDesktopPane();
		contentPane.add(table, BorderLayout.CENTER);
		
		// ����JFrame���
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
