import java.util.Scanner;

public class JP109 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		int first = input.charAt(0);
		int last = input.charAt(input.length() - 1);
		if ((t(first) == '?') | (t(last) == '?')) {
			System.out.println("error");
		} else if (input.length() == 1) {
			System.out.println(t(first));
		} else {
			String inputstr = input.substring(1, input.length() - 1);
			StringBuilder sb = new StringBuilder();
			sb.append(t(first));
			sb.append(inputstr);
			sb.append(t(last));
			String str = sb.toString();
			System.out.println(str);
		}
	}

	public static char t(int ascii) {
		if ((ascii < 58) & (ascii > 47)) {
			if (ascii == 57) {
				ascii = 48;
			} else {
				ascii++;
			}
		} else if ((ascii < 91) & (ascii > 64)) {
			ascii = ascii - 64 + 97;
		} else if ((ascii < 123) & (ascii > 96)) {
			ascii = ascii - 96 + 65;
		} else {
			ascii = 63;
		}
		return (char) ascii;
	}

}
