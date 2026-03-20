
public class Main {
  public static void main(String args[]) {
    String[] dinoNames = {
        "Rex", "Blue", "Spike", "Echo", "Delta",
        "Max", "Nova", "Titan", "Zara", "Bolt"
    };
    int[] dinoAges = {
        12, 8, 15, 6, 10,
        14, 9, 20, 7, 11
    };
    String[] dinoSpecies = {
        "Tyrannosaurus", "Velociraptor", "Stegosaurus",
        "Velociraptor", "Velociraptor", "Triceratops",
        "Spinosaurus", "Brachiosaurus", "Dilophosaurus",
        "Ankylosaurus"
    };
    int[] dinoEnclosures = {
        1, 2, 3, 2, 2,
        4, 5, 6, 7, 8
    };

    for (int i = 0; i < 10; i++) {
      System.out.println(dinoNames[i] + " is a " + dinoAges[i] + " years-old " + dinoSpecies[i]
          + " and he's kept in enclosure number " + dinoEnclosures[i]);
    }

    int total = 0;
    for (int age : dinoAges) {
      total += age;
    }

    System.out.println("The average age of all the dinosaurs is : " + total / dinoAges.length + "years-old");
    ;
  }

}
