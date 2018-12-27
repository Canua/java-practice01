package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		while (true) {
			System.out.print("숫자를 입력하시오 : ");
			Scanner s = new Scanner(System.in);
			int input_num = s.nextInt();
			int sum = 0;
			if (input_num % 2 == 0) {
				for (int i = 1; i <= input_num; i++) {
					if (i % 2 == 0)
						sum += i;

				}
				System.out.println(sum);

			} else {
				for (int i = 1; i <= input_num; i++) {
					if (i % 2 != 0)
						sum += i;
				}
				System.out.println(sum);
			}
			System.out.println();
		}
	}
}
