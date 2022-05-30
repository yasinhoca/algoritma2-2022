package alg22no;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class ders37_form_eventler extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders37_form_eventler frame = new ders37_form_eventler();
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
	public ders37_form_eventler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("New button");
		
		btn.setForeground(Color.YELLOW);
		btn.setBackground(Color.BLUE);
		btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn.setBounds(142, 10, 154, 74);
		contentPane.add(btn);
		
		JLabel lbl = new JLabel("New label");
		lbl.setBounds(127, 131, 147, 80);
		lbl.setOpaque(true);
		lbl.setBackground(new Color(255,255,255));
		contentPane.add(lbl);
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn.setBackground(Color.ORANGE);
				btn.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn.setBackground(Color.BLUE);
				btn.setForeground(Color.YELLOW);
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				btn.setBackground(Color.GREEN);
				btn.setForeground(Color.WHITE);
			}
		});
	}
}
