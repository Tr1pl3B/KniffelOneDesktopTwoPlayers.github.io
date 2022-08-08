package eu.de.bw.kn.hgs.itg20;

import java.util.Random;
import java.awt.Color;

public class WuerfelLogik {
	
	public static void dice() {
		
			if(WuerfelGUI.box_w1.isSelected() == false) {
				WuerfelGUI.lbl_w1.setText(Integer.toString(WuerfelLogik.random()));
			}
			if(WuerfelGUI.box_w2.isSelected() == false) {
				WuerfelGUI.lbl_w2.setText(Integer.toString(WuerfelLogik.random()));
		}
			if(WuerfelGUI.box_w3.isSelected() == false) {
				WuerfelGUI.lbl_w3.setText(Integer.toString(WuerfelLogik.random()));
			}
			if(WuerfelGUI.box_w4.isSelected() == false) {
				WuerfelGUI.lbl_w4.setText(Integer.toString(WuerfelLogik.random()));
			}
			if(WuerfelGUI.box_w5.isSelected() == false) {
				WuerfelGUI.lbl_w5.setText(Integer.toString(WuerfelLogik.random()));
			}
			
			WuerfelGUI.setI(WuerfelGUI.getI() + 1);
			
			WuerfelGUI.lblTurn.setText("Turn " + WuerfelGUI.getI() + " of 3");
	}
	
	public static int random() {
		Random r = new Random();
		return r.nextInt((6 - 1) + 1) + 1;
	}
	
	public static void next() {
		if(GUILogik.getClick() > 0) {
			WuerfelGUI.lbl_w1.setText("X");
			WuerfelGUI.lbl_w2.setText("X");
			WuerfelGUI.lbl_w3.setText("X");
			WuerfelGUI.lbl_w4.setText("X");
			WuerfelGUI.lbl_w5.setText("X");
		
			WuerfelGUI.box_w1.setSelected(false);
			WuerfelGUI.box_w2.setSelected(false);
			WuerfelGUI.box_w3.setSelected(false);
			WuerfelGUI.box_w4.setSelected(false);
			WuerfelGUI.box_w5.setSelected(false);
		
			WuerfelGUI.btnDice.setBackground(null);
		
			WuerfelGUI.setI(0);
		
			WuerfelGUI.lblTurn.setText("Turn");
		
			GUILogik.setCLick(0);
			
			GUILogik.setRound(GUILogik.getRound() + 1);
			
			if(GUILogik.getRound() > 25) {
				GUILogik.end();
			}
			
		}
	}
	
	public static void turnDone() {
		WuerfelGUI.btnDice.setBackground(Color.red);
	}
}
