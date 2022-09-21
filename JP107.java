import java.util.Scanner;
import java.lang.Math;

public class JP107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		int[] n = new int[3];
		for (int i = 0; i < 3; i++) {
			var inputVal = sc.next();
			try {
				if (Integer.valueOf(inputVal) > 100) {
					n[i] = 100;
				} else if ((Integer.TYPE != null) & (Integer.valueOf(inputVal) > 0)) {
					n[i] = Integer.parseInt(inputVal);
				}
			} catch (Exception ex) {
			}
		}
		sc.close();
		n1 = n[0];
		n2 = n[1];
		n3 = n[2];

		double average = Math.floor((n1 + n2 + n3) / 3);
		int avg = (int) average;
		if (avg == 100) {
			System.out.print("full mark:" + avg);
		} else if ((avg >= 60) & (avg < 100)) {
			System.out.print("pass:" + avg);
		} else {
			System.out.print("failed:" + avg);
		}
	}
}
