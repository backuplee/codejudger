import java.util.Scanner;

public class JP203 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            var inputVal = sc.nextLine();
            try {
                if ((Integer.TYPE != null) & (Integer.valueOf(inputVal) >= 0)) {
                    n[i] = Integer.valueOf(inputVal);
                } else if ((Integer.TYPE != null) & (Integer.valueOf(inputVal) < 0)) {
                    n[i] = 0;
                }
            } catch (Exception ex) {
            }
        }
        sc.close();
        n1 = n[0];
        n2 = n[1];
        n3 = n[2];
        g(f(n1));
        g(f(n2));
        g(f(n3));
    }

    public static int f(int num) {
        if ((num <= 100) & (num >= 85)) {
            return 1;
        } else if ((num < 85) & (num >= 60)) {
            return 2;
        } else if ((num < 60) & (num >= 0)) {
            return 3;
        } else {
            return 4;
        }

    }

    public static String g(int n) {
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("");
        }
        return null;
    }
}
