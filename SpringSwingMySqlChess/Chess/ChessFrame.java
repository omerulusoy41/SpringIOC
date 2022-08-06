package Chess;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ChessFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textA;
	private JTextField txtY;
	private JButton[][] butonlar;
	JPanel panel;
	private int y;
	private int indexX;
	private int comboIndex;
	public ChessFrame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(41, 48, 320, 320);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Merhaba ");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Ink Free", Font.PLAIN, 27));
		lblNewLabel.setBounds(41, 376, 320, 61);
		contentPane.add(lblNewLabel);
		
		butonlar=new JButton[8][8];
		koordinatAyarla();
		butonOlustur();
		paneleEkle();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Piyon", "Kale", "At", "Fil", "Vezir", "Sah"}));
		comboBox.setBounds(395, 48, 198, 36);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Secim Yap :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_1.setBounds(395, 11, 168, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tahta Uzerinden Bir");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setForeground(new Color(65, 105, 225));
		lblNewLabel_2.setBounds(395, 151, 198, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Konum Sec :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setForeground(new Color(65, 105, 225));
		lblNewLabel_3.setBounds(395, 217, 107, 26);
		contentPane.add(lblNewLabel_3);
		
		textA = new JTextField();
		textA.setBounds(507, 223, 47, 20);
		contentPane.add(textA);
		textA.setColumns(10);
		
		txtY = new JTextField();
		txtY.setBounds(561, 223, 52, 20);
		contentPane.add(txtY);
		txtY.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("A");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(527, 254, 19, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("1");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_1.setBounds(582, 254, 19, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JButton btnNewButton_1 = new JButton("Goster");
		btnNewButton_1.setBounds(465, 291, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ornek :");
		lblNewLabel_3_1.setForeground(new Color(65, 105, 225));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(436, 250, 55, 20);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnSifirla = new JButton("Sifirla");
		btnSifirla.setBounds(465, 325, 89, 23);
		contentPane.add(btnSifirla);
		
		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(21, 448, 21, 5);
		
	
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboIndex=comboBox.getSelectedIndex();
			}
		});
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					renkSifirla();
					y=Integer.parseInt(txtY.getText());
					String a=textA.getText();
					xAyarla(a);
					if(comboIndex==0)
						piyonAyarla();
					else if(comboIndex==1)
						kaleAyarla();
					else if(comboIndex==2)
						atAyarla();
					else if(comboIndex==3)
						filAyarla();
					else if(comboIndex==4)
						vezirAyarla();
					else if(comboIndex==5)
						sahAyarla();
			}
		});
		btnSifirla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				renkSifirla();
			}
		});
	}
	private void xAyarla(String a) {
		char[] karakterler={'A','B','C','D','E','F','G','H'};
		for(int i=0;i<karakterler.length;i++) {
			if(karakterler[i]==a.charAt(0)) {
				indexX=i;
				break;
			}
		}
		butonlar[indexX][y].setBackground(new Color(33,45,234));
		butonlar[indexX][y].setText("*");
	}
	private void renkSifirla()
	{
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					if(j%2==0)
						butonlar[i][j].setBackground(new Color(0,0,0));
					else
						butonlar[i][j].setBackground(new Color(255,255,255));
				}else {
					if(j%2==0)
						butonlar[i][j].setBackground(new Color(255,255,255));
					else
						butonlar[i][j].setBackground(new Color(0,0,0));
				}
				
			}
		}
	}
	private void butonOlustur(){
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				JButton btn=new JButton();
				btn.setOpaque(true);
				if(i%2==0) {
					if(j%2==0)
						btn.setBackground(new Color(0,0,0));
					else
						btn.setBackground(new Color(255,255,255));
				}else {
					if(j%2==0)
						btn.setBackground(new Color(255,255,255));
					else
						btn.setBackground(new Color(0,0,0));
				}
				
				btn.setBounds(i*40,j*40,40,40);
				butonlar[i][j]=btn;
			}
		}
	}
	private void koordinatAyarla() {
		for(int i=0;i<8;i++) {
			char[] harfler=new char[] { 'A','B','C','D','E','F','G','H'};
			JLabel lblNewLabel_4 = new JLabel(String.valueOf(harfler[i]));
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setBounds(i*40+53,11, 23, 26);
			
			JLabel lblNewLabel_5 = new JLabel(String.valueOf(i));
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
			lblNewLabel_5.setForeground(new Color(255, 255, 255));
			lblNewLabel_5.setBounds(10,i*40+56, 23, 26);
			contentPane.add(lblNewLabel_5);
			contentPane.add(lblNewLabel_4);
		}
	}
	public void paneleEkle() {
		panel.removeAll();
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				panel.add(butonlar[j][i]);
			}
		}
	}
	public  void piyonAyarla() {
		if(y==7) {
			butonlar[indexX][y-1].setBackground(new Color(123,23,44));
		}else if(y==0) {
			butonlar[indexX][y+1].setBackground(new Color(123,23,44));
		}else {
			butonlar[indexX][y-1].setBackground(new Color(123,23,44));
			butonlar[indexX][y+1].setBackground(new Color(123,23,44));
		}
	}
	public void kaleAyarla() {
		for(int i=0;i<8;i++) {
			butonlar[indexX][i].setBackground(new Color(123,23,44));
			butonlar[i][y].setBackground(new Color(123,23,44));
		}
		butonlar[indexX][y].setBackground(new Color(33,45,234));
	}
	public void filAyarla() {
		int tmpXArttir=indexX;
		int tmpXAzalt=indexX;
		int tmpYArttir=y;
		int tmpYAzalt=y;
		for(int i=0;i<8;i++) {
			tmpYAzalt--;
			tmpXAzalt--;
			tmpYArttir++;
			tmpXArttir++;
			if(tmpXAzalt>=0 && tmpYAzalt>=0) {
				butonlar[tmpXAzalt][tmpYAzalt].setBackground(new Color(123,23,44));
			}
			if(tmpXArttir<=7 && tmpYArttir<=7) {
				butonlar[tmpXArttir][tmpYArttir].setBackground(new Color(123,23,44));
			}
			if(tmpXAzalt>=0 && tmpYArttir<=7) {
				butonlar[tmpXAzalt][tmpYArttir].setBackground(new Color(123,23,44));
			}
			if(tmpXArttir<=7 && tmpYAzalt>=0) {
				butonlar[tmpXArttir][tmpYAzalt].setBackground(new Color(123,23,44));
			}
		}
	}
	public void atAyarla() {
		if(indexX-2 >=0) {
			if(y==0) {
				butonlar[indexX-2][y+1].setBackground(new Color(123,23,44));
			}else if(y==7) {
				butonlar[indexX-2][y-1].setBackground(new Color(123,23,44));
			}else {
				butonlar[indexX-2][y+1].setBackground(new Color(123,23,44));
				butonlar[indexX-2][y-1].setBackground(new Color(123,23,44));
			}
		}
		if(indexX+2 <= 7) {
			if(y==0) {
				butonlar[indexX+2][y+1].setBackground(new Color(123,23,44));
			}else if(y==7) {
				butonlar[indexX+2][y-1].setBackground(new Color(123,23,44));
			}else {
				butonlar[indexX+2][y+1].setBackground(new Color(123,23,44));
				butonlar[indexX+2][y-1].setBackground(new Color(123,23,44));
			}
		}
		if(y+2 <= 7) {
			if(indexX==0) {
				butonlar[indexX+1][y+2].setBackground(new Color(123,23,44));
			}else if(indexX==7) {
				butonlar[indexX-1][y+2].setBackground(new Color(123,23,44));
			}else {
				butonlar[indexX+1][y+2].setBackground(new Color(123,23,44));
				butonlar[indexX-1][y+2].setBackground(new Color(123,23,44));
			}
		}
		if(y-2 >= 0) {
			if(indexX==0) {
				butonlar[indexX+1][y-2].setBackground(new Color(123,23,44));
			}else if(indexX==7) {
				butonlar[indexX-1][y-2].setBackground(new Color(123,23,44));
			}else {
				butonlar[indexX+1][y-2].setBackground(new Color(123,23,44));
				butonlar[indexX-1][y-2].setBackground(new Color(123,23,44));
			}
		}
	}
	public void vezirAyarla() {
		filAyarla();
		kaleAyarla();
	}
	public void sahAyarla() {
		piyonAyarla();
		sahSagSol();
		sahCapraz();
	}
	private void sahSagSol() {
		if(indexX==7) {
			butonlar[indexX-1][y].setBackground(new Color(123,23,44));
		}else if(indexX==0) {
			butonlar[indexX+1][y].setBackground(new Color(123,23,44));
		}else {
			butonlar[indexX-1][y].setBackground(new Color(123,23,44));
			butonlar[indexX+1][y].setBackground(new Color(123,23,44));
		}
	}
	private void sahCapraz() {
		int tmpXAzalt=indexX;
		int tmpXArttir=indexX;
		int tmpYArttir=y;
		int tmpYAzalt=y;
		tmpXArttir++;
		tmpXAzalt--;
		tmpYArttir++;
		tmpYAzalt--;
		if(tmpXAzalt>=0 && tmpYAzalt>=0) {
			butonlar[tmpXAzalt][tmpYAzalt].setBackground(new Color(123,23,44));
		}
		if(tmpXArttir<=7 && tmpYArttir<=7) {
			butonlar[tmpXArttir][tmpYArttir].setBackground(new Color(123,23,44));
		}
		if(tmpXAzalt>=0 && tmpYArttir<=7) {
			butonlar[tmpXAzalt][tmpYArttir].setBackground(new Color(123,23,44));
		}
		if(tmpXArttir<=7 && tmpYAzalt>=0) {
			butonlar[tmpXArttir][tmpYAzalt].setBackground(new Color(123,23,44));
		}
	}

}
