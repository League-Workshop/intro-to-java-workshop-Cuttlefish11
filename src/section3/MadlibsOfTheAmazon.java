package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself crossing a piranha-infested river, here's how to do it..." );
		// Get the user to enter an adjective
String input1 = JOptionPane.showInputDialog("write an adjective");
		// Get the user to enter a type of liquid
		String input2 = JOptionPane.showInputDialog("write a type of liquid");
		// Get the user to enter a body part
		String input3 = JOptionPane.showInputDialog("write a body part");
		// Get the user to enter a verb
		String input4 = JOptionPane.showInputDialog("write a verb");
		// Get the user to enter a place
		String input5 = JOptionPane.showInputDialog("write a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more " + input1 + "during the day, so cross the river at night. Piranhas are attracted to fresh " + input2 + " and will mostlikely take a bite out of your\n" + input3 + " if you " + input4 + " Whatever you do, if you have an open wound, try to find another way to get back to the\n "+ input5 + ".Good luck!");
	}
}

