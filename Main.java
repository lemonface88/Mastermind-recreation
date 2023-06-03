import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO MASTERMIND, YOU'LL HAVE 10 TRIES TO GUESS MY CODE ");
		System.out.println("");
		ArrayList<String> randomAnswer= new ArrayList<String>();
		randomAnswer=ColorGen(); 
		
		for(int i = 0;i<11;i++) 
		{
			if(i==10) {
				System.out.println("You Lose! Better Luck Next Time ");
			}

			
			
			
		System.out.println("Enter 4 colors (Options are: red blue green yellow pink purple)");
		System.out.println("Enter "+" 'ok' "+" to check");
		
		String entry;
		Scanner scantw= new Scanner (System.in);
		ArrayList<String> Guess= new ArrayList<String>();
		
		
		printArray(randomAnswer); // this is used for checking if the code works in the start
		//get rid of this method after you want to start 
		
		//This loops the entered words into the array list
		
		while(true)
		{
			
			entry= scantw.nextLine();
			if(entry.equals("ok"))
				break;
			Guess.add(entry);
		}
		
		
		
		// scanners of the two arrays 
		
		CheckColor(randomAnswer,Guess);
		
		if (randomAnswer.equals(Guess)) {
			break;
		}
		else {
			System.out.println("KEEP TRYING DON'T GIVE UP ");
			System.out.println("");
		}
		}
		
		
	}
	
		
	public static ArrayList<String> ColorGen() {
		//generating the random answer 
		ArrayList<String> Answer= new ArrayList<String> ();
		
		//assigning the color to the integer 
		String A = "blue"; 
		String B = "green"; 
		String C ="red"; 
		String D="yellow"; 
		String E = "pink";
		String F = "purple";
		
		//generate random color 
		int C1 = (int) (Math.floor(Math.random() * 6) + 1);
		int C2 = (int) (Math.floor(Math.random() * 6) + 1);
		int C3 = (int) (Math.floor(Math.random() * 6) + 1);
		int C4 = (int) (Math.floor(Math.random() * 6) + 1);
		
		
		//first position
		if (C1==1) 
			Answer.add(A);
		else if(C1==2) 
			Answer.add(B);
		else if(C1==3) 
			Answer.add(C);
		else if (C1==4) 
			Answer.add(D);
		else if (C1==5) 
			Answer.add(E);
		else if (C1==6) 
			Answer.add(F);
		//second position
		if (C2==1) 
			Answer.add(A);
		else if(C2==2) 
			Answer.add(B);
		else if(C2==3) 
			Answer.add(C);
		else if (C2==4) 
			Answer.add(D);
		else if (C2==5) 
			Answer.add(E);
		else if (C2==6) 
			Answer.add(F);
		//third position 
		if (C3==1) 
			Answer.add(A);
		else if(C3==2) 
			Answer.add(B);
		else if(C3==3) 
			Answer.add(C);
		else if (C3==4) 
			Answer.add(D);
		else if (C3==5) 
			Answer.add(E);
		else if (C3==6) 
			Answer.add(F);
		//forth position 
		if (C4==1) 
			Answer.add(A);
		else if(C4==2) 
			Answer.add(B);
		else if(C4==3) 
			Answer.add(C);
		else if (C4==4) 
			Answer.add(D);
		else if (C4==5) 
			Answer.add(E);
		else if (C4==6)
			Answer.add(F);
		
		return(Answer);
		}
	
		//array print method
		public static void printArray(ArrayList<String> myArray)
		{
			for(int i=0; i<myArray.size();i++)
			{
				System.out.print(myArray.get(i) + " ");
				
			}
			System.out.println(" ");
		}
		
		//method 1 that checks the correct color 
		
		public static void CheckColor(ArrayList<String> A, ArrayList<String> B) {

			// the amount of this number in the guessed array 
			int green = 0;   
			int purple = 0 ;
			int yellow=0;
			int pink = 0;
			int red = 0 ;
			int blue =0 ;
			
			// the amount of this color in answer 
			int green1 = 0;   
			int purple1 = 0 ;
			int yellow1=0;
			int pink1 = 0;
			int red1 = 0 ;
			int blue1 =0 ;
			
			
			// the numbers of black pegs
			int count =0;
			for (int i = 0; i<4; i++) {
				//this compares the two array lists' same place with only 1 for loop
				//therefore would avoid repetition 
				if (A.get(i).equals(B.get(i))){
					count++;
				}
			}
			
			int blackP = count;
			
			// the number of times each color appears 
			
			// counts the amount of each colors in the answer 
			for (int i = 0; i<A.size(); i++)
			{
				if (A.get(i).equals("green"))
					green++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (A.get(i).equals("purple"))
					purple++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (A.get(i).equals("yellow"))
					yellow++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (A.get(i).equals("red"))
					red++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (A.get(i).equals("pink"))
					pink++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (A.get(i).equals("blue"))
					blue++;
			}
			
			// counts the number of colors in the guessed array
			
			for (int i = 0; i<A.size(); i++)
			{
				if (B.get(i).equals("green"))
					green1++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (B.get(i).equals("purple"))
					purple1++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (B.get(i).equals("yellow"))
					yellow1++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (B.get(i).equals("red"))
					red1++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (B.get(i).equals("pink"))
					pink1++;
			}
			for (int i = 0; i<A.size(); i++)
			{
				if (B.get(i).equals("blue"))
					blue1++;
			}
			
			int whitepeg = 0; 
			
			// when answer and guessed are both equal |  possible condition 1 
			if(green1==green)
				whitepeg += green1;
			
			if(purple1==purple)
				whitepeg += purple1;	
			
			if(yellow1==yellow)
				whitepeg += yellow1;
			
			if(red1==red)
				whitepeg += red1;
			
			if(pink1==pink)
				whitepeg += pink1;
			
			if(blue1==blue)
				whitepeg += blue1;
			
			
			//when guessed is greater than answer  | possible condition 2 
			
			if(green1>green&&green>0)
				whitepeg+= green;
			
			if(purple1>purple&&purple>0)
				whitepeg+= purple;
			
			if(yellow1>yellow&&yellow>0)
				whitepeg+= yellow;
			
			if(red1>red&&red>0)
				whitepeg+= red;
			
			if(pink1>pink&&pink>0)
				whitepeg+= pink;
			
			if(blue1>blue&&blue>0)
				whitepeg+= blue;
			
			//when guess is more than answer  |  possible condition 3 
			
			if(green1<green&&green1>0)
				whitepeg+= green1;
			
			if(purple1<purple&&purple1>0)
				whitepeg+= purple1;
			
			if(yellow1<yellow&&yellow1>0)
				whitepeg+= yellow1;
			
			if(red1<red&&red1>0)
				whitepeg+= red1;
			
			if(pink1<pink&&pink1>0)
				whitepeg+= pink1;
			
			if(blue1<blue&&blue1>0)
				whitepeg+= blue1;
			
			
			int YES = whitepeg-blackP;
				
			
			if (blackP==4) {
				System.out.println("You Win!");
				
			}
			
			//anything below a 4 would mean that they haven't finished yet 
			else if (blackP<4){ 
				System.out.println("White Pegs: "+ YES);
				System.out.println("Black Pegs: "+blackP);
				
			}
			
			return;
			
		}
		
		//Creator: May Chen and Harrison Huang 
		
}
	


