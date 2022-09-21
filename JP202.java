import java.util.Scanner;

public class JP202 {

    public static void main(String[] args) {

        int n = 0;

        try {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sc.close();
        } catch (Exception e) {
            System.out.println("error");
            return;
        }

        if (n % 2 == 0) {
            System.out.print(n + " is an even number.");
        } else {
            System.out.print(n + " is an odd number.");
        }
    }

}