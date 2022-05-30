package alg22no;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ders39_sliderRGB extends JFrame {

	private JPanel contentPane;
	int r,g,b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ders39_sliderRGB frame = new ders39_sliderRGB();
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
	public ders39_sliderRGB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("");
		btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn.setBounds(99, 249, 398, 102);
		contentPane.add(btn);
		
		JSlider rs = new JSlider();
		
		rs.setPaintTicks(true);
		rs.setPaintLabels(true);
		rs.setMinorTickSpacing(5);
		rs.setMajorTickSpacing(50);
		rs.setValue(0);
		rs.setMaximum(255);
		rs.setBounds(27, 30, 520, 42);
		contentPane.add(rs);
		
		JSlider gs = new JSlider();
		gs.setValue(0);
		gs.setPaintTicks(true);
		gs.setPaintLabels(true);
		gs.setMinorTickSpacing(5);
		gs.setMaximum(255);
		gs.setMajorTickSpacing(50);
		gs.setBounds(27, 94, 520, 42);
		contentPane.add(gs);
		
		JSlider bs = new JSlider();
		bs.setValue(0);
		bs.setPaintTicks(true);
		bs.setPaintLabels(true);
		bs.setMinorTickSpacing(5);
		bs.setMaximum(255);
		bs.setMajorTickSpacing(50);
		bs.setBounds(27, 163, 520, 42);
		contentPane.add(bs);
		
		rs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				r = rs.getValue();
				g = gs.getValue();
				b = bs.getValue();
				rs.setBackground(new Color(r,0,0));
				btn.setBackground(new Color(r,g,b));
			}
		});
		
		gs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				r = rs.getValue();
				g = gs.getValue();
				b = bs.getValue();
				gs.setBackground(new Color(0,g,0));
				btn.setBackground(new Color(r,g,b));
			}
		});
		
		bs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				r = rs.getValue();
				g = gs.getValue();
				b = bs.getValue();
				bs.setBackground(new Color(0,0,b));
				btn.setBackground(new Color(r,g,b));
			}
		});
		
	}
}
