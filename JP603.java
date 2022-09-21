import java.util.Scanner;
import java.lang.Math;

abstract class Clerk {
	String name;
	double rate;
	double hours;
	double salary;

	Clerk(String n, double r, double h) {
		name = n;
		rate = r;
		hours = h;
	}

	abstract double salary();
}

class PartTime extends Clerk {
	// TO DO
	PartTime(String name, double rate, double hours) {
		super(name, rate, hours);
	}

	double salary() {
		salary = rate * hours;
		return salary;
	}

}

class FullTime extends Clerk {
	// TO DO
	FullTime(String name, double rate, double hours) {
		super(name, rate, hours);
	}

	double salary() {
		salary = (8 * rate) + (hours - 8) * (0.9 * rate);
		return salary;
	}
}

public class JP603 {
	public static void main(String argv[]) {
		String input = null;
		int hours, rate;
		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
			sc.close();
			String inputFP = input.substring(0, 1);
			String inputNAME = input.substring(2, input.indexOf(" ", 2));
			String inputHOURS = input.substring((3 + inputNAME.length()), (6 + inputNAME.length()));
			String inputRATE = input.substring((7 + inputNAME.length()));
			hours = Integer.valueOf(inputHOURS);
			rate = Integer.valueOf(inputRATE);
			if ((rate < 0) | (hours < 0)) {
				throw new Exception("error");
			}
			if (inputFP.equals("f")) {
				FullTime fulltime = new FullTime(inputNAME, rate, hours);
				StringBuilder sb = new StringBuilder();
				sb.append("FullTime ");
				sb.append(inputNAME);
				sb.append(" ");
				sb.append(Math.round(fulltime.salary()));
				System.out.println(sb.toString());
			} else if (inputFP.equals("p")) {
				PartTime parttime = new PartTime(inputNAME, rate, hours);
				StringBuilder sb = new StringBuilder();
				sb.append("PartTime ");
				sb.append(inputNAME);
				sb.append(" ");
				sb.append(Math.round(parttime.salary()));
				System.out.println(sb.toString());
			} else {
				throw new Exception("error");
			}
		} catch (

		Exception ex) {
			System.out.print("error");
			return;
		}

	}

}