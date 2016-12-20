package bg.uni_sofia.fmi.morskishah;

public class Game {
	private Board board = new Board();
	Player player1=new Player('X');
	Player player2=new Player('0');
	public void runGame()
	{
		board.createBoard();
		startGame();
	}
	private void startGame()
	{
		board.printBoard();
		int counter=0;		
		while(!board.endGame())
		{
			if(counter%2==0)
				player1.setSignAt(board);
			else 
				player2.setSignAt(board);
			counter++;
			board.printBoard();
		}
		if (board.checkForWinner())
		{
			Player player;
			if(counter%2==0)
				player=player2;
			else player=player1;
			System.out.println("Winner is Player "+player.getSign());
		}
		
	}
}
