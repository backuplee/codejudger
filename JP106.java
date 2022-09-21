import java.util.Scanner;
import java.lang.Math;

public class JP106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4;
		int[] n = new int[4];
		for (int i = 0; i < 4; i++) {
			var inputVal = sc.next();
			try {
				if ((Integer.TYPE != null) & (Integer.valueOf(inputVal) > 0)) {
					n[i] = Integer.parseInt(inputVal);
				} else {
					n[i] = 0;
				}
			} catch (Exception ex) {
			}
		}
		sc.close();
		n1 = n[0];
		n2 = n[1];
		n3 = n[2];
		n4 = n[3];

		int smallest = Math.min(Math.min(Math.min(n1, n2), n3), n4);
		int biggest = Math.max(Math.max(Math.max(n1, n2), n3), n4);
		System.out.println("smallest:" + smallest);
		System.out.print("largest:" + biggest);

	}
}
