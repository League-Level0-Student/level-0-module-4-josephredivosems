package _11_own_adventure;

import javax.swing.JOptionPane;

public class ownAdventure {
public static void main(String[] args) {
	
	int task = JOptionPane.showOptionDialog(null, "You are a prince trying to save a princess stuck inside a castle guarded by dragons. What do you want to do first?", "Choice 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Order your army to create a distraction while you stealthly invade the castle ", "Order your army to kill the dragons with obsidian pointed arrows",}, null);
	int tasktwo = 0;
	if(task == 0) {
	tasktwo = JOptionPane.showOptionDialog(null, "Your army completely gets obliterated by the dragons and you succesfully make it to castle.", "Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Stay in castle forever with princess","Try to climb up dragon's back to escape",}, null);	
	}
	else if(task == 1) {
	 tasktwo =	JOptionPane.showOptionDialog(null,"You and your army were able to kill 10 dragons and there are only twenty left. Unfortunatley, only a third o yourr army survived" ,"Choice 2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String [] {"Abandon princess at the castle","Make camoflauge out of leaves and steathily make it to the castle",}, null);
	}
	if(tasktwo == 0&& task == 0) {
		JOptionPane.showMessageDialog(null, "The dragons destroy the castle after three days and you and the princess die");
		}
	else if(tasktwo == 1 && task ==  0) {
		JOptionPane.showOptionDialog(null, "You climb up ", title, optionType, messageType, icon, options, initialValue)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
