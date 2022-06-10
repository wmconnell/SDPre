import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
            double num1, num2;
            boolean keepGoing = true;
            int choice;
            double answer = 0.0;

    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();
    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    while(keepGoing) {
      printMenu();
      System.out.print("Which would you like to do? ");
      choice = kb.nextInt();

      double answerSum = findSum(num1, num2);
      double answerAve = findAverage(num1, num2);
      double answerTax = calcTax(num1, num2);

      switch(choice) {
        case 1:
        System.out.println(num1 + " + " + num2 + " = " + answerSum);
        break;
        case 2:
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + answerAve);
        break;
        case 3:
        System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + answerTax);
        break;
        case 4:
        System.out.println("You've chosen to quit.");
        keepGoing = false;
        break;
        default:
        System.out.println("Please enter 1, 2, 3, or 4");
        break;
}
      }
      kb.close();

    }
    public static void printMenu() {
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("|                      |");
        System.out.println("|   1. Add Numbers     |");
        System.out.println("|   2. Find Average    |");
        System.out.println("|   3. Calculate Tax   |");
        System.out.println("|   4. Exit            |");
        System.out.println("========================");
        System.out.println();
    }
    public static double findSum(double x, double y) {
      double sum = x + y;
      return sum;
    }
    public static double findAverage(double x, double y) {
      double ave =(x + y) / 2;
      return ave;
    }
    public static double calcTax(double x, double y) {
      double tax = (x + y) * 0.0831;
      return tax;
    }
  }
