import java.util.Scanner;

public class Main {

  Scanner scanner = new Scanner(System.in);

  String[] dinoNames = new String[10];
  int[] dinoAges = new int[10];
  int[] dinoWeights = new int[10];
  int dinoCount = 0;

  public static void main(String args[]) {

  }

  public void menu() {
    System.out.println("Welcome to Mesozoic Eden Assistant!");
    System.out.println("1. Add Dinosaur");
    System.out.println("2. Check Park Hours");
    System.out.println("3. Greet Guest");
    System.out.println("4. Check Visitors Count");
    System.out.println("5. Manage Staff");
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
  }

  public void start() {
    while (true) {
      menu();
      int option = scanner.nextInt();
      resolveOption(option);
    }
  }

  public void resolveOption(int option) {
    switch (option) {
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        break;

      default:
        System.out.println("Invalid choice!");
        break;
    }
  }
}
