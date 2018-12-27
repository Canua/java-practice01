package practice01;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오 : ");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int min_num = 1;
		int max_num = 11;
		while (true) {
			if (count > 0) {
				for (int i = min_num; i < max_num; i++) {
					System.out.print(i);
				}
			} else {
				break;
			}
			count--;
			min_num++;
			max_num++;
			System.out.println();
		}
	}

}
