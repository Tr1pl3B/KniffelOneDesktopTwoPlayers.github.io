package eu.de.bw.kn.hgs.itg20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class WuerfelGUI extends JFrame {

	private JPanel contentPane;
	
	public static JLabel lbl_w1 = new JLabel("X");
	public static JLabel lbl_w2 = new JLabel("X");
	public static JLabel lbl_w3 = new JLabel("X");
	public static JLabel lbl_w4 = new JLabel("X");
	public static JLabel lbl_w5 = new JLabel("X");
	public static JLabel lblTurn = new JLabel("Turn");
	
	public static JCheckBox box_w1 = new JCheckBox("hold?");
	public static JCheckBox box_w2 = new JCheckBox("hold?");
	public static JCheckBox box_w3 = new JCheckBox("hold?");
	public static JCheckBox box_w4 = new JCheckBox("hold?");
	public static JCheckBox box_w5 = new JCheckBox("hold?");
	
	public static JButton btnDice = new JButton("Dice");
	
	private static int i = 0;
	
	public static WuerfelGUI frame = new WuerfelGUI();


	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setResizable(false);
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
	public WuerfelGUI() {
		setTitle("Kniffel Wuerfel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(735, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lbl_w1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_w1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lbl_w1.setBounds(10, 11, 50, 50);
		contentPane.add(lbl_w1);
		lbl_w2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		lbl_w2.setBounds(101, 11, 50, 50);
		contentPane.add(lbl_w2);
		lbl_w3.setFont(new Font("Tahoma", Font.PLAIN, 35));

		lbl_w3.setBounds(192, 11, 50, 50);
		contentPane.add(lbl_w3);
		lbl_w4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		lbl_w4.setBounds(283, 11, 50, 50);
		contentPane.add(lbl_w4);
		lbl_w5.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		lbl_w5.setBounds(374, 11, 50, 50);
		contentPane.add(lbl_w5);
		
		lblTurn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTurn.setBounds(10, 98, 414, 14);
		
		
		box_w1.setBounds(5, 68, 60, 23);
		contentPane.add(box_w1);
		
		box_w2.setBounds(96, 68, 60, 23);
		contentPane.add(box_w2);
		
		box_w3.setBounds(187, 68, 60, 23);
		contentPane.add(box_w3);
		
		box_w4.setBounds(278, 68, 60, 23);
		contentPane.add(box_w4);
		
		box_w5.setBounds(369, 68, 60, 23);
		contentPane.add(box_w5);
		
		
		btnDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i < 3) {
					WuerfelLogik.dice();
				} else {
					WuerfelLogik.turnDone();
				}
			}
		});
		btnDice.setBounds(10, 120, 414, 80);
		contentPane.add(btnDice);
		
		contentPane.add(lblTurn);
	}
	
	public static void setI(int a) {
		i = a;
	}

	public static int getI() {
		return i;
	}
	
}
