import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 1;


        for (int i = 1; i >= 1; i++) {

            try {
                // System.out.println("Enter number. To quit enter any character");
                String nextLine = scanner.nextLine();
                int enteredValue = Integer.parseInt(nextLine);
                sum += enteredValue;
                count = i;

            } catch (NumberFormatException nfe) {
                average = (double) sum / count;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;

            }

        }




    }
}
