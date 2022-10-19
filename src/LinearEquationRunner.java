import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {

        // initialization
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, user!");

        // user input
        System.out.print("Enter coordinate 1: ");
        String cord1 = scan.nextLine();
        int totalInd = cord1.length();
        int commaInd = cord1.indexOf(",");
        String tempString = cord1.substring(1, commaInd);
        String tempString2 = cord1.substring(commaInd + 2, totalInd - 1);
        int parse1X = Integer.parseInt(tempString);
        int parse1Y = Integer.parseInt(tempString2);
        System.out.print("Enter coordinate 2: ");
        String cord2 = scan.nextLine();
        totalInd = cord2.length();
        commaInd = cord2.indexOf(",");
        tempString = cord2.substring(1, commaInd);
        tempString2 = cord2.substring(commaInd + 2, totalInd - 1);
        int parse2X = Integer.parseInt(tempString);
        int parse2Y = Integer.parseInt(tempString2);
        if (parse1X == parse2X) {
            System.out.println("\nThese points are on a vertical line: x = " + parse1X);
        } else {
            // object creation
            LinearEquation linear1 = new LinearEquation(parse1X, parse1Y, parse2X, parse2Y);

            // return
            System.out.println(linear1.lineInfo());
            System.out.print("\nEnter a value for x: ");
            double x = scan.nextDouble();
            System.out.println("\nThe point on the line is: " + linear1.coordinateForX(x));
        }
    }
}