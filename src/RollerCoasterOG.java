import javax.swing.JOptionPane;

public class RollerCoasterOG {
public static void main(String[] args) {
	String quantity = JOptionPane.showInputDialog("What height are you in inches?");
	int num = Integer.parseInt(quantity);
	if (num > 48) {
		JOptionPane.showMessageDialog(null, "You are tall enough to go on the ride");
	}
	else if (num < 48) {
		JOptionPane.showMessageDialog(null, "Maybe you should grow first");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
