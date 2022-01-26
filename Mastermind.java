import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Mastermind
{
	ArrayList<String> test = new ArrayList<String>();
	//2d array list
	ArrayList<ArrayList<String>>board = new ArrayList<ArrayList<String>>();
	//How will human addd a four digit color band?
	int[] answers = new int[6];
	int[] userinputs = new int[6];
	public void populateBoard()
	{
		//Colors are red, green, blue, yellow, cyan and purple
		//number 1 equals red, 2 equals green, 3 equals blue, four equals yellow five equals cyan six equals purple
		for(int i=0; i<6; i++)
		{
			int numguess = (int)(Math.random()*5)+1;
			answers[i] = numguess;
		}
		for( int x=0; x<6; x++)
		{
			Scanner scan = new Scanner(System.in);
			do{
				System.out.println("Enter your nummber 1 through 6");
		        int picknum = scan.nextInt();
		      }while(picknum<1 || picknum>5);
		      userinputs[x]=picknum;
		for(int n=0; n<6; n++)
		{
			for(int b=0; b<6; b++)
			{
				if(userinputs[b]==answers[i])
				{
					System.out.println("This value is in right position");
				}
				else if(userinputs[b]!=answers[i])
				{
					System.out.println("This is in wrong position");
				}
		     }
		}
		    
		
		}
			
		
		
	
		
		
	
		
	}
	public void printBoard()
	{
		for(int i=0; i<board.size(); i++)
		{
			System.out.println(board.get(i));
		}
	}
}
