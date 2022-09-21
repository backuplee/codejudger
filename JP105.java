import java.util.Scanner;

public class JP105 {

	public static void main(String[] args) {
		String dreams = "There are moments in life when you miss someone so much that "
				+ "you just want to pick them from your dreams and hug them for real! Dream what "
				+ "you want to dream;go where you want to go;be what you want to be,because you have "
				+ "only one life and one chance to do all the things you want to do";

		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		sc.close();
		int first_0 = dreams.indexOf(search, 0);
		int first = first_0 + 1;
		int last_1 = dreams.lastIndexOf(search);
		int last = last_1 + 1;
		String result = dreams.substring(first, last);
		// System.out.println(dreams.length());
		System.out.println("first:" + first);
		System.out.println("last:" + last);
		System.out.print("capture:" + result);
	}

}
