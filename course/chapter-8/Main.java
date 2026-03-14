import java.util.Scanner;

class Dinosaur {
  String name;
  int age;
  String species;

  public Dinosaur(String name, int age, String species) {
    this.age = age;
    this.name = name;
    this.species = species;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getSpecies() {
    return species;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpecies(String species) {
    this.species = species;
  }
}

class Employee {
  String name;
  String jobTitle;
  int yearsOfExperience;

  public Employee(String name, String jobTitle, int yearsOfExperience) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public String getName() {
    return name;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }
}

class Park {
  String name;
  boolean isOpen;
  Employee[] employees = new Employee[100];
  Dinosaur[] dinosaurs = new Dinosaur[50];

  public Park(String name, boolean isOpen) {
    this.name = name;
    this.isOpen = isOpen;
  }

  public String getName() {
    return name;
  }

  public boolean getIsOpen() {
    return isOpen;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }

  public void addDinosaur() {
  }

  public void removeDinosaur() {
  }

}

class Guest {
}

public class Main {
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Main main = new Main();
    main.start();
  }

  public void start() {
    while (true) {
      displayMenu();
      int choice = scanner.nextInt();
      handleMenuChoice(choice);
    }
  }

  public void displayMenu() {
    System.out.println("Welcome to Mesozoic Eden Park Manager!");
    System.out.println("1. Manage Dinosaurs");
    System.out.println("2. Manage Park Employees");
    System.out.println("3. Manage Tickets");
    System.out.println("4. Check Park Status");
    System.out.println("5. Handle Special Events");
    System.out.println("6. Exit");
    System.out.print("Enter your choice: ");
  }

  public void handleMenuChoice(int choice) {
    switch (choice) {
      case 1:
        // manageDinosaurs();
        break;
      case 2:
        // manageEmployees();
        break;
      case 3:
        // manageTickets();
        break;
      case 4:
        // checkParkStatus();
        break;
      case 5:
        // handleSpecialEvents();
        break;
      case 6:
        System.out.println("Exiting...");
        System.exit(0);
    }
  }
}