import java.util.Scanner;
import java.lang.Math;

public class JP104 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        try {
            if (var.hasNextDouble()) {
                Double x1 = var.nextDouble();
                Double y1 = var.nextDouble();
                Double x2 = var.nextDouble();
                Double y2 = var.nextDouble();
                Double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
                System.out.printf("%.4f", d);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        var.close();
    }
}
