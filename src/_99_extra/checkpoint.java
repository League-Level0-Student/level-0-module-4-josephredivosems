package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args) {
	String favColor = JOptionPane.showInputDialog("What is your favorite color?");

			JOptionPane.showMessageDialog(null, favColor + " is also my favorite color.");

Robot bob = new Robot("mini");

for (int i = 0; i < 3; i++) {
	bob.penDown();
	bob.turn(120);
	bob.move(100);
}

String favoriteHobby = "programming";
int numberOfToes = 10;
int degreesInARightAngle = 90;
int myAge = 13;
String programmingStyle = "Java";
double pi = 3.14159;
String whatIwantToBeWhenIGrowUp = "famous";
int facebookFriends = 0;
String myBirthday = "December 21st 2006";
int sidesInATriangle = 3;
String whatIgotForMyBirthday = "projecter";
String theLastMealIate = "taco";
String whatTimeIgoToBed = "nine o'clock";
int howManyRobotProgramsIhaveWritten = 10;
for (int i = 1; i < 11; i++) {
	System.out.println(i);
}
for (int i = 75; i < 49; i--) {
	System.out.println(i);
}
//a declares the variable
//b checks condition of variable
//changes the variables amount
String yes = "yes";
if(yes.equals("yes")) {
	System.out.println("happy");
}
else {
	System.out.println("sad");
}
System.out.println("wendesday");

int age = 13;
if(age < 20) {
	System.out.println("It's so great being young");
}
else {
	System.out.println("Don't you wish you were young");
}
String animalLiked = JOptionPane.showInputDialog("What animal do you like?");
if(animalLiked.equals("dog")) {
	JOptionPane.showMessageDialog(null, "dog goes woof");
}
else if(animalLiked.equals("cat")) {
	JOptionPane.showMessageDialog(null, "cat goes meow");
}
else if(animalLiked.equals("horse")) {
	JOptionPane.showMessageDialog(null, "horse goes yeehaw");
}
else {
	JOptionPane.showMessageDialog(null, "I don't know that animal");
}
Random ran = new Random();
int num = ran.nextInt(1000);

Random rann = new Random();
int numm = rann.nextInt();

Random rand = new Random();
int add = rand.nextInt(100);

Random rando = new Random();
int addTwo = rando.nextInt(100);

int sum = addTwo + add;

System.out.println(add +" + "+ addTwo +" = "+ sum );

Random randum = new Random();
int subtract = randum.nextInt(100);

Random random = new Random();
int minus = random.nextInt(100);

int difference = subtract + -minus;

System.out.println(subtract + " - " + minus + " = " + difference);

String cups = JOptionPane.showInputDialog("How many cups do u have?");
int dec = Integer.parseInt(cups);
if(dec < 2) {
	JOptionPane.showMessageDialog(null,"Go to the store and buy some more");
}

String deci = JOptionPane.showInputDialog("How many people are you giving to");
int cookies = Integer.parseInt(deci);
if(cookies > 30) {
	JOptionPane.showMessageDialog(null, "You will need to make 2 batches of cookies");
}

String cookes = JOptionPane.showInputDialog("How many batches did you make?");
int friends = Integer.parseInt(cookes);
if(friends == 2) {
	JOptionPane.showMessageDialog(null, "You are so lucky to have friends");
}

//printMessage();
//setName();
//getNumber(9);
for (int i = 1; i < 501; i++) {
	if(i % 2 == 0) {
		
	}
	else {
		System.out.println(i);
	}
}

for (int i = 0; i < 8; i++) {
if(i < 7){	System.out.println(i + " potato, ");

}
else if{
System.out.println("more");
}


 















































}
}
