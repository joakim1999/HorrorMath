package hm.src.levels;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.newdawn.slick.Input;


public class Level1 extends Level{
	public int answer;
	public int userinput;
	@SuppressWarnings({ "unchecked", "static-access" })
	public void makeMath(String typeOfQuestion){
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		JFrame jf = new JFrame();
		if(typeOfQuestion.equalsIgnoreCase("adding")){
			int number1 = rand.nextInt(10);
			int number2 = rand.nextInt(10);
			answer = number1 + number2;
			/*jp.addKeyListener(new KeyListener(){
				@Override
				public void keyPressed(KeyEvent e) {
					if(in.isKeyDown(in.KEY_0)){
						
					}
				}

				@Override
				public void keyReleased(KeyEvent arg0) {
				}

				@Override
				public void keyTyped(KeyEvent arg0) {
				}
			});*/
			userinput = Integer.parseInt(JOptionPane.showInputDialog(jf, "What is " + number1 + " + " + number2, JOptionPane.VALUE_PROPERTY));
		}
		else if(typeOfQuestion.equalsIgnoreCase("subtracting")){
			int number1 = rand.nextInt(10);
			int number2 = rand.nextInt(10);
			while(number2 > number1){
				number2 = rand.nextInt(10);
			}
			answer = number1 - number2;
			System.out.println("What is " + number1 + " - " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("multiplying")){
			int number1 = rand.nextInt(10);
			int number2 = rand.nextInt(10);
			answer = number1 * number2;
			System.out.println("What is " + number1 + " * " + number2);
			userinput = input.nextInt();
		}
		else if(typeOfQuestion.equalsIgnoreCase("dividing")){
			int table = rand.nextInt(10);
			ArrayList<Integer> dividingNumbers = new ArrayList<Integer>();
			ArrayList<Integer> dividedByNumbers = new ArrayList<Integer>();
			while(table < 2){
				table = rand.nextInt(10);
			}
			try {
				System.out.println("Loading table" + table + ".mt");
				ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("HMData/level1/tables/table" + table + ".mt")));
				dividingNumbers = (ArrayList<Integer>)oi.readObject();
				dividedByNumbers = (ArrayList<Integer>)oi.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("makes number1");
			int number1 = dividingNumbers.get(rand.nextInt(dividingNumbers.size()));
			while(number1 > 9){
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
