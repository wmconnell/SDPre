public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;
    side1 = 10;
    side2 = 8;
    double hypotenuseSq = (side1 * side1) + (side2 * side2);
    hypotenuse = Math.sqrt(hypotenuseSq);
    System.out.println(hypotenuse);
  }
}
