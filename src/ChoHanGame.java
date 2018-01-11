import javax.swing.JOptionPane;

public class ChoHanGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//points
		int p1Points = 0;
		int p2Points = 0;
		
		int daRoll1 = 0;
		int daRoll2 = 0;
//actual game. place instances of class here 
		for (int i=0; i<5; i++) {
			int evenOrOdd= (int) (Math.random()* 2) + 1;
			if (evenOrOdd== 1) {
				roll regD = new roll();
				daRoll1 = regD.generateRoll();
			}
			else {
				loadedDie loadD = new loadedDie();
				daRoll1 = loadD.generateRoll();
			}
			int evenOrOdd2= (int) (Math.random()* 2) + 1;
			if (evenOrOdd2== 1) {
				roll regD2 = new roll();
				daRoll2 = regD2.generateRoll();
			}
			else {
				loadedDie loadD2 = new loadedDie();
				daRoll2 = loadD2.generateRoll();
			}
		
	
		String ChoorHan;
		if ((daRoll1 + daRoll2) %2==0) {
			ChoorHan= "Cho";
		}
		else {
			ChoorHan= "Han";
		}
		//have players wager on whether the roll is even or odd
		String player1= JOptionPane.showInputDialog("Player 1: Cho or Han?");
		String player2= JOptionPane.showInputDialog("Player 2: Cho or Han?");
		 if (player1.equals(ChoorHan)) {
			 p1Points++;
			 JOptionPane.showMessageDialog(null, "Nice guess! Player one's total is: " + p1Points);
		 }else { 
				 JOptionPane.showMessageDialog(null, "Player 1 is wrong" );
			 } 
		if (player2.equals(ChoorHan)) {
			 p2Points++;
			 JOptionPane.showMessageDialog(null, "Nice guess! Player two's total is: " + p2Points);
		 }else { 
				 JOptionPane.showMessageDialog(null, "Player 2 is wrong" );
			 }
		 }
		 
		
	}

}
