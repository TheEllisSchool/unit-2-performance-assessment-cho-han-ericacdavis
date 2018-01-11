
public class loadedDie extends roll{
// has to be random, but be somewhat loaded
	public loadedDie() {
		super();
	}
	//generate odd number 
	public int generateRoll() {
		int something = (int) (Math.random() * 100) + 1;
		if (something <= 80) {
			int allNumRoll = (int) (Math.random()* getSideNum()) + 1;
			int roll = allNumRoll *2 -1;
			return roll;
		}
		else {
			int allNumRoll = (int) (Math.random()* getSideNum()) + 1;
			int roll = allNumRoll *2;
			return roll;
			}
		
	}
}
