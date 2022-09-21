import java.util.Scanner;
import java.lang.Math;

public class JP201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        double[] n = new double[2];
        for (int i = 0; i < n.length; i++) {
            var inputVal = sc.next();
            try {
                n[i] = Double.valueOf(inputVal);
            } catch (Exception ex) {
            }
        }
        sc.close();
        n1 = n[0];
        n2 = n[1];
        if (n1 > n2) {
            if (n1 - Math.ceil(n1) == 0) {
                int x1 = (int) Math.round(n1);
                System.out.print(x1 + ">");
            } else {
                double x1 = n1;
                System.out.print(x1 + ">");
            }
            if (n2 - Math.ceil(n2) == 0) {
                int x2 = (int) Math.round(n2);
                System.out.print(x2);
            } else {
                double x2 = n2;
                System.out.print(x2);
            }

        } else if (n1 == n2) {
            if (n1 - Math.ceil(n1) == 0) {
                int x1 = (int) Math.round(n1);
                System.out.print(x1 + "=");
            } else {
                double x1 = n1;
                System.out.print(x1 + ">=");
            }
            if (n2 - Math.ceil(n2) == 0) {
                int x2 = (int) Math.round(n2);
                System.out.print(x2);
            } else {
                double x2 = n2;
                System.out.print(x2);
            }
        } else {
            if (n1 - Math.ceil(n1) == 0) {
                int x1 = (int) Math.round(n1);
                System.out.print(x1 + "<");
            } else {
                double x1 = n1;
                System.out.print(x1 + "<");
            }
            if (n2 - Math.ceil(n2) == 0) {
                int x2 = (int) Math.round(n2);
                System.out.print(x2);
            } else {
                double x2 = n2;
                System.out.print(x2);
            }
        }
    }
}