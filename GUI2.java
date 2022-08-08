package eu.de.bw.kn.hgs.itg20;

import java.awt.BasicStroke;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI2 extends JFrame {

	private JPanel contentPane;
	
	public static JLabel lbl_1er = new JLabel("");
	public static JLabel lbl_2er = new JLabel("");
	public static JLabel lbl_3er = new JLabel("");
	public static JLabel lbl_4er = new JLabel("");
	public static JLabel lbl_5er = new JLabel("");
	public static JLabel lbl_6er = new JLabel("");
	public static JLabel lbl_ges = new JLabel("");
	public static JLabel lbl_35 = new JLabel("");
	public static JLabel lbl_gesO = new JLabel("");
	public static JLabel lbl_dreier = new JLabel("");
	public static JLabel lbl_vierer = new JLabel("");
	public static JLabel lbl_house = new JLabel("");
	public static JLabel lbl_klein = new JLabel("");
	public static JLabel lbl_gross = new JLabel("");
	public static JLabel lbl_kniffel = new JLabel("");
	public static JLabel lbl_chance = new JLabel("");
	public static JLabel lbl_gesU = new JLabel("");
	public static JLabel lbl_gesA = new JLabel("");
	public static JLabel lbl_Turn = new JLabel("");
	
	public static GUI2 frame = new GUI2();

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
	public GUI2() {
		setTitle("Kniffel");
		setTitle("Kniffel Player 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1370, 100, 450, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSpieler = new JLabel("Player 2");
		lblSpieler.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblSpieler.setBounds(183, 11, 59, 14);
		contentPane.add(lblSpieler);
		
		JLabel lblA_1 = new JLabel("1er");
		lblA_1.setBounds(10, 36, 100, 20);
		contentPane.add(lblA_1);
		
		JLabel lblA_2 = new JLabel("2er");
		lblA_2.setBounds(10, 67, 100, 20);
		contentPane.add(lblA_2);
		
		JLabel lblA_3 = new JLabel("3er");
		lblA_3.setBounds(10, 98, 100, 20);
		contentPane.add(lblA_3);
		
		JLabel lblA_4 = new JLabel("4er");
		lblA_4.setBounds(10, 129, 100, 20);
		contentPane.add(lblA_4);
		
		JLabel lblA_5 = new JLabel("5er");
		lblA_5.setBounds(10, 160, 100, 20);
		contentPane.add(lblA_5);
		
		JLabel lblA_6 = new JLabel("6er");
		lblA_6.setBounds(10, 191, 100, 20);
		contentPane.add(lblA_6);
		
		JLabel lblA_7 = new JLabel("gesamt");
		lblA_7.setBounds(10, 222, 100, 20);
		contentPane.add(lblA_7);
		
		JLabel lblA_8 = new JLabel("gesamt > 62 ");
		lblA_8.setBounds(10, 253, 100, 20);
		contentPane.add(lblA_8);
		
		JLabel lblA_9 = new JLabel("gesamt oben");
		lblA_9.setBounds(10, 284, 100, 20);
		contentPane.add(lblA_9);
		
		JLabel lblA_10 = new JLabel("Dreierpasch");
		lblA_10.setBounds(10, 315, 100, 20);
		contentPane.add(lblA_10);
		
		JLabel lblA_11 = new JLabel("Viererpasch");
		lblA_11.setBounds(10, 346, 100, 20);
		contentPane.add(lblA_11);
		
		JLabel lblA_12 = new JLabel("Full-House");
		lblA_12.setBounds(10, 377, 100, 20);
		contentPane.add(lblA_12);
		
		JLabel lblA_13 = new JLabel("Kleine Straﬂe");
		lblA_13.setBounds(10, 408, 100, 20);
		contentPane.add(lblA_13);
		
		JLabel lblA_14 = new JLabel("Groﬂe Straﬂe");
		lblA_14.setBounds(10, 439, 100, 20);
		contentPane.add(lblA_14);
		
		JLabel lblA_15 = new JLabel("Kniffel");
		lblA_15.setBounds(10, 470, 100, 20);
		contentPane.add(lblA_15);
		
		JLabel lblA16 = new JLabel("Chance");
		lblA16.setBounds(10, 501, 100, 20);
		contentPane.add(lblA16);
		
		JLabel lblA17 = new JLabel("gesamt unten");
		lblA17.setBounds(10, 532, 100, 20);
		contentPane.add(lblA17);
		
		JLabel lblA18 = new JLabel("Endsumme");
		lblA18.setBounds(10, 563, 100, 20);
		contentPane.add(lblA18);
		
		JLabel lblB_0 = new JLabel("nur Einer");
		lblB_0.setBounds(120, 36, 70, 20);
		contentPane.add(lblB_0);
		
		JLabel lblB_1 = new JLabel("nur Zweier");
		lblB_1.setBounds(120, 70, 70, 20);
		contentPane.add(lblB_1);
		
		JLabel lblB_2 = new JLabel("nur Dreier");
		lblB_2.setBounds(120, 101, 70, 20);
		contentPane.add(lblB_2);
		
		JLabel lblB_3 = new JLabel("nur Vierer");
		lblB_3.setBounds(120, 132, 70, 20);
		contentPane.add(lblB_3);
		
		JLabel lblB_4 = new JLabel("nur F\u00FCnfer");
		lblB_4.setBounds(120, 163, 70, 20);
		contentPane.add(lblB_4);
		
		JLabel lblB_5 = new JLabel("nur Sechser");
		lblB_5.setBounds(120, 194, 70, 20);
		contentPane.add(lblB_5);
		
		JLabel lblB_6 = new JLabel("gesamt + 35");
		lblB_6.setBounds(120, 253, 70, 20);
		contentPane.add(lblB_6);
		
		JLabel lblB_7 = new JLabel("alle Augen");
		lblB_7.setBounds(120, 315, 70, 20);
		contentPane.add(lblB_7);
		
		JLabel lblB_8 = new JLabel("alle Augen");
		lblB_8.setBounds(120, 346, 70, 20);
		contentPane.add(lblB_8);
		
		JLabel lblB_9 = new JLabel("25 Punkte");
		lblB_9.setBounds(120, 377, 70, 20);
		contentPane.add(lblB_9);
		
		JLabel lblB_10 = new JLabel("30 Punkte");
		lblB_10.setBounds(120, 408, 70, 20);
		contentPane.add(lblB_10);
		
		JLabel lblB_11 = new JLabel("40 Punkte");
		lblB_11.setBounds(120, 439, 70, 20);
		contentPane.add(lblB_11);
		
		JLabel lblB_12 = new JLabel("50 Punkte");
		lblB_12.setBounds(120, 470, 70, 20);
		contentPane.add(lblB_12);
		
		JLabel lblB_13 = new JLabel("alle Augen");
		lblB_13.setBounds(120, 501, 70, 20);
		contentPane.add(lblB_13);
		
		lbl_1er.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.einer("GUI2");
			}
		});
		lbl_1er.setBounds(200, 36, 135, 20);
		contentPane.add(lbl_1er);		
		lbl_2er.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.zweier("GUI2");
			}
		});
		lbl_2er.setBounds(200, 67, 135, 20);
		contentPane.add(lbl_2er);

		lbl_3er.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.dreier("GUI2");
			}
		});
		lbl_3er.setBounds(200, 98, 135, 20);
		contentPane.add(lbl_3er);
	
		lbl_4er.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.vierer("GUI2");
			}
		});
		lbl_4er.setBounds(200, 129, 135, 20);
		contentPane.add(lbl_4er);
		
		lbl_5er.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.f¸nfer("GUI2");
			}
		});
		lbl_5er.setBounds(200, 163, 135, 20);
		contentPane.add(lbl_5er);
		
		lbl_6er.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.sechser("GUI2");
			}
		});
		lbl_6er.setBounds(200, 194, 135, 20);
		contentPane.add(lbl_6er);
		
		lbl_ges.setBounds(200, 225, 224, 20);
		contentPane.add(lbl_ges);
		
		lbl_35.setBounds(200, 256, 224, 20);
		contentPane.add(lbl_35);
		
		lbl_gesO.setBounds(200, 287, 224, 20);
		contentPane.add(lbl_gesO);
		
		lbl_dreier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.dreierPasch("GUI2");
			}
		});
		lbl_dreier.setBounds(200, 318, 135, 20);
		contentPane.add(lbl_dreier);
		
		lbl_vierer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.viererPasch("GUI2");
			}
		});
		lbl_vierer.setBounds(200, 349, 135, 20);
		contentPane.add(lbl_vierer);
		
		lbl_house.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.fullHouse("GUI2");
			}
		});
		lbl_house.setBounds(200, 380, 135, 20);
		contentPane.add(lbl_house);
		
		lbl_klein.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.klein("GUI2");
			}
		});
		lbl_klein.setBounds(200, 411, 135, 20);
		contentPane.add(lbl_klein);
		
		lbl_gross.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.gross("GUI2");
			}
		});
		lbl_gross.setBounds(200, 442, 135, 20);
		contentPane.add(lbl_gross);
		
		lbl_kniffel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.kniffel("GUI2");
			}
		});
		lbl_kniffel.setBounds(200, 473, 135, 20);
		contentPane.add(lbl_kniffel);
		
		lbl_chance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUILogik.chance("GUI2");
			}
		});
		lbl_chance.setBounds(200, 504, 135, 20);
		contentPane.add(lbl_chance);
		
		lbl_gesU.setBounds(200, 535, 224, 20);
		contentPane.add(lbl_gesU);
		
		lbl_gesA.setBounds(200, 563, 224, 20);
		contentPane.add(lbl_gesA);
		
		JButton btn1 = new JButton("streichen");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(1);
			}
		});
		btn1.setBounds(335, 35, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("streichen");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(2);
			}
		});
		btn2.setBounds(335, 66, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("streichen");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(3);
			}
		});
		btn3.setBounds(335, 97, 89, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("streichen");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(4);
			}
		});
		btn4.setBounds(335, 128, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("streichen");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(5);
			}
		});
		btn5.setBounds(335, 159, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("streichen");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(6);
			}
		});
		btn6.setBounds(335, 190, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("streichen");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(7);
			}
		});
		btn7.setBounds(335, 314, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("streichen");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(8);
			}
		});
		btn8.setBounds(335, 345, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("streichen");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(9);
			}
		});
		btn9.setBounds(335, 376, 89, 23);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("streichen");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(10);
			}	
		});
		btn10.setBounds(335, 407, 89, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("streichen");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(11);
			}
		});
		btn11.setBounds(335, 438, 89, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("streichen");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(12);
			}
		});
		btn12.setBounds(335, 469, 89, 23);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("streichen");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUILogik.streichen2(13);
			}
		});
		btn13.setBounds(335, 500, 89, 23);
		contentPane.add(btn13);	
		
		lbl_Turn.setForeground(Color.RED);
		lbl_Turn.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lbl_Turn.setBounds(10, 11, 89, 14);
		contentPane.add(lbl_Turn);
	}
	
	 public void paint(Graphics g) {
		    super.paint(g);
		    Graphics2D g2 = (Graphics2D)g;
		    
		    //Horizontal
		    Line2D line0 = new Line2D.Double(0,61,450,61);
		    Line2D line1 = new Line2D.Double(0,92,450,92);
		    Line2D line2 = new Line2D.Double(0,123,450,123);
		    Line2D line3 = new Line2D.Double(0,154,450,154);
		    Line2D line4 = new Line2D.Double(0,185,450,185);
		    Line2D line5 = new Line2D.Double(0,216,450,216);
		    Line2D line6 = new Line2D.Double(0,247,450,247);
		    Line2D line7 = new Line2D.Double(0,278,450,278);
		    Line2D line8 = new Line2D.Double(0,309,450,309);
		    Line2D line9 = new Line2D.Double(0,340,450,340);
		    Line2D line10 = new Line2D.Double(0,371,450,371);
		    Line2D line11 = new Line2D.Double(0,402,450,402);
		    Line2D line12 = new Line2D.Double(0,433,450,433);
		    Line2D line13 = new Line2D.Double(0,464,450,464);
		    Line2D line14 = new Line2D.Double(0,495,450,495);
		    Line2D line15 = new Line2D.Double(0,526,450,526);
		    Line2D line16 = new Line2D.Double(0,557,450,557);
		    Line2D line17 = new Line2D.Double(0,588,450,588);
		    Line2D line18 = new Line2D.Double(0,619,450,619);
		    
		    //doppelt Horizontal
		    Line2D line19 = new Line2D.Double(0,249,450,249);
		    Line2D line20 = new Line2D.Double(0,280,450,280);
		    Line2D line21 = new Line2D.Double(0,311,450,311);
		    Line2D line22 = new Line2D.Double(0,342,450,342);
		    Line2D line23 = new Line2D.Double(0,559,450,559);
		    Line2D line24 = new Line2D.Double(0,590,450,590);
		    Line2D line25 = new Line2D.Double(0,621,450,621);
		    
		    //Vertikal
		    Line2D line26 = new Line2D.Double(8,61,8,620);
		    Line2D line27 = new Line2D.Double(120,61,120,620);
		    Line2D line28 = new Line2D.Double(205,61,205,620);
		    Line2D line29 = new Line2D.Double(441,61,441,620);
		    
		    //doppelt Vertikal
		    Line2D line30 = new Line2D.Double(203,61,203,620);
		    
		    g2.setStroke(new BasicStroke(1));
		    g2.draw(line0);
		    g2.draw(line1);
		    g2.draw(line2);
		    g2.draw(line3);
		    g2.draw(line4);
		    g2.draw(line5);
		    g2.draw(line6);
		    g2.draw(line7);
		    g2.draw(line8);
		    g2.draw(line9);
		    g2.draw(line10);
		    g2.draw(line11);
		    g2.draw(line12);
		    g2.draw(line13);
		    g2.draw(line14);
		    g2.draw(line15);
		    g2.draw(line16);
		    g2.draw(line17);
		    g2.draw(line18);
		    g2.draw(line19);
		    g2.draw(line20);
		    g2.draw(line21);
		    g2.draw(line22);
		    g2.draw(line23);
		    g2.draw(line24);
		    g2.draw(line25);
		    g2.draw(line26);
		    g2.draw(line27);
		    g2.draw(line28);
		    g2.draw(line29);
		    g2.draw(line30);
		    
	 }
}
