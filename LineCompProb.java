public class LineCompProb {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // First set of points
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

        double squaredLength1 = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double lineLength1 = Math.sqrt(squaredLength1);
        System.out.println("The length of the first line is: " + lineLength1);

        // Second set of points
        int x3;
        int x4;
        int y3;
        int y4;

        System.out.println("Enter x3:");
        x3 = sc.nextInt();
        System.out.println("Enter y3:");
        y3 = sc.nextInt();
        System.out.println("Enter x4:");
        x4 = sc.nextInt();
        System.out.println("Enter y4:");
        y4 = sc.nextInt();

        double squaredLength2 = Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2);
        double lineLength2 = Math.sqrt(squaredLength2);
        System.out.println("The length of the second line is: " + lineLength2);

        String line1 = String.valueOf(lineLength1);// to convert an integer to string same like to_string
        String line2 = String.valueOf(lineLength2);

        if (line1.equals(line2)) {// given in pdf thats why
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }
}

