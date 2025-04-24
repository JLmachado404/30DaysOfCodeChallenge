import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    int intInput = scan.nextInt();
    double doubleInput = scan.nextDouble();
    scan.nextLine();
    String stringInput = scan.nextLine();

    System.out.println(i + intInput);

    System.out.printf("%.1f\n", d + doubleInput);

    System.out.println(s + stringInput);

    scan.close();
  }
}
