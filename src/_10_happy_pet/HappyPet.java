package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
		static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
			String petBought= JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(happinessLevel < 9) {
			for (int i = 0; i < 9; i++) {
				
			}
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happier?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "take a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	cuddle();
}
if(task == 1) {
	food();
}
if(task == 2) {
	takeAWalk();
}
		}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	JOptionPane.showMessageDialog(null, "Your pet is very tired. Lets give it a break");
	}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
public static void takeAWalk() {
	JOptionPane.showMessageDialog(null, "Heavy Breathing");
happinessLevel++;
JOptionPane.showMessageDialog(null, "Your pets's happines level is " + happinessLevel);

}
public static void cuddle() {
	JOptionPane.showMessageDialog(null, "Snore");
	happinessLevel+=2;
	JOptionPane.showMessageDialog(null, "Your pet's happines level is " + happinessLevel);
}
public static void food() {
	JOptionPane.showMessageDialog(null, "Chomp");
	happinessLevel+=3;
	JOptionPane.showMessageDialog(null, "Your pet's happines level is " + happinessLevel);
}
}