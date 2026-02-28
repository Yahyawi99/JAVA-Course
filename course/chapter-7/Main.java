import java.util.Scanner;
import java.time.LocalTime;

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
        addDinosaur();
        break;
      case 2:
        checkParkHours();
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

  // Menu actions
  public void addDinosaur() {
    if (dinoCount >= 10) {
      System.out.println("The park is full");
      return;
    }

    scanner.nextLine();
    System.out.println("Enter dinosaur name: ");
    dinoNames[dinoCount] = scanner.nextLine();
    System.out.println("Enter dinosaur age: ");
    dinoAges[dinoCount] = scanner.nextInt();
    System.out.println("Enter dinosaur weight: ");
    dinoWeights[dinoCount] = scanner.nextInt();
    dinoCount++;

    System.out.println(dinoNames[dinoCount - 1] + " has been added to the park!");
  }

  public void checkParkHours() {
    int currentHour = LocalTime.now().getHour();

    if (currentHour >= 8 && currentHour <= 6) {
      System.out.println("The park is open!");
    } else {
      System.out.println("The park is closed!");
    }
  }
}
