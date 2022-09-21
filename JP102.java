import java.util.Scanner;

public class JP102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double Even_Int1 = sc.nextDouble();
		Double Even_Int2 = sc.nextDouble();
		try {
			if (Even_Int1 % 2 == 0 & Even_Int1 % 2 == 0) {
				Double sum = Even_Int1 + Even_Int2;
				System.out.println(sum.intValue());
			} else if (Even_Int1 % 2 == 0) {
				System.out.println(Even_Int1.intValue());
			} else if (Even_Int2 % 2 == 0) {
				System.out.println(Even_Int2.intValue());
			} else {
				System.out.println(0);
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
		sc.close();
	}
}
