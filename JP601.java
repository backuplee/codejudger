import java.util.Scanner;

class UnitCost {
	int cost = 0;

	UnitCost() {
	}

	UnitCost(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
}

class Engine extends UnitCost {
	int CC, YR, cost;

	Engine() {

	}

	Engine(int CC, int YR) {
		super();
		this.CC = CC;
		this.YR = YR;
	}

	public int getEngineCost() {
		if ((CC == 1800) & (YR <= 2)) {
			cost = 20000;
		} else if (((CC == 1800) & (YR < 5))) {
			cost = 16000;
		} else if (((CC == 1800) & (YR < 10))) {
			cost = 14000;
		} else if (((CC == 1800) & (YR >= 10))) {
			cost = 12000;
		}
		if ((CC == 2000) & (YR <= 2)) {
			cost = 25000;
		} else if (((CC == 2000) & (YR < 5))) {
			cost = 20000;
		} else if (((CC == 2000) & (YR < 10))) {
			cost = 17500;
		} else if (((CC == 2000) & (YR >= 10))) {
			cost = 15000;
		}

		return cost;
	}

}

public class JP601 {
	public static void main(String args[]) {
		int CC, YR;
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		String inputCC = inputStr.substring(0, 4);
		String inputYR = inputStr.substring(5);
		sc.close();
		CC = Integer.valueOf(inputCC);
		YR = Integer.valueOf(inputYR);
		Engine engine = new Engine(CC, YR);
		System.out.println(engine.getEngineCost());

	}
}

// String str = "aaa:bbb:CCc:ddd";
// String[] tokens = str.split(":");
// for (String token:tokens) {
// System.out.println(token);
// }

// 結果顯示：
// aaa
// bbb
// CCc
// ddd