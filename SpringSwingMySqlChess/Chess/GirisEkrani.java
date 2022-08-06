package Chess;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GirisEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullaniciAdi;
	private JPasswordField txtPassword;
	public GirisEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 417);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Satranc Ogrenmeye ne Dersin :) ? ");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(SystemColor.infoText);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Ink Free", Font.BOLD, 37));
		lblNewLabel.setBounds(38, 36, 572, 57);

		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kullanici Ismi :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(139, 149, 98, 27);
		contentPane.add(lblNewLabel_1);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(257, 149, 171, 27);
		contentPane.add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sifre");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(139, 201, 98, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnGirisYap = new JButton("Giris Yap");
		
		btnGirisYap.setForeground(new Color(128, 0, 0));
		btnGirisYap.setBackground(new Color(107, 142, 35));
		btnGirisYap.setBounds(339, 282, 89, 23);
		contentPane.add(btnGirisYap);
		
		JButton btnKayitOl = new JButton("Kayit Ol");
		btnKayitOl.setForeground(new Color(128, 0, 0));
		btnKayitOl.setBackground(new Color(107, 142, 35));
		btnKayitOl.setBounds(179, 282, 89, 23);
		contentPane.add(btnKayitOl);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(257, 201, 171, 25);
		contentPane.add(txtPassword);
		
		btnGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ApplicationContext context=new ClassPathXmlApplicationContext("resources/app.xml");
				DatabaseManager manager=context.getBean(DatabaseManager.class);
				String password=String.valueOf(txtPassword.getPassword());
				if(manager.girisKontrol(txtKullaniciAdi.getText(),password)) {
					dispose();
					ChessFrame frame=new ChessFrame();
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null,"Kullanici Giris Islemi Basarili","",JOptionPane.INFORMATION_MESSAGE);
				}
				else 
					JOptionPane.showMessageDialog(null,"Kullanici Giris Islemi Basarisiz!!","",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnKayitOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DatabaseManager manager;
				JOptionPane.showMessageDialog(null,"Kullanici Kayit Islemi Basarili","",JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
