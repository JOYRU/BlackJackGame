package joy.com.ru;
import java.io.*;
import java.util.Scanner;

public class Game {
	
private static int playercard1, playercard2, dealercard1, dealercard2, playercardtotal, dealercardtotal;
	
	public static void playerhit()
	{
		int playercard = (int) (Math.random() * 9 + 2);
		System.out.println("You drew a " + playercard + ".");
		playercardtotal +=playercard;
		System.out.println("Your score is " + playercardtotal);
	}
	
	
	public static void initialPlayerCards()
	{
		System.out.println("Welcome To Simple  Blackjack Game!");
		playercard1 = (int) (Math.random() * 9 + 2);
		playercard2 = (int) (Math.random() * 9 + 2);
		System.out.println("You drew a " + playercard1 + " and a " + playercard2 + ".");
		playercardtotal = playercard1 + playercard2;
		System.out.println("Your total is " + playercardtotal + ".");
		System.out.println();
	}
	

}
