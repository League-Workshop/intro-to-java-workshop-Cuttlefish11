package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String A = JOptionPane.showInputDialog("10 + 10 = ?");
		if (A.equals("20")) {
		score += 1;
		}
		String B = JOptionPane.showInputDialog("20 + 15 = ?");
		if (B.equals("35")) {
		score += 1;
		}
		String C = JOptionPane.showInputDialog("blue + red = ?");
		if (C.equals("purple")) {
		score += 1;
		String D = JOptionPane.showInputDialog("what is round without\n a lid and inside golden treasure is hid");
		if (D.equals("egg")) {
		score += 1;
		}
		String E = JOptionPane.showInputDialog("?");
		if (E.equals("42")) {
		score += 1;
		}
		}
		JOptionPane.showMessageDialog(null, "your score is " + score);
		
		 
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
