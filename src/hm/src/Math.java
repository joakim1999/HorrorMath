package hm.src;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//this is the class who calculates which numbers that can be divided by eachothers
public class Math {
	ObjectOutputStream os;
	ArrayList<Integer> dividingNumbers;
	ArrayList<Integer> dividedByNumbers;
	//this writes the data to files stored in: HMData/tables/thelevel/
	public void writeDivisionTable(int tableSystem){
		dividingNumbers = new ArrayList<Integer>();
		dividedByNumbers = new ArrayList<Integer>();
		//every number in the multiplication table up to  minimum 50
		if(tableSystem==2){
			dividingNumbers.add(2);
			dividingNumbers.add(4);
			dividingNumbers.add(6);
			dividingNumbers.add(8);
			dividingNumbers.add(10);
			dividingNumbers.add(12);
			dividingNumbers.add(14);
			dividingNumbers.add(16);
			dividingNumbers.add(18);
			dividingNumbers.add(20);
			dividingNumbers.add(22);
			dividingNumbers.add(24);
			dividingNumbers.add(26);
			dividingNumbers.add(28);
			dividingNumbers.add(30);
			dividingNumbers.add(32);
			dividingNumbers.add(34);
			dividingNumbers.add(36);
			dividingNumbers.add(38);
			dividingNumbers.add(40);
			dividingNumbers.add(42);
			dividingNumbers.add(44);
			dividingNumbers.add(46);
			dividingNumbers.add(48);
			dividingNumbers.add(50);
			dividedByNumbers.add(2);
		}
		else if(tableSystem==3){
			dividingNumbers.add(3);
			dividingNumbers.add(6);
			dividingNumbers.add(9);
			dividingNumbers.add(12);
			dividingNumbers.add(15);
			dividingNumbers.add(18);
			dividingNumbers.add(21);
			dividingNumbers.add(24);
			dividingNumbers.add(27);
			dividingNumbers.add(30);
			dividingNumbers.add(33);
			dividingNumbers.add(36);
			dividingNumbers.add(39);
			dividingNumbers.add(42);
			dividingNumbers.add(45);
			dividingNumbers.add(48);
			dividingNumbers.add(51);
			dividedByNumbers.add(3);
		}
		else if(tableSystem==4){
			dividingNumbers.add(4);
			dividingNumbers.add(8);
			dividingNumbers.add(12);
			dividingNumbers.add(16);
			dividingNumbers.add(20);
			dividingNumbers.add(24);
			dividingNumbers.add(28);
			dividingNumbers.add(32);
			dividingNumbers.add(36);
			dividingNumbers.add(40);
			dividingNumbers.add(44);
			dividingNumbers.add(48);
			dividingNumbers.add(52);
			dividedByNumbers.add(2);
			dividedByNumbers.add(4);
		}
		else if(tableSystem==5){
			dividingNumbers.add(5);
			dividingNumbers.add(10);
			dividingNumbers.add(15);
			dividingNumbers.add(20);
			dividingNumbers.add(25);
			dividingNumbers.add(30);
			dividingNumbers.add(35);
			dividingNumbers.add(40);
			dividingNumbers.add(45);
			dividingNumbers.add(50);
			dividedByNumbers.add(5);
		}
		else if(tableSystem==6){
			dividingNumbers.add(6);
			dividingNumbers.add(12);
			dividingNumbers.add(18);
			dividingNumbers.add(24);
			dividingNumbers.add(30);
			dividingNumbers.add(36);
			dividingNumbers.add(42);
			dividingNumbers.add(48);
			dividingNumbers.add(54);
			dividedByNumbers.add(2);
			dividedByNumbers.add(3);
			dividedByNumbers.add(6);
		}
		else if(tableSystem==7){
			dividingNumbers.add(7);
			dividingNumbers.add(14);
			dividingNumbers.add(21);
			dividingNumbers.add(28);
			dividingNumbers.add(35);
			dividingNumbers.add(42);
			dividingNumbers.add(49);
			dividingNumbers.add(56);
			dividedByNumbers.add(7);
		}
		else if(tableSystem==8){
			dividingNumbers.add(8);
			dividingNumbers.add(16);
			dividingNumbers.add(24);
			dividingNumbers.add(32);
			dividingNumbers.add(48);
			dividingNumbers.add(56);
			dividedByNumbers.add(2);
			dividedByNumbers.add(4);
			dividedByNumbers.add(8);
		}
		else if(tableSystem==9){
			dividingNumbers.add(9);
			dividingNumbers.add(18);
			dividingNumbers.add(27);
			dividingNumbers.add(36);
			dividingNumbers.add(45);
			dividingNumbers.add(54);
			dividedByNumbers.add(3);
			dividedByNumbers.add(9);
		}
		else if(tableSystem==10){
			dividingNumbers.add(10);
			dividingNumbers.add(20);
			dividingNumbers.add(30);
			dividingNumbers.add(40);
			dividingNumbers.add(50);
			dividedByNumbers.add(2);
			dividedByNumbers.add(5);
		}
		else if(tableSystem==11){
			dividingNumbers.add(11);
			dividingNumbers.add(22);
			dividingNumbers.add(33);
			dividingNumbers.add(44);
			dividingNumbers.add(55);
			dividedByNumbers.add(11);
		}
		else if(tableSystem==12){
			dividingNumbers.add(12);
			dividingNumbers.add(24);
			dividingNumbers.add(36);
			dividingNumbers.add(48);
			dividingNumbers.add(60);
			dividedByNumbers.add(4);
			dividedByNumbers.add(3);
			dividedByNumbers.add(2);
			dividedByNumbers.add(6);
		}
		else if(tableSystem==13){
			dividingNumbers.add(13);
			dividingNumbers.add(26);
			dividingNumbers.add(39);
			dividingNumbers.add(52);
			dividedByNumbers.add(13);
		}
		else if(tableSystem==14){
			dividingNumbers.add(14);
			dividingNumbers.add(28);
			dividingNumbers.add(42);
			dividingNumbers.add(56);
			dividedByNumbers.add(2);
			dividedByNumbers.add(7);
		}
		else if(tableSystem==15){
			dividingNumbers.add(15);
			dividingNumbers.add(30);
			dividingNumbers.add(45);
			dividingNumbers.add(60);
			dividedByNumbers.add(5);
			dividedByNumbers.add(3);
		}
		else if(tableSystem==16){
			dividingNumbers.add(16);
			dividingNumbers.add(32);
			dividingNumbers.add(48);
			dividedByNumbers.add(5);
			dividedByNumbers.add(3);
		}
		//finally writes the files into a fitting level
		if(tableSystem <= 9){
			try {
				File hmdir = new File("HMData/level1/tables");
				if(!hmdir.exists()){
					hmdir.mkdirs();
				}
				else{}
				os = new ObjectOutputStream(new FileOutputStream("HMData/level1/tables/table" + tableSystem + ".mt"));
				os.writeObject(dividingNumbers);
				os.writeObject(dividedByNumbers);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if (tableSystem <= 19){
			try {
				File hmdir = new File("HMData/level2/tables");
				if(!hmdir.exists()){
					hmdir.mkdirs();
				}
				else{}
				os = new ObjectOutputStream(new FileOutputStream("HMData/level2/tables/table" + tableSystem + ".mt"));
				os.writeObject(dividingNumbers);
				os.writeObject(dividedByNumbers);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
