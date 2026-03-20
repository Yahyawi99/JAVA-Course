
public class Main {
  public static void main(String args[]) {

    int TRexFood = 100;
    int BrachFood = 200;

    for (int time = 0; time < 24; time++) {
      if (time == 8 || time == 14 || time == 20) {
        System.out.println("It's " + time + ":00 - Feeding time for T-Rex with " + TRexFood + "kg of food");
        ;
      }
      if (time == 7 || time == 11 || time == 15 || time == 19) {
        System.out.println("It's " + time + ":00 - Feeding time for Brachiosaurus with " + BrachFood + "kg of food");
        ;
      }

    }
  }
}
