package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	
	//1. Create a main method to test the other methods you write.
	
	public static void main(String[] args) {
		String[] strings = {"aloe vera, boba, grass jelly, red bean"};
		Strings1(strings);
		Strings2(strings);
		Strings3(strings);
		Strings4(strings);
		
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void Strings1 (String[] strings1) {
		for(int i = 0; i<strings1.length; i++) {
			System.out.print(strings1[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	 static void Strings2 (String[] strings2) {
		for(int i = strings2.length-1; i>=0; i--) {
			System.out.print(strings2[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	 static void Strings3 (String[] strings3) {
		for(int i = 0; i<strings3.length; i++) {
			if(i%2==0) {
			System.out.print(strings3[i]);
			}
			
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	  static void Strings4 (String[] strings4) {
		for(int i = 0; i<strings4.length; i++) {
			Random random = new Random();
			int r = random.nextInt(strings4.length);
			System.out.print(strings4[r]);
		}
	}
	
}
