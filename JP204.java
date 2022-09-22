import java.util.Scanner;

public class JP204 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n1, n2, count;
        int[] n = new int[2];
        try {
            for (int i = 0; i < n.length; i++) {
                var inputVal = sc.nextLine();
                n[i] = Integer.valueOf(inputVal);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("error");
            return;
        }
        n1 = n[0];
        n2 = n[1];
        if ((n1 > 100) | (n1 < 1) | (n2 > 100) | (n2 < 1)) {
            System.out.println("error");
        } else {
            for (int i = n1; i <= n2; i++) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if ((count < 3) & (i != 1)) {
                    System.out.println(i);
                }
            }
        }
    }
}