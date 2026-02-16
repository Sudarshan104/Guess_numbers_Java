package com.guess;

import javax.swing.*;

public class GuessNum {
	

	public static void main(String[] args) {
		int computerNumber=(int)(Math.random()*100+1);
		int userAnswer=0;
		System.out.print("The correct answer would be:"+computerNumber);
		int count=1;
		while(userAnswer!=computerNumber) {
			String response=JOptionPane.showInputDialog(null,"Enter the guess between 1 and 100","Guessing number would be");
			userAnswer=Integer.parseInt(response);
			JOptionPane.showMessageDialog(null,""+determineGuess(userAnswer,computerNumber,count));
		}



	}
	public static String determineGuess(int userAnswer,int computerNumber,int count) {
		if(userAnswer<=0 || userAnswer>100) {
			count++;
			return "your guess is invalid";
			
		}
		else if(userAnswer == computerNumber) {
			count++;
			return "Correct! \n Total Guess:"+count;
		}else if(userAnswer>computerNumber) {
			count++;
			return "Your Guess is too high, try again \n try number"+count;
			
		}
		else if(userAnswer<computerNumber) {
			count++;
			return "Your guess is too low,try again \n try number"+count;
		}
		else {
			count++;
			return "Your guess is Incorrect"+count;
		}
	}

}
