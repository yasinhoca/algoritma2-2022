package alg22no;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ders41_textField_eventleri extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders41_textField_eventleri frame = new ders41_textField_eventleri();
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
	public ders41_textField_eventleri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(183, 48, 215, 54);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl.setBounds(104, 129, 407, 69);
		contentPane.add(lbl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(141, 221, 301, 147);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("ali\nveli\nmehmet");
		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				lbl.setText(textField.getText());
			}
		});
	}
}
