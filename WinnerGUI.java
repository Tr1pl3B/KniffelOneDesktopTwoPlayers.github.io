package eu.de.bw.kn.hgs.itg20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class WinnerGUI extends JFrame {

	private JPanel contentPane;
	
	public static JLabel lbl_winner = new JLabel("");
	public static JLabel lbl_w1 = new JLabel("AND THE WINNER IS:");
	
	public static WinnerGUI frame = new WinnerGUI();

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
	public WinnerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(735, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_w1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_w1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_w1.setBounds(10, 11, 414, 46);
		contentPane.add(lbl_w1);
		
		lbl_winner.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lbl_winner.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_winner.setBounds(10, 68, 414, 151);
		contentPane.add(lbl_winner);
		
		JButton btn_exit = new JButton("exit");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinnerLogik.exit();
			}
		});
		btn_exit.setBounds(314, 227, 110, 23);
		contentPane.add(btn_exit);
	}
}
