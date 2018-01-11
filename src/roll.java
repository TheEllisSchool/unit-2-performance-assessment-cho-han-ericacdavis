import javax.swing.JOptionPane;

public class roll {
	//import math random
//attributes
	private double sideNum;
	
//methods
	//roll will have to be a random number
//constructor
	public roll() {
		setSideNum(sideNum);
	}
	
	public void setSideNum(double sn) {
		String inputSides = JOptionPane.showInputDialog("How many sides are on the dice?");
		double is = Integer.parseInt(inputSides);
		if (is>=4) {
			is= sn;
			sn= sideNum;
		}
		else {
			System.out.println("Number of sides cannot be less than four, default to six");
			sideNum= 6;
		}
	}
	public double getSideNum() {
		return sideNum;
	}
	public String toString (){
		return "\n Side Num: " + sideNum;
	}
	public int generateRoll() {
		int rolledNum = (int) (Math.random() * sideNum) + 1;
		return rolledNum;
	}
}
