import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Mastermind
{
	ArrayList<String> test = new ArrayList<String>();
	//2d array list
	
	//How will human addd a four digit color band?
	int[] answers = new int[4];
	int[] userinputs = new int[4];
	int failcount = 0;
	//Number version of mastermind. 
	//answers array is populated with random numbers from 1 to 6
	//userinputs array is populated by user inputs: values are from 1 to 6
	
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
					answers[i] = numguess;
				}
			}
		}
		for( int x=0; x<4; x++)
		{
			for(int y=x+1; y<answer.length; y++)
			{
				while(answers[x]==userinputs[y])
				{
					Scanner scan = new Scanner(System.in);
			
					System.out.println("Enter your nummber 1 through 6");
					int picknum = scan.nextInt();
		    
					userinputs[x]=picknum;
				}
			}
		}
		for(int n=0; n<answers.length; n++)
		{
			System.out.print("\n");
			System.out.println(answers[n]);
		}
		
		    
		
	}
	public void checkBoards()
	{
		for(int k=0; k<userinputs.length; k++)
		{
			if(userinputs[k]==answers[k])
			{
				System.out.print("These numbers are in the correct position" + userinputs[k]);
			}
			else if(userinputs[k]!=answers[k])
			{
				System.out.print("These numbers are in the incorrect position" + userinputs[k]);
				failcount++;
			}
		
	    }
	    for(int n=0; n<4; n++)
	    {
			for(int j=n+1; j<4; j++)
			{
				if(answers[n]==userinputs[j])
				{
					System.out.print("\n");
					System.out.println("These numbers overlap" + " " + answers[n]);
				}
			}
		}
	 }  
	 		
	
}


