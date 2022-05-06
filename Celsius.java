
import java.util.Scanner;

public class Celsius {
  public static void main(String[] args) {

  double c, f;
  Scanner in = new Scanner(System.in);

  System.out.println("Please provide the temprature in celsius");
  c = in.nextDouble();

  f = (1.8 * c) + 32;

  System.out.println("The Fahrenheit Conversion for the Celsius Temprature " + c + " is " + f);

  }
}
