import java.text.DecimalFormat;
import java.util.Scanner;

public class JP110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = 0, n5 = 0, n10 = 0;
		int[] n = new int[3];
		for (int i = 0; i < 3; i++) {
			var inputVal = sc.next();
			try {
				if (Integer.valueOf(inputVal) < 0) {
					n[i] = 0;
				} else if ((Integer.TYPE != null) & (Integer.valueOf(inputVal) > 0)) {
					n[i] = Integer.parseInt(inputVal);
				}
			} catch (Exception ex) {
			}
		}
		sc.close();
		n1 = n[0];
		n5 = n[1];
		n10 = n[2];
		int sum = n1 * 1 + n5 * 5 + n10 * 10;
		DecimalFormat formatter = new DecimalFormat("#,###");
		System.out.println(formatter.format(sum));
	}
}
