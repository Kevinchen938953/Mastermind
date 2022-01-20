import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Mastermind
{
	ArrayList<String> test = new ArrayList<String>();
	//2d array list
	ArrayList<ArrayList<String>>board = new ArrayList<ArrayList<String>>();
	//How will human addd a four digit color band?
	public void populateBoard()
	{
		board.add(new ArrayList<String>());
		Scanner scan = new Scanner(System.in);
		System.out.print("What color do you want?");
		for(int i=0; i<4; i++)
		{
			String x = scan.nextLine();
			board.get(0).add(x);
		}
		board.add(new ArrayList<String>());
		for(int i=0; i<4; i++)
		{
			String y = scan.nextLine();
			board.get(1).add(y);
		}
		board.add(new ArrayList<String>());
		for(int i=0; i<4; i++)
		{
			String n = scan.nextLine();
			board.get(2).add(n);
		}
		board.add(new ArrayList<String>());
		for(int i=0; i<4; i++)
		{
			String p = scan.nextLine();
			board.get(3).add(p);
		}
		board.add(new ArrayList<String>());
		for(int i=0; i<4; i++)
		{
			String o = scan.nextLine();
			board.get(4).add(o);
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
