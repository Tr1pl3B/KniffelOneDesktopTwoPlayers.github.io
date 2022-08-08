package eu.de.bw.kn.hgs.itg20;

public class GUILogik {
	
	private static int[] zahl = new int[5];
	
	private static int sum1 = 0;
	private static int gesO1 = 0;
	private static int gesO2 = 0;
	private static int gesU1 = 0;
	private static int gesU2 = 0;
	private static int round1 = 0;
	private static int player = 0;
	
	
	private static int click = 0;
	private static int[] d1 = new int[13];
	private static int[] d2 = new int[13];
	private static int[] s1 = new int[13];
	private static int[] s2 = new int[13];
	private static int[] zahlen = new int[6];
	
	public static void einer(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			sum1 = zahlen[0] * 1;
			if(Gui == "GUI" && d1[0] != 1 && player % 2 == 0) {
				gesO1();
				d1[0] = 1;
				GUI.lbl_1er.setText(Integer.toString(sum1));
				output1O();
				click++;
				sum1=0;
				p2();
			} else if (Gui== "GUI2" && d2[0] != 1 && player % 2 == 1) {
				gesO2();
				d2[0] = 1;
				GUI2.lbl_1er.setText(Integer.toString(sum1));
				output2O();
				click++;
				p1();
			}
		}
		
	}
	
	public static void zweier(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			sum1 = zahlen[1] * 2;
			if(Gui == "GUI" && d1[1] != 1 && player % 2 == 0) {
				gesO1();
				d1[1] = 1;
				GUI.lbl_2er.setText(Integer.toString(sum1));
				output1O();
				click++;
				p2();
			} else if (Gui== "GUI2" && d2[1] != 1 && player % 2 == 1) {
				gesO2();
				d2[1] = 1;
				GUI2.lbl_2er.setText(Integer.toString(sum1));
				output2O();
				click++;
				p1();
			}
		}
		resetCount();
	}
	
	public static void dreier(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			sum1 = zahlen[2] * 3;
			if(Gui == "GUI" && d1[2] != 1 && player % 2 == 0) {
				gesO1();
				d1[2] = 1;
				GUI.lbl_3er.setText(Integer.toString(sum1));
				output1O();
				click++;
				p2();
			} else if (Gui== "GUI2" && d2[2] != 1 && player % 2 == 1) {
				gesO2();
				d2[2] = 1;
				GUI2.lbl_3er.setText(Integer.toString(sum1));
				output2O();
				click++;
				p1();
			}
		}
		resetCount();
	}
	
	public static void vierer(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			sum1 = zahlen[3] * 4;
			if(Gui == "GUI"&& d1[3] != 1 && player % 2 == 0) {
				gesO1();
				d1[3] = 1;
				GUI.lbl_4er.setText(Integer.toString(sum1));
				output1O();
				click++;
				p2();
			} else if (Gui== "GUI2" && d2[3] != 1 && player % 2 == 1) {
				gesO2();
				d2[3] = 1;
				GUI2.lbl_4er.setText(Integer.toString(sum1));
				output2O();
				click++;
				p1();
			}
		}
		resetCount();
	}
	
	public static void fünfer(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			sum1 = zahlen[4] * 5;
			if(Gui == "GUI" && d1[4] != 1 && player % 2 == 0) {
				gesO1();
				d1[4] = 1;
				GUI.lbl_5er.setText(Integer.toString(sum1));
				output1O();
				click++;
				p2();
			} else if (Gui == "GUI2" && d2[4] != 1 && player % 2 == 1) {
				gesO2();
				d2[4] = 1;
				GUI2.lbl_5er.setText(Integer.toString(sum1));
				output2O();
				click++;
				p1();
			}
		}
		resetCount();
	}
	
	public static void sechser(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			sum1 = zahlen[5] * 6;
			if(Gui == "GUI" && d1[5] != 1 && player % 2 == 0) {
				gesO1();
				d1[5] = 1;
				GUI.lbl_6er.setText(Integer.toString(sum1));
				output1O();
				click++;
				p2();
			} else if (Gui== "GUI2" && d2[5] != 1 && player % 2 == 1) {
				gesO2();
				d2[5] = 1;
				GUI2.lbl_6er.setText(Integer.toString(sum1));
				output2O();
				click++;
				p1();
			}
		}
		resetCount();
	}
	
	public static void dreierPasch(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X" ) {
			insert();
			count();
			if(zahlen[0] > 2 || zahlen[1] > 2|| zahlen[2] > 2 || zahlen[3] > 2 || zahlen[4] > 2 || zahlen[5] > 2) {
				if(Gui == "GUI" && d1[6] != 1 && player % 2 == 0) {
					d1[6] = 1;
					GUI.lbl_dreier.setText(Integer.toString(sum()));
					output1U();
					click++;
					p2();
				} else if (Gui== "GUI2" && d2[6] != 1 && player % 2 == 1) {
					d2[6] = 1;
					GUI2.lbl_dreier.setText(Integer.toString(sum()));
					output2U();
					click++;
					p1();
				}
				
			}
		}
		resetCount();
	}
	
	public static void viererPasch(String Gui) {
		if(click < 1 && WuerfelGUI.lbl_w1.getText() != "X" ) {
			insert();
			count();
			if(zahlen[0] > 3 || zahlen[1] > 3|| zahlen[2] > 3 || zahlen[3] > 3 || zahlen[4] > 3 || zahlen[5] > 3) {
				if(Gui == "GUI" && d1[7] != 1 && player % 2 == 0) {
					d1[7] = 1;
					GUI.lbl_vierer.setText(Integer.toString(sum()));
					output1U();
					click++;
					p2();
				} else if (Gui== "GUI2" && d2[7] != 1 && player % 2 == 1) {
					d2[7] = 1;
					GUI2.lbl_vierer.setText(Integer.toString(sum()));
					output2U();
					click++;
					p1();
				}
			}
		}
		resetCount();
	}
	
	public static void fullHouse(String Gui) {
		if(click < 1  && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			if(zahlen[0] > 2 && zahlen[1] > 1 || zahlen[2] > 1 || zahlen[3] > 1 || zahlen[4] > 1 || zahlen[5] > 1) {
				if(Gui == "GUI" && d1[8] != 1 && player % 2 == 0) {
					fullout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[8] != 1 && player % 2 == 1) {
					fullout2();
					click++;
					p1();
				}	
			} else if(zahlen[1] > 2 && zahlen[0] > 1 || zahlen[2] > 1 || zahlen[3] > 1 || zahlen[4] > 1 || zahlen[5] > 1) {
				if(Gui == "GUI" && d1[8] != 1 && player % 2 == 0) {
					fullout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[8] != 1 && player % 2 == 1) {
					fullout2();
					click++;
					p1();
				}
			} else if(zahlen[2] > 2 && zahlen[0] > 1 || zahlen[1] > 1 || zahlen[3] > 1 || zahlen[4] > 1 || zahlen[5] > 1) {
				if(Gui == "GUI" && d1[8] != 1 && player % 2 == 0) {
					fullout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[8] != 1 && player % 2 == 1) {
					fullout2();
					click++;
					p1();
				}
			} else if(zahlen[3] > 2 && zahlen[0] > 1 || zahlen[1] > 1 || zahlen[2] > 1 || zahlen[4] > 1 || zahlen[5] > 1) {
				if(Gui == "GUI" && d1[8] != 1 && player % 2 == 0) {
					fullout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[8] != 1 && player % 2 == 1) {
					fullout2();
					click++;
					p1();
				}	
			} else if(zahlen[4] > 2 && zahlen[0] > 1 || zahlen[1] > 1 || zahlen[2] > 1 || zahlen[3] > 1 || zahlen[5] > 1) {
				if(Gui == "GUI" && d1[8] != 1 && player % 2 == 0) {
					fullout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[8] != 1 && player % 2 == 1) {
					fullout2();
					click++;
					p1();
				}
			}  else if(zahlen[5] > 2 && zahlen[0] > 1 || zahlen[1] > 1 || zahlen[2] > 1 || zahlen[3] > 1 || zahlen[4] > 1) {
				if(Gui == "GUI" && d1[8] != 1 && player % 2 == 0) {
					fullout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[8] != 1 && player % 2 == 1) {
					fullout2();
					click++;
					p1();
				} 
			}
		}
		resetCount();
	}
	
	private static void fullout1() {
		d1[8] = 1;
		GUI.lbl_house.setText("25");
		gesU1 = gesU1 + 25;
		GUI.lbl_gesU.setText(Integer.toString(gesU1));
	}
	
	private static void fullout2() {
		d2[8] = 1;
		GUI2.lbl_house.setText("25");
		gesU2 = gesU2 + 25;
		GUI2.lbl_gesU.setText(Integer.toString(gesU2));
	}
	
	
	
	public static void klein(String Gui) {
		if(click < 1  && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			if(zahlen[0] > 0 && zahlen[1] > 0 && zahlen[2] > 0 && zahlen[3] > 0) {
				if(Gui == "GUI" && d1[9] != 1 && player % 2 == 0) {
					kleinout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[9] != 1 && player % 2 == 1) {
					kleinout2();
					click++;
					p1();
				}
			} else if(zahlen[1] > 0 && zahlen[2] > 0 && zahlen[3] > 0 && zahlen[4] > 0) {
				if(Gui == "GUI" && d1[9]  != 1 && player % 2 == 0) {
					kleinout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[9] != 1 && player % 2 == 1) {
					kleinout2();
					click++;
					p1();
				}
			} else if(zahlen[2] > 0 && zahlen[3] > 0 && zahlen[4] > 0 && zahlen[5] > 0) {
				if(Gui == "GUI" && d1[9]  != 1 && player % 2 == 0) {
					kleinout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[9] != 1 && player % 2 == 1) {
					kleinout2();
					click++;
					p1();
				}
			}
		}
		resetCount();
	}
	
	private static void kleinout1() {
		d1[9]  = 1;
		GUI.lbl_klein.setText("30");
		gesU1 = gesU1 + 30;
		GUI.lbl_gesU.setText(Integer.toString(gesU1));
	}
	
	private static void kleinout2() {
		d2[9]  = 1;
		GUI2.lbl_klein.setText("30");
		gesU2 = gesU2 + 30;
		GUI2.lbl_gesU.setText(Integer.toString(gesU2));
	}
	
	
	
	public static void gross(String Gui) {
		if(click < 1  && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			if(zahlen[0] > 0 && zahlen[1] > 0 && zahlen[2] > 0 && zahlen[3] > 0 && zahlen[4] > 0) {
				if(Gui == "GUI" && d1[10] != 1 && player % 2 == 0) {
					grossout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[10] != 1 && player % 2 == 1) {
					grossout2();
					click++;
					p1();
				}
			} else if(zahlen[1] > 0 && zahlen[2] > 0 && zahlen[3] > 0 && zahlen[4] > 0 && zahlen[5] > 0) {
				if(Gui == "GUI" && d1[10] != 1 && player % 2 == 0) {
					grossout1();
					click++;
					p2();
				} else if(Gui== "GUI2" && d2[10] != 1 && player % 2 == 1) {
					grossout2();
					click++;
					p1();
				}
			}
		}
		resetCount();
	}
	
	private static void grossout1() {
		d1[10] = 1;
		GUI.lbl_gross.setText("40");
		gesU1 = gesU1 + 40;
		GUI.lbl_gesU.setText(Integer.toString(gesU1));
	}
	
	private static void grossout2() {
		d2[10] = 1;
		GUI2.lbl_gross.setText("40");
		gesU2 = gesU2 + 40;
		GUI2.lbl_gesU.setText(Integer.toString(gesU2));
	}
	
	
	
	public static void kniffel(String Gui) {
		if(click < 1  && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			count();
			if(zahlen[0] == 1 && zahlen[1] == 1 && zahlen[2] == 1 && zahlen[3] == 1 && zahlen[4] == 1 && zahlen[5] == 1) {
				if(Gui == "GUI" && d1[11] != 1 && player % 2 == 0) {
					d1[11] = 1;
					GUI.lbl_kniffel.setText("50");
					gesU1 = gesU1 + 50;
					GUI.lbl_gesU.setText(Integer.toString(gesU1));
					click++;
					p2();
					
				} else if(Gui== "GUI2" && d2[11] != 1 && player % 2 == 1) {
					d2[11]  = 1;
					GUI2.lbl_kniffel.setText("50");
					gesU2 = gesU2 + 50;
					GUI2.lbl_gesU.setText(Integer.toString(gesU2));
					click++;
					p1();
				}
			} 
		}
		resetCount();
	}
	
	public static void chance(String Gui) {
		if(click < 1  && WuerfelGUI.lbl_w1.getText() != "X") {
			insert();
			if(Gui == "GUI" && d1[12] != 1 && player % 2 == 0) {
				d1[12] = 1;
				GUI.lbl_chance.setText(Integer.toString(sum()));
				gesU1 = gesU1 + sum();
				GUI.lbl_gesU.setText(Integer.toString(gesU1));
				click++;
				p2();	
			} else if(Gui== "GUI2" && d2[12] != 1 && player % 2 == 1) {
				d2[12] = 1;
				GUI2.lbl_chance.setText(Integer.toString(sum()));
				gesU2 = gesU2 + sum();
				GUI2.lbl_gesU.setText(Integer.toString(gesU2));
				click++;
				p1();	
			}
		}
	}
	
	private static void p1() {
		GUI.lbl_Turn.setText("It's your turn");
		GUI2.lbl_Turn.setText("");
		player++;
		WuerfelLogik.next();
		resetCount();
	}
	
	private static void p2() {
		GUI2.lbl_Turn.setText("It's your turn");
		GUI.lbl_Turn.setText("");
		player++;
		WuerfelLogik.next();
		resetCount();
	}
	
	private static void insert() {
		try {
			zahl[0] = Integer.parseInt(WuerfelGUI.lbl_w1.getText());
			zahl[1] = Integer.parseInt(WuerfelGUI.lbl_w2.getText());
			zahl[2] = Integer.parseInt(WuerfelGUI.lbl_w3.getText());
			zahl[3] = Integer.parseInt(WuerfelGUI.lbl_w4.getText());
			zahl[4] = Integer.parseInt(WuerfelGUI.lbl_w5.getText());
		} catch(Exception e) {
			
		}
		
	}
	
	private static void count() {
		for(int i = 0; i < 5; i++) {
			switch(zahl[i]) {
			case 1:
				zahlen[0]++;
				break;
			case 2:
				zahlen[1]++;
				break;
			case 3:
				zahlen[2]++;
				break;
			case 4:
				zahlen[3]++;
				break;
			case 5:
				zahlen[4]++;
				break;
			case 6:
				zahlen[5]++;
			}
		}
	}
	
	public static void resetCount() {
		for(int i = 0; i < 5; i++) {
			zahlen[i] = 0;
		}
		for(int i = 0; i < 5; i++) {
			zahl[i] = 0;
		}
	}
	
	private static int sum() {
		int i = 0;
		for(int j = 0; j < 5; j++) {
			i = i + zahl[j];
		}
		return i;
	}
	
	private static void gesO1() {
		gesO1 = gesO1 + sum1;
	}
	
	private static void gesO2() {
		gesO2 = gesO2 + sum1;
	}
	
	private static void output1O(){
		GUI.lbl_ges.setText(Integer.toString(gesO1));
		if(gesO1 > 62 && gesO1 - 35 < 62) {
			GUI.lbl_35.setText("+35");
			gesO1 = gesO1 + 35;
		}
		GUI.lbl_gesO.setText(Integer.toString(gesO1));
		sum1 = 0;
	}
	
	private static void output2O(){
		GUI2.lbl_ges.setText(Integer.toString(gesO2));
		if(gesO2 > 62 && gesO2 - 35 < 62) {
			GUI2.lbl_35.setText("+35");
			gesO2 = gesO2 + 35;
		}
		GUI2.lbl_gesO.setText(Integer.toString(gesO2));
		sum1 = 0;
	}
	
	private static void output1U() {
		gesU1 = gesU1 + sum();
		GUI.lbl_gesU.setText(Integer.toString(gesU1));
	}
	
	private static void output2U() {
		gesU2 = gesU2 + sum();
		GUI2.lbl_gesU.setText(Integer.toString(gesU2));
	}
	
	public static void streichen(int i) {
		if(player % 2 == 0) {
			switch(i) {
			case 1:
				if(click < 1 && s1[0] != 1) {
					s1[0] = 1;
					GUI.lbl_1er.setText("---");
					click ++;
					p2();
				}
				break;
			case 2:
				if(click < 1 && s1[1] != 1) {
					s1[1] = 1;
					GUI.lbl_2er.setText("---");
					click ++;
					p2();
				}
				break;
			case 3:
				if(click < 1 && s1[2] != 1) {
					s1[2] = 1;
					GUI.lbl_3er.setText("---");
					click ++;
					p2();
				}
				break;
			case 4:
				if(click < 1 && s1[3] != 1) {
					s1[3] = 1;
					GUI.lbl_4er.setText("---");
					click ++;
					p2();
				}
				break;
			case 5:
				if(click < 1 && s1[4] != 1) {
					s1[4] = 1;
					GUI.lbl_5er.setText("---");
					click ++;
					p2();
				}
				break;
			case 6:
				if(click < 1 && s1[5] != 1) {
					s1[5] = 1;
					GUI.lbl_6er.setText("---");
					click ++;
					p2();
				}
				break;
			case 7:
				if(click < 1 && s1[6] != 1) {
					s1[6] = 1;
					GUI.lbl_dreier.setText("---");
					click ++;
					p2();
				}
				break;
			case 8:
				if(click < 1 && s1[7] != 1) {
					s1[7] = 1;
					GUI.lbl_vierer.setText("---");
					click ++;
					p2();
				}
				break;
			case 9:
				if(click < 1 && s1[8] != 1) {
					s1[8] = 1;
					GUI.lbl_house.setText("---");
					click ++;
					p2();
				}
				break;
			case 10:
				if(click < 1 && s1[9] != 1) {
					s1[9] = 1;
					GUI.lbl_klein.setText("---");
					click ++;
					p2();
				}
				break;
			case 11:
				if(click < 1 && s1[10] != 1) {
					s1[10] = 1;
					GUI.lbl_gross.setText("---");
					click ++;
					p2();
				}
				break;
			case 12:
				if(click < 1 && s1[11] != 1) {
					s1[11] = 1;
					GUI.lbl_kniffel.setText("---");
					click ++;
					p2();
				}
				break;
			case 13:
				if(click < 1 && s1[12] != 1) {
					s1[12] = 1;
					GUI.lbl_chance.setText("---");
					click ++;
					p2();
				}
			}
		}
	}
	
	public static void streichen2(int i) {
		if(player % 2 == 1) {
			switch(i) {
			case 1:
				if(click < 1 && s2[0] != 1) {
					s2[0] = 1;
					GUI2.lbl_1er.setText("---");
					click ++;
					p1();
				}
				break;
			case 2:
				if(click < 1 && s2[1] != 1) {
					s2[1] = 1;
					GUI2.lbl_2er.setText("---");
					click ++;
					p1();
				}
				break;
			case 3:
				if(click < 1 && s2[2] != 1) {
					s2[2] = 1;
					GUI2.lbl_3er.setText("---");
					click ++;
					p1();
				}
				break;
			case 4:
				if(click < 1 && s2[3] != 1) {
					s2[3] = 1;
					GUI2.lbl_4er.setText("---");
					click ++;
					p1();
				}
				break;
			case 5:
				if(click < 1 && s2[4] != 1) {
					s2[4] = 1;
					GUI2.lbl_5er.setText("---");
					click ++;
					p1();
				}
				break;
			case 6:
				if(click < 1 && s2[5] != 1) {
					s2[5] = 1;
					GUI2.lbl_6er.setText("---");
					click ++;
					p1();
				}
				break;
			case 7:
				if(click < 1 && s2[6] != 1) {
					s2[6] = 1;
					GUI2.lbl_dreier.setText("---");
					click ++;
					p1();
				}
				break;
			case 8:
				if(click < 1 && s2[7] != 1) {
					s2[7] = 1;
					GUI2.lbl_vierer.setText("---");
					click ++;
					p1();
				}
				break;
			case 9:
				if(click < 1 && s2[8] != 1) {
					s2[8] = 1;
					GUI2.lbl_house.setText("---");
					click ++;
					p1();
				}
				break;
			case 10:
				if(click < 1 && s2[9] != 1) {
					s2[9] = 1;
					GUI2.lbl_klein.setText("---");
					click ++;
					p1();
				}
				break;
			case 11:
				if(click < 1 && s2[10] != 1) {
					s2[10] = 1;
					GUI2.lbl_gross.setText("---");
					click ++;
					p1();
				}
				break;
			case 12:
				if(click < 1 && s2[11] != 1) {
					s2[11] = 1;
					GUI2.lbl_kniffel.setText("---");
					click ++;
					p1();
				}
				break;
			case 13:
				if(click < 1 && s2[12] != 1) {
					s2[12] = 1;
					GUI2.lbl_chance.setText("---");
					click ++;
					p1();
				}
			}
		}
	}
	
	public static void end() {
		GUI.lbl_gesA.setText(Integer.toString(gesU1 + gesO1));
		GUI2.lbl_gesA.setText(Integer.toString(gesU2 + gesO2));
		if(gesU1 + gesO1 > gesU2 + gesO2) {
			WinnerGUI.lbl_winner.setText("Player 1");
		} else if (gesU1 + gesO1 < gesU2 + gesO2){
			WinnerGUI.lbl_winner.setText("Player 2");
		} else {
			WinnerGUI.lbl_winner.setText("it's a draw");
			WinnerGUI.lbl_w1.setText("AND THE WINNER IS: NOBODY");
		}
		WinnerGUI.run();
	}
	
	public static void setCLick(int i){
		click = i;
	}

	public static int getClick() {
		return click;
	}
	
	public static void setRound(int i) {
		round1 = i;
	}
	
	public static int getRound() {
		return round1;
	}
}
