import java.util.Scanner;

/**
 * To calculate slope using four points
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // to ask the user for the first x coordinate
    System.out.println("Please enter in the x coordinate of the first point");

    // allows the user to input the x coordinate of the first line
    int firstX = input.nextInt();

    // asks the user for the first y coordinate
    System.out.println("Please enter in the y coordinate of the first point");

    // allows the user to input the y coordinate of the first line
    int firstY = input.nextInt();

    // asks the user for the second x coordinate
    System.out.println("Please enter in the x coordinate of the second point");

    // allows the user to input the x coordinate of the second line
    int secondX = input.nextInt();

    // asks the user for the second y coordinate
    System.out.println("Please enter in the y coordinate of the second point");

    // allows the user to input the y coordinate of the second line
    int secondY = input.nextInt();

    // calculates the slope of the four points
    int slope = (secondY - firstY) / (secondX - firstX);

    // tells the user the slope of the four points
    System.out.println("The slope of your line would be " + slope);

  }
}
