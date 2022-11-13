public class Main {
  public static void main(String[] args) {
    Ints intsCalc = new IntsCalculator();
    System.out.println(intsCalc.sum(2, 2));
    System.out.println(intsCalc.mult(10, 22));
    System.out.println(intsCalc.pow(2, 10));

    System.out.println("---");
    System.out.println(((IntsCalculator) intsCalc).sub(5, 2));
    System.out.println(((IntsCalculator) intsCalc).div(10, 5));
  }
}
