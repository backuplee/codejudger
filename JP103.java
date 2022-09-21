import java.util.Scanner;
import java.lang.Math;

public class JP103 {
	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		try {
			if (radius.hasNextDouble()) {
				Double r = radius.nextDouble();
				Double area = Math.PI * r * r;
				System.out.printf("%.4f", area);
			} else {
				Double area = 0.0;
				System.out.printf("%.4f", area);
			}
		} catch (Exception ex) {
			System.out.println(0.0000);
		}
		radius.close();
	}
}
