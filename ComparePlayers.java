package lab;

//**************************************************************
//ComparePlayers.java
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**************************************************************
import java.util.Scanner;
public class ComparePlayers
{
	public static void main(String[] args)
	{
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner scan = new Scanner(System.in);
		
		//Prompt for and read in information for player 1
		player1.readPlayer();
		//Prompt for and read in information for player 2
		player2.readPlayer();
		
		// memory addresses
		System.out.println("\nplayer 1: " + player1.toString());
		System.out.println("player 2: " + player2.toString());
		
		//Compare player1 to player 2 and print a message saying
		//whether they are equal
		if(player1.equals(player2))
		{
			System.out.println("\nThe players are the same!");
		}
		else
		{
			System.out.println("\nThe players are different.");
		}
	}
}

