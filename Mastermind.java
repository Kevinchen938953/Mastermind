import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//Created by Kevin Chen
//Mastermind Games with Integers
//Latest Update on Feb 3 2022.



public class Mastermind
{
	ArrayList<String> test = new ArrayList<String>();
	//2d array list
	
	//How will human addd a four digit color band?
	int[] answers = new int[4];
	int[] userinputs = new int[4];
	int failcount = 0;
	/*Number version of mastermind. 
	answers array is populated with random numbers from 1 to 6
	userinputs array is populated by user inputs: values are from 1 to 6
	*/
	
	/*
	- userinterface method prints out instructions for the player
	*/
	public void userinterface()
	{
		System.out.println("Welcome to Mastermind!");
		System.out.println("\n");
		System.out.println("You will guess values from 1 to 6 where each number represents a distinct color");
		System.out.println("\n");
		System.out.println("The computer will guess four random values from 1 to 6. You will need to guess the numbers in this order");
		System.out.println("\n");
		System.out.println("You will receive a W for White pin if you have guessed the correct number in wrong position");
		System.out.print("\n");
		System.out.println("You will receive a R for Red Pin if you guessed a value in right position");
		System.out.println("\n");
		System.out.println("You have six attempts to guess the correct order. If you do, then you win");
	}
	/*
	Method populate board populates the answers array with four randomly generated numbers from one to four. Each number represents a distinct color
	Nested for loops are used to check overlaps within the answers array
	*/
	
	
	public void populateBoard()
	{
		//Colors are red, green, blue, yellow, cyan and purple
		//number 1 equals red, 2 equals green, 3 equals blue, four equals yellow five equals cyan six equals purple
		for(int z=0; z<answers.length; z++)
		{
			for(int i=z+1; i<answers.length; i++)
			{
				while(answers[z]==answers[i])
				{
					int numguess = (int)(Math.random()*5)+1;
					answers[i] = numguess;//Populates answers array with random numbers. No repeats are allowed
				}
			}
		}
	}
	/*
	populateUser method is used to ask for user input. Still needs to check overlap. User inputs numbers one to six and the array userinputs is filled with these values
	*/
	
	public void populateUser()
	{
	
		for( int x=0; x<4; x++)
		{
			
				
					Scanner scan = new Scanner(System.in);
			
					System.out.println("Enter your nummber 1 through 6");
					int picknum = scan.nextInt();
		    
					userinputs[x]=picknum;//user input array is populated
				
			
		}
	}
		
	
	/* 
	Checkboards method determines to place a Red Pin or White Pin depending if the userinputs array contains the same integer as the answers array either in the right or wrong psition
	Also determines when player wins and when player loses. 
	*/
		
		    
		
	
	public void checkBoards()
	{
		for(int k=0; k<userinputs.length; k++)
		{
			if(userinputs[k]==answers[k])//Returns all values that overlap
			{
				System.out.println("R" + " "  + userinputs[k]);
			}
			else if(userinputs[k]!=answers[k])
			{
				System.out.println("No Pin" + " " + userinputs[k]);//Returns all numbers that don't belong in the array
				
			}
		
	    }
	    for(int n=0; n<4; n++)
	    {
			for(int j=n+1; j<4; j++)
			{
				if(answers[n]==userinputs[j])
				{
					System.out.print("\n");
					System.out.println("W" + " " + answers[n]);//Determines the number that do overlap
				}
			}
		}
		if(answers[0]==userinputs[0] && answers[1]==userinputs[1] && answers[2]==userinputs[2] && answers[3]==userinputs[3])
		{
					System.out.println("You win the game");//If all values in arrays are the same, then win
		}
		else if(answers[0]!=userinputs[0] || answers[1]!=userinputs[1] || answers[2]!=userinputs[2] || answers[3]!=userinputs[3])
				{
					failcount++;//If they don't match, then the player needs to guess again. Fail count goes up until 6.
				}
			
	 }
	 
		
	 	   
	 		
	
}

