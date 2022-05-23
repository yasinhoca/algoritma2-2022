package alg22no;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ders36_form_uygulama extends JFrame {

	private JPanel contentPane;
	private JTextField sayi1;
	private JTextField sayi2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders36_form_uygulama frame = new ders36_form_uygulama();
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
	public ders36_form_uygulama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. Say\u0131y\u0131 giriniz:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(25, 26, 138, 34);
		contentPane.add(lblNewLabel);
		
		sayi1 = new JTextField();
		sayi1.setFont(new Font("Tahoma", Font.BOLD, 18));
		sayi1.setBounds(193, 26, 138, 30);
		contentPane.add(sayi1);
		sayi1.setColumns(10);
		
		JLabel lblSayyGiriniz = new JLabel("2. Say\u0131y\u0131 giriniz:");
		lblSayyGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSayyGiriniz.setBounds(25, 70, 138, 34);
		contentPane.add(lblSayyGiriniz);
		
		sayi2 = new JTextField();
		sayi2.setFont(new Font("Tahoma", Font.BOLD, 18));
		sayi2.setColumns(10);
		sayi2.setBounds(193, 70, 138, 30);
		contentPane.add(sayi2);
		
		JButton btnNewButton = new JButton("TOPLA");
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(90, 131, 154, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblsonuc = new JLabel("SONU\u00C7");
		lblsonuc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblsonuc.setBounds(122, 202, 89, 45);
		contentPane.add(lblsonuc);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int s1,s2,sonuc;
				s1 = Integer.parseInt(sayi1.getText());
				s2 = Integer.parseInt(sayi2.getText());
				sonuc = s1 + s2;
				lblsonuc.setText(Integer.toString(sonuc));
			}
		});
		
	}
}
