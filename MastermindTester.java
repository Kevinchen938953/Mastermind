public class MastermindTester
{
	public static void main(String[] args)
	{
		Mastermind game = new Mastermind();//Construct an object of class Mastermind
		game.userinterface();//Call these two methods first
		game.populateBoard();
		while (game.failcount!=6)
		{
			game.populateUser();//Repeat user guesses and checking until attempts run out
			game.checkBoards();
		}
		if(game.failcount==6)
		{
			System.out.println("You lose");//When attempts run out, player loses the game. 
		}
		
	}
}
