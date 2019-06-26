//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int hi = 4;
	int myNumber = new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(hi);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog(null, "Type in a question");
	// 5. If the random number is 0
	// -- tell the user "Yes"
	if (myNumber==0) {
	JOptionPane.showMessageDialog(null, "Yes");
	}
	// 6. If the random number is 1
	// -- tell the user "No"
	else if (myNumber==1) {
	JOptionPane.showMessageDialog(null, "No");
	}
	// 7. If the random number is 2
	// -- tell the user "Maybe you should ask Google?"
	else if (myNumber==2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	// 8. If the random number is 3
	// -- write your own answer
	else if (myNumber==3) {
	JOptionPane.showMessageDialog(null,  "FiGURE IT OUT YOURSELF U DUMB BUT");
	}
}
}
