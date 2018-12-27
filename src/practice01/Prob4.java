package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		System.out.print("문자열을 입력하시오 : ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		for(int i = 0; i <input.length(); i ++) {
			System.out.println(input.substring(0, i+1));
		}
	}

}
