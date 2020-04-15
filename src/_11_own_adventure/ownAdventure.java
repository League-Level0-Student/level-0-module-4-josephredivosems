package _11_own_adventure;

import javax.swing.JOptionPane;

public class ownAdventure {
public static void main(String[] args) {
	
	int task = JOptionPane.showOptionDialog(null, "You are a prince trying to save a princess stuck inside a castle guarded by dragons. What do you want to do first?", "Choice 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Order your army to create a distraction while you stealthly invade the castle ", "Order your army to kill the dragons with obsidian pointed arrows",}, null);
	int tasktwo = 0;
	int taskthree = 5;
	if(task == 0) {
	tasktwo = JOptionPane.showOptionDialog(null, "Your army completely gets obliterated by the dragons and you succesfully make it to castle.", "Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Stay in castle forever with princess","Try to climb up dragon's back to escape",}, null);	
	}
	else if(task == 1) {
	 tasktwo =	JOptionPane.showOptionDialog(null,"You and your army were able to kill 10 dragons and there are only twenty left. Unfortunatley, only a third o yourr army survived" ,"Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Abandon princess at the castle","Make camoflauge out of leaves and steathily make it to the castle",}, null);
	}
	if(tasktwo == 0&& task == 0) {
		JOptionPane.showMessageDialog(null, "The dragons destroy the castle after three days and you and the princess surrender to the dragons");
		}
	else if(tasktwo == 1 && task ==  0) {
		 taskthree =JOptionPane.showOptionDialog(null, "You and the princess climn onto the dragon's back. Dragon notices you and takes off flying. You notice a lake below.", "Choice 3", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Keep flying","Or jump into the lake",}, null);
	}
	if(tasktwo == 0 && task == 1) {
		JOptionPane.showMessageDialog(null, "You abandon the princess at the castle and soon the dragons come back to the kingdom to obliterate it");
	}
	else if(tasktwo == 1 && task == 1) {
		JOptionPane.showMessageDialog(null, "Halfway through the field you realize the dragons are blind and the only use smell so they end you easily");
	}
	if(taskthree == 0) {
		JOptionPane.showMessageDialog(null, "You ride the dragon and all the other dragons follow behind.\n"
				+ "The dragon you're riding turns its head towards you and shoots a large explosive fireball that kills the rest of \n"
				+ "the dragons and the only one left is the one you are riding. You get shaken off the dragon and you and the princess \n"
				+ "fall into the lake. Luckily, the rest of the archers from your army kill the last dragon");
	}
	else if(taskthree == 1) {
		JOptionPane.showMessageDialog(null, "You fal into the lake but the dragons easily end you");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
