package hm.src.levels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Level3 extends Level{
	public int answer;
	public int userinput;
	@Override
	public void makeMath(String typeOfQuestion) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		if(typeOfQuestion.equalsIgnoreCase("adding")){
			int number1 = rand.nextInt(50);
			int number2 = rand.nextInt(50);
			answer = number1 + number2;
			System.out.println("What is " + number1 + " + " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("subtracting")){
			int number1 = rand.nextInt(50);
			int number2 = rand.nextInt(50);
			while(number2 > number1){
				number2 = rand.nextInt(50);
			}
			answer = number1 - number2;
			System.out.println("What is " + number1 + " - " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("multiplying")){
			int number1 = rand.nextInt(50);
			int number2 = rand.nextInt(50);
			answer = number1 * number2;
			System.out.println("What is " + number1 + " * " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("dividing")){
			int table = rand.nextInt(16);
			ArrayList<Integer> dividingNumbers = new ArrayList<Integer>();
			ArrayList<Integer> dividedByNumbers = new ArrayList<Integer>();
			while(table < 10){
				table = rand.nextInt(16);
			}
			try {
				System.out.println("Loading table" + table + ".mt");
				ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("HMData/level2/tables/table" + table + ".mt")));
				dividingNumbers = (ArrayList<Integer>)oi.readObject();
				dividedByNumbers = (ArrayList<Integer>)oi.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("makes number1");
			int number1 = dividingNumbers.get(rand.nextInt(dividingNumbers.size()));
			while(number1 > 49){
				number1 = dividingNumbers.get(rand.nextInt(dividingNumbers.size()));
			}
			System.out.println("makes number2");
			int number2 = dividedByNumbers.get(rand.nextInt(dividedByNumbers.size()));
			System.out.println("printing answer");
			answer = number1 / number2;
			System.out.println("What is " + number1 + " / " + number2);
			userinput = input.nextInt();
		}
	}
}
