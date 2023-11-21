import java.util.Scanner;

public class LineCompProb {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1;
        int x2;
        int y1;
        int y2;
        // one line has 2 points. 2 points = 4 coordinates

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1:");
        x1 = sc.nextInt();
        System.out.println("Enter y1:");
        y1 = sc.nextInt();
        System.out.println("Enter x2:");
        x2 = sc.nextInt();
        System.out.println("Enter y2:");
        y2 = sc.nextInt();

        double squaredLength = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double lineLength = Math.sqrt(squaredLength);
        System.out.println("The length of a line is : " + lineLength);
    }
}
