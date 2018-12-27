package practice01;

public class Prob5 {

	public static void main(String[] args) {
		int start = 1;
		String clap = "짝";
		while (start < 1000) {
			int count = 0;
			String check = Integer.toString(start);
			for (int i = 0; i < check.length(); i++) {

				String check1 = check.substring(i, i + 1);
				int check2 = Integer.parseInt(check1);
				if (check2 % 3 == 0 && check2 != 0) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(start + "  ");
				for (int i = 0; i < count; i++) {
					System.out.print(clap);
				}
				System.out.println();
			}

			start++;
		}
	}
}
