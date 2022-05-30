package alg22no;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ders40_sifrelemeOrnek extends JFrame {

	private JPanel contentPane;
	private JTextField metin;
	private JTextField sifrelenmis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders40_sifrelemeOrnek frame = new ders40_sifrelemeOrnek();
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
	public ders40_sifrelemeOrnek() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		metin = new JTextField();
		metin.setFont(new Font("Tahoma", Font.BOLD, 20));
		metin.setBounds(10, 27, 540, 54);
		contentPane.add(metin);
		metin.setColumns(10);
		
		JButton btnNewButton = new JButton("Sezar \u015Eifreleme");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(135, 162, 256, 72);
		contentPane.add(btnNewButton);
		
		JSpinner km = new JSpinner();
		km.setModel(new SpinnerNumberModel(0, 0, 28, 1));
		km.setFont(new Font("Tahoma", Font.BOLD, 20));
		km.setBounds(213, 105, 93, 42);
		contentPane.add(km);
		
		sifrelenmis = new JTextField();
		sifrelenmis.setFont(new Font("Tahoma", Font.BOLD, 20));
		sifrelenmis.setColumns(10);
		sifrelenmis.setBounds(10, 274, 540, 54);
		contentPane.add(sifrelenmis);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = metin.getText();
				int kaydirma = (int) km.getValue();
				String kodlanmis="";
				String a = "abcçdefgðhýijklmnoöprsþtuüvyz";
				for(int i=0;i<s.length();i++) {
					char c = s.charAt(i);
					int konum=0;
					for(int j=0;j<a.length();j++) {
						if(c==' ') konum=-1; 
						else if(c==a.charAt(j)) konum=j;	
					}
					if(konum==-1) kodlanmis+=" ";
					else kodlanmis += a.charAt((konum+kaydirma)%29);
				}
				sifrelenmis.setText(kodlanmis);
			}
		});
		
		
	}
}
