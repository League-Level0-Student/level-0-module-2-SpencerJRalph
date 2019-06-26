package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LottERYnumBAS {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	int myNumber = new Random().nextInt(10); {
		String lucky = "Your lucky numbers are: ";
		{lucky = lucky + myNumber;

	
	JOptionPane.showMessageDialog(null, lucky);}
	}
	}
}
}
