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
		board.get(0).add("R, G, B, Y, b, w, o, o");
		board.add(new ArrayList<String>());
		board.get(1).add("R, G, B, Y, b, w, o, o");
		board.add(new ArrayList<String>());
		board.get(2).add("R, G, B, Y, b, w, o, o");
		board.add(new ArrayList<String>());
		board.get(3).add("R, G, B, Y, b, w, o, o");
		board.add(new ArrayList<String>());
		board.get(4).add("R, G, B, Y, b, w, o, o");
		
		
	
		
	}
	public void printBoard()
	{
		for(int i=0; i<board.length(); i++)
		{
			System.out.println(board.get(i));
		}
	}
}
	
