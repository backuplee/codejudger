import java.util.Scanner;
import java.lang.Math;

public class JP108 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Double x;
		try {
			x = sc.nextDouble();
			sc.close();
			System.out.printf("%.4f", f(x));
		} catch (Exception e) {
			System.out.print("error");
		}
	}

	public static double f(double num) {
		return (Math.pow(num, 3) * 2 + num * 3 - 1);
	}
}