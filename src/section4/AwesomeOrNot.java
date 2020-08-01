package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int a = new Random().nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("what do you think is awesome?");
	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!
if (a==0) {
	JOptionPane.showMessageDialog(null, "that is an awesome choice!");
}
	// 6. If the random number is 1
if (a==1) {
	JOptionPane.showMessageDialog(null, "that is an ok choice.");
}
	// -- tell the user whatever they entered is ok.
if (a==2) {
	JOptionPane.showMessageDialog(null, "that is a boring choice!");
}
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if (a==3) {
	JOptionPane.showMessageDialog(null, "that is a strange choice!");
}
	// -- write your own answer


	
	}
	}

	
	

