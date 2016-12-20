package bg.uni_sofia.fmi.morskishah;

public class Board {
	char[][]board=new char[3][3];
	
	public void createBoard()
	{
		int a = 1;
		for(int i=0;i<3;i++)
		{
				for(int j=0;j<3;j++)
				{
					board[i][j]=(char) (a+'0');
					a++;
				}
		}
		printBoard();
		
	}
	public void printBoard()
	{
		for(int i=0;i<3;i++)
		{
				System.out.println("|   |   |   |");
				System.out.println("| "+board[i][0]+" | "+board[i][1]+" | "+board[i][2]+" |");
				System.out.println("|___|___|___|");
		}
	}
	public boolean checkForWinner()
	{
		
		if(board[0][0]==board[1][1]&&board[0][0]==board[2][2])
			return true;
		if(board[0][2]==board[1][1]&&board[1][1]==board[2][0])
			return true;
		for(int i=0;i<3;i++)
		{
			if(board[i][0]==board[i][1]&&board[i][2]==board[i][0])
				return true;
			if(board[0][i]==board[1][i]&&board[0][i]==board[2][i])
				return true;
		}
		return false;
	}
	private boolean checkIfFull()
	{
		int counter=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j]=='X'||board[i][j]=='O')
					counter++;
			}
		}
		if(counter==9)
			return true;
		return false;
	}
	public boolean endGame()
	{
		if(checkForWinner()||checkIfFull())
			return true;
		return false;
	}
	public void setBoardEl(int i,int j,char sign)
	{
			board[i][j]=sign;
	}
	public boolean checkOverwrite(int i,int j)
	{
		if(board[i][j]=='X'||board[i][j]=='O')
			return true;
		return false;
	}
}
	
