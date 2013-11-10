package hm.src;

import hm.src.levels.Level1;
import hm.src.levels.Level2;
import hm.src.levels.Level3;
import hm.src.levels.Level4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MathMaker {
	static double answer = 0;
	static double userinput = 0;
	static String preferedQuestions = "add";
	static int correctAnswers = 0;
	static int level;
	static int preferedLevel = 1;
	private int mathDamage = 1;
	
	public boolean make(){
		Math m = new Math();
		Level1 lv1 = new Level1();
		Level2 lv2 = new Level2();
		Level3 lv3 = new Level3();
		Level4 lv4 = new Level4();
		File checkExist = new File("HMData/level1/tables/table2.mt");
		if(!checkExist.exists()){
			System.out.println("making table files");
			m.writeDivisionTable(2);
			m.writeDivisionTable(3);
			m.writeDivisionTable(4);
			m.writeDivisionTable(5);
			m.writeDivisionTable(6);
			m.writeDivisionTable(7);
			m.writeDivisionTable(8);
			m.writeDivisionTable(9);
			m.writeDivisionTable(10);
			m.writeDivisionTable(11);
			m.writeDivisionTable(12);
			m.writeDivisionTable(13);
			m.writeDivisionTable(14);
			m.writeDivisionTable(15);
		}
		JFrame jf = new JFrame();
		System.out.println("What type of questions would you like?");
		Scanner input = new Scanner(System.in);
		System.out.println("What level would you like?");
		if(preferedLevel == 1){
			if(preferedQuestions.contains("add")){
				lv1.makeMath("adding");
				answer = lv1.answer;
				userinput = lv1.userinput;
			}
			else if(preferedQuestions.contains("subtract")){
				lv1.makeMath("subtracting");
				answer = lv1.answer;
				userinput = lv1.userinput;
			}
			else if(preferedQuestions.contains("multiply")){
				lv1.makeMath("multiplying");
				answer = lv1.answer;
				userinput = lv1.userinput;
			}
			else if(preferedQuestions.contains("divide")){
				lv1.makeMath("dividing");
				answer = lv1.answer;
				userinput = lv1.userinput;
			}
			else{
				System.out.println("Not reckognized! Quiting program");
				System.exit(0);
			}
			if(userinput == answer){
				correctAnswers++;
				return true;
			}
			else{
				return false;
			}
		}
		else if(preferedLevel == 2){
			if(preferedQuestions.contains("add")){
				lv2.makeMath("adding");
				answer = lv2.answer;
				userinput = lv2.userinput;
			}
			else if(preferedQuestions.contains("subtract")){
				lv2.makeMath("subtracting");
				answer = lv2.answer;
				userinput = lv2.userinput;
			}
			else if(preferedQuestions.contains("multiply")){
				lv2.makeMath("multiplying");
				answer = lv2.answer;
				userinput = lv2.userinput;
			}
			else if(preferedQuestions.contains("divide")){
				lv2.makeMath("dividing");
				answer = lv2.answer;
				userinput = lv2.userinput;
			}
			else{
				System.out.println("Not reckognized! Quiting program");
				System.exit(0);
			}
			if(userinput == answer){
				correctAnswers++;
				return true;
			}
			else{
				return false;
			}
		}
		else if(preferedLevel == 3){
			if(preferedQuestions.contains("add")){
				lv3.makeMath("adding");
				answer = lv3.answer;
				userinput = lv3.userinput;
			}
			else if(preferedQuestions.contains("subtract")){
				lv3.makeMath("subtracting");
				answer = lv3.answer;
				userinput = lv3.userinput;
			}
			else if(preferedQuestions.contains("multiply")){
				lv3.makeMath("multiplying");
				answer = lv3.answer;
				userinput = lv3.userinput;
			}
			else if(preferedQuestions.contains("divide")){
				lv3.makeMath("dividing");
				answer = lv3.answer;
				userinput = lv3.userinput;
			}
			else{
				System.out.println("Not reckognized! Quiting program");
				System.exit(0);
			}
			if(userinput == answer){
				correctAnswers++;
				return true;
			}
			else{
				return false;
			}
		}
		else if(preferedLevel == 4){
			if(preferedQuestions.contains("add")){
				lv4.makeMath("adding");
				answer = lv4.answer;
				userinput = lv4.userinput;
			}
			else if(preferedQuestions.contains("subtract")){
				lv4.makeMath("subtracting");
				answer = lv4.answer;
				userinput = lv4.userinput;
			}
			else if(preferedQuestions.contains("multiply")){
				lv4.makeMath("multiplying");
				answer = lv4.answer;
				userinput = lv4.userinput;
			}
			else if(preferedQuestions.contains("divide")){
				lv4.makeMath("dividing");
				answer = lv4.answer;
				userinput = lv4.userinput;
			}
			else{
				System.out.println("Not reckognized! Quiting program");
				System.exit(0);
			}
			if(userinput == answer){
				correctAnswers++;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			System.out.println("Not reckognized! Quiting program");
		}
		return false;
	}
	public int getCorrectAnswers(){
		return correctAnswers;
	}
	
	public int getMathDamage(){
		return mathDamage;
	}
	
	public void resetVariables(){
		correctAnswers = 0;
		answer = 0;
		userinput = 0;
	}
}
