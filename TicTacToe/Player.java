package bg.uni_sofia.fmi.morskishah;
import java.util.Scanner;

public class Player {

	private char sign;

	Player(char sign)
	{
		this.sign=sign;
	}
	public char getSign() {
		return sign;
	}
	public void setSign(char sign) {
		this.sign = sign;
	}
	
	public void setSignAt(Board board)
	{
		System.out.print("Make your choice[1-9]: ");
		int input=cin();
		int i=0;
		int j=input%3;
		if(input>2&&input<6)
			i=1;
		else if(input<9&&input>5)
				i=2;

		while(board.checkOverwrite(i, j))
		{
			System.out.println("Position taken, enter new position: ");
			input=cin();
			i=0;
			j=input%3;
			if(input>2&&input<6)
				i=1;
			else if(input<9&&input>5)
					i=2;
		}
		board.setBoardEl(i, j, sign);
	}
	private int cin()
	{
		Scanner scanner = new Scanner(System.in);
		String inpute = scanner.nextLine() ;
		int input=Integer.parseInt(inpute)-1;
		return input;
	}
}
