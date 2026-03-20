
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your job title : ");
    String role = sc.next(); // feeding, cleaning, security, and tour guiding

    int time = 14;
    int securityRating = 5; // out of 10

    switch (role) {
      case "feeding" -> {
        if (time >= 7 && time <= 19) {
          System.out.println("Your task is to feed the dinosaurs.");
        } else {
          System.out.println("Feeding time is over. Please assist with cleaning tasks.");
        }
      }
      case "cleaning" -> {
        System.out.println("Your task is to clean the enclosures.");
      }
      case "security" -> {
        if (securityRating >= 7) {
          System.out.println("Your task is to insure the park's safety.");
        } else {
          System.out.println("You're doing a horrible job, please enhance the security");
        }
      }
      case "tour guiding" -> {
        if (time >= 10 && time <= 19) {
          System.out.println("Your task is to guide the park's visitors.");
        } else {
          System.out.println("Tour guiding hours are over. Please assist with other tasks.");
        }
      }
      default -> {
        System.out.println("Unknown job title.");
      }
    }

    sc.close();

  }
}
