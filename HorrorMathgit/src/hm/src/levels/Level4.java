package hm.src.levels;
import java.util.Random;
import java.util.Scanner;


public class Level4 extends Level{
	public double answer;
	public double userinput;
	@Override
	public void makeMath(String typeOfQuestion) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		if(typeOfQuestion.equalsIgnoreCase("adding")){
			int number1 = rand.nextInt(100);
			int number2 = rand.nextInt(100);
			answer = number1 + number2;
			System.out.println("What is " + number1 + " + " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("subtracting")){
			int number1 = rand.nextInt(20);
			int number2 = rand.nextInt(20);
			answer = number1 - number2;
			System.out.println("What is " + number1 + " - " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("multiplying")){
			int number1 = rand.nextInt(20);
			int number2 = rand.nextInt(20);
			answer = number1 * number2;
			System.out.println("What is " + number1 + " * " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("dividing")){
			int table = rand.nextInt(10);
			while(table < 2){
				table = rand.nextInt(10);
			}
			System.out.println("makes number1");
			int number1 = rand.nextInt(10);
			System.out.println("makes number2");
			int number2 = rand.nextInt(10);
			System.out.println("printing answer");
			answer = number1 / number2;
			System.out.println("What is " + number1 + " / " + number2);
			userinput = input.nextDouble();
		}
	}
}
