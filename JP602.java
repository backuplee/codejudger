import java.util.Scanner;

enum colors {
	RED, BLUE, WHITE;
}

class Car {
	int cc, seat, color, door;
	String carAttr;

	// TO DO
	Car() {
	}

	Car(int cc, int seat, int color, int door) {
		this.cc = cc;
		this.seat = seat;
		this.color = color;
		this.door = door;
	}

	colors arr[] = colors.values();

	public String getCarAttr() {
		StringBuilder sb = new StringBuilder();
		sb.append(cc);
		sb.append("cc");
		sb.append(seat);
		sb.append(arr[color]);
		sb.append(door);
		carAttr = sb.toString();
		return carAttr;
	}

}

public class JP602 {
	public static void main(String args[]) {
		String input = null;
		int cc, seat, door, color;

		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
			sc.close();
			// TO DO
			String inputCC = input.substring(0, 4);
			String inputSEAT = input.substring(5, 6);
			String inputCOLOR = input.substring(7, 8);
			String inputDOOR = input.substring(9);

			cc = Integer.valueOf(inputCC);
			seat = Integer.valueOf(inputSEAT);
			color = Integer.valueOf(inputCOLOR) - 1;
			door = Integer.valueOf(inputDOOR);
			Car car = new Car(cc, seat, color, door);
			System.out.println(car.getCarAttr());

		} catch (Exception ex) {
			System.out.print("error");
			return;
		}
	}
}