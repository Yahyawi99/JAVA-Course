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
  int dinoCount = 0;
  int empCount = 0;

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

  public void addDinosaur(Dinosaur d) {
    if (dinoCount < dinosaurs.length) {
      dinosaurs[dinoCount++] = d;
      System.out.println("Dinosaur added successfully.");
      ;
    } else {
      System.out.println("Park is full of dinosaurs!");
    }
  }

  public void removeDinosaur(String dinoName) {
    for (int i = 0; i < dinosaurs.length; i++) {
      if (dinosaurs[i].getName().equalsIgnoreCase(dinoName)) {
        dinosaurs[i] = dinosaurs[dinoCount - 1];
        dinosaurs[dinoCount - 1] = null;
        dinoCount--;
        System.out.println("Dinosaur removed.");
        return;
      }
    }
    System.out.println("Dinosaur not found.");

  }

  public void addEmployee(Employee e) {
    if (empCount < employees.length) {
      employees[empCount++] = e;
    }
  }

  public void removeEmployee(String name) {
    for (int i = 0; i < empCount; i++) {
      if (employees[i].getName().equalsIgnoreCase(name)) {
        employees[i] = employees[empCount - 1];
        employees[empCount--] = null;
        return;
      }
    }
  }

  public void displayDinosaurs() {
    for (int i = 0; i < dinoCount; i++) {
      System.out.println(
          dinosaurs[i].getName() + " - " +
              dinosaurs[i].getSpecies() + " - Age: " +
              dinosaurs[i].getAge());
    }
  }

  public void displayEmployees() {
    for (int i = 0; i < empCount; i++) {
      System.out.println(
          employees[i].getName() + " - " +
              employees[i].getJobTitle() + " - years of experience: " +
              employees[i].getYearsOfExperience());
    }
  }
}

class Guest {
  String name;
  int ticketNumber;

  public Guest(String name, int ticketNumber) {
    this.name = name;
    this.ticketNumber = ticketNumber;
  }
}

public class Main {
  Park park = new Park("Mesozoic Eden park", true);

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
        manageDinosaurs();
        break;
      case 2:
        manageEmployees();
        break;
      case 3:
        // manageTickets();
        break;
      case 4:
        checkParkStatus();
        break;
      case 5:
        // handleSpecialEvents();
        break;
      case 6:
        System.out.println("Exiting...");
        System.exit(0);
    }
  }

  // Methods
  public void manageDinosaurs() {
    System.out.println("1. Add Dinosaur");
    System.out.println("2. Remove Dinosaur");
    System.out.println("3. View Dinosaurs");
  }

  public void manageEmployees() {
    System.out.println("1. Add Employee");
    System.out.println("2. Remove Employee");
    System.out.println("3. View Employees");
  }

  public void checkParkStatus() {
    System.out.println("Park Name: " + park.getName());
    System.out.println("Open: " + park.getIsOpen());
    System.out.println("Total Dinosaurs: " + park.dinoCount);
    System.out.println("Total Employees: " + park.empCount);
  }
}