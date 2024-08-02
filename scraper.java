import java.util.Scanner;

public class scraper {
  public static void main(String[] args) {
    Scanner urlObj = new Scanner(System.in);
    System.out.println("please enter the web page you would like to go to: ");
    String  urlinput = urlObj.nextLine();
    System.out.println(urlinput);
  }
}
