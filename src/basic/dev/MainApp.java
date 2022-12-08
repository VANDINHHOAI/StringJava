package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot chuoi: ");
		String s = sc.nextLine();
		String reversedStr = "";
		for (int i = 0; i < s.length(); i++) {
			reversedStr = s.charAt(i) + reversedStr;      
		} 
		System.out.println("Reversed string: " + reversedStr);
		String[] countWords = s.split(" ");
		System.out.println("Chuoi co " + countWords.length + " ky tu");
		sc.close();
	}

}
