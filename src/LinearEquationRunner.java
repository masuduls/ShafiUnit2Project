import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {

        // initialization
        Scanner scan = new Scanner(System.in);

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
        commaInd = cord2.indexOf(",");
        tempString = cord2.substring(1, commaInd);
        tempString2 = cord2.substring(commaInd + 2, totalInd - 1);
        int parse2X = Integer.parseInt(tempString);
        int parse2Y = Integer.parseInt(tempString2);
        LinearEquation linear1 = new LinearEquation(parse1X, parse1Y, parse2X, parse2Y);

        // return
        System.out.println("The two points are: " + cord1 + " and " + cord2);
        System.out.println("The equation of the line between these points is: " + linear1.equation());
        System.out.println("The slope of this line is: " + linear1.slope());
        System.out.println("The y-intercept of the line is: " + linear1.yIntercept());
        System.out.println("The distance between the two points is: " + linear1.distance());

        System.out.println("\nEnter a value for x: ");
        String x = scan.nextLine();
        int parsedX = Integer.parseInt(x);
        System.out.println("\nThe point on the line is: ");
    }
}