public class MastermindTester
{
	public static void main(String[] args)
	{
		Mastermind game = new Mastermind();
		game.userinterface();
		game.populateBoard();
		while (game.failcount!=6)
		{
			game.populateUser();
			game.checkBoards();
		}
		if(game.failcount==6)
		{
			System.out.println("You lose");
		}
		
	}
}
