
public class Main {
  public static void main(String args[]) {

    String name = "Tyrannosaurus";
    float weight = 3500.6F;
    int per = 6;

    float foodWeight = (weight * per) / 100;

    int numberOfFeeding = 3;
    float singleFeedingWeight = foodWeight / numberOfFeeding;

    System.out.println("Our " + weight + "kg " + name + " dinosaur needs to eat");
    System.out.println(foodWeight + "kg daily, which means we need to serve " + singleFeedingWeight + "kg per feeding");

  }
}
