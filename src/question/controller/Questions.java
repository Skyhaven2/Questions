package question.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner myScanner;

	public Questions()
	{
		myScanner = new Scanner(System.in);
	}

	public void start()
	{
		askQuestionsGUI();
	}

	private void askNumbers()
	{
		System.out.println("1 +");
		int number1 = myScanner.nextInt() + 1;
		int number2 = number1;
		System.out.println("= " + number1);
		System.out.println("+");
		number2 = myScanner.nextInt() + number1;
		number1 = number2;
		System.out.println("= " + number2);
		System.out.println("*");
		number1 = myScanner.nextInt() * number2;
		number2 = number1;
		System.out.println("= " + number1);
		System.out.println("/");
		number2 = number1 / myScanner.nextInt();
		number1 = number2;
		System.out.println("= " + number2);
		System.out.println("-");
		number1 = number2 - myScanner.nextInt();
		number2 = number1;
		System.out.println("= " + number1);
	}

	private void askQuestions()
	{

		System.out.println("What is your name?");
		String answer = myScanner.nextLine();
		answer = myScanner.nextLine();
		System.out.println("Wow, " + answer + " is a really cool name!");
		System.out.println("What is your favorite book?");
		answer = myScanner.nextLine();
		System.out.println(answer + " is a good book.");
		System.out.println("I like your shirt, do you like my screen?");
		answer = myScanner.nextLine();
		System.out.println("Well I appreciate your honesty.");
		System.out.println("Do you want to go to dinner tonight?");
		answer = myScanner.nextLine();
		System.out.println(answer + " was what I was thinking too.");
		System.out.println("I enjoyed talking to you. Did you enjoy my company?");
		answer = myScanner.nextLine();
		if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("I enjoyed your company too.");
		}
		else
		{
			System.out.println("Well, this is awkward.");
		}
		System.out.println("I am going to repeat what you say now");
		answer = myScanner.nextLine();
		System.out.println(answer);
		answer = myScanner.nextLine();
		System.out.println(answer);
		answer = myScanner.nextLine();
		System.out.println(answer);
		answer = myScanner.nextLine();
		System.out.println(answer);
		System.out.println("That was fun.");
		System.out.println("If you get an answer wrong from now on, I will shoot you.");
		System.out.println("Will you serve me as my slave?");
		answer = myScanner.nextLine();
		if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Will you buy me a Twix bar?");
			answer = myScanner.nextLine();
			if (answer.equalsIgnoreCase("Yes"))
			{
				System.out.println("You should give it to my friend Camron.");
			}
			else
			{
				System.out.println("Bang!!!");
			}
		}
		else
		{
			System.out.println("Bang!!!");
		}
		askNumbers();
		// I'm invisible. HAHAHAHAHA
	}
	
	private void askQuestionsGUI()
	{
		JOptionPane.showMessageDialog(null, "Do you like the color blue?");
		String myAnswer = JOptionPane.showInputDialog(null, "Do you like the color blue?");
		JOptionPane.showMessageDialog(null, myAnswer + "? Well I am the oppisite.");
		myAnswer = JOptionPane.showInputDialog(null, "Do you at least like pink?");
		JOptionPane.showMessageDialog(null, "Good, " + myAnswer + " is what I would say too.");
		myAnswer = JOptionPane.showInputDialog(null, "Do you like the Lord of the Rings?");
		JOptionPane.showMessageDialog(null, "Wow me too.");
		myAnswer = JOptionPane.showInputDialog(null, "We have a lot in common. Don't you agree?");
		JOptionPane.showMessageDialog(null, myAnswer + " is an unacceptable answer.");
		myAnswer = JOptionPane.showInputDialog(null, "Do you think your mother would aprove of this?");
		JOptionPane.showMessageDialog(null, "Oh, well if " + myAnswer + " is the case. Then I'll let her handle this.");
		myAnswer = JOptionPane.showInputDialog(null, "Now that your done talking to your mother. Would you like to play a game?");
		JOptionPane.showMessageDialog(null, "To be honest with you, I didn't care what your answer was. We're playing it no matter what.");
		myAnswer = JOptionPane.showInputDialog(null, "If you got turned into a cat. What would you do?");
		JOptionPane.showMessageDialog(null, myAnswer + " is definitely not what I would do.");
		myAnswer = JOptionPane.showInputDialog(null, "Choose yes or no?");
		if (myAnswer.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null, "Big Fluffy Bunnies");
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "Crazy Undead Axeman");
		}
		JOptionPane.showMessageDialog(null, "Yes, random is fun.");
				
		
	}
}
