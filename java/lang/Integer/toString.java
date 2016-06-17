public class toString {

  public static void main(String[] argv) {

    int i = 42;
    String s = Integer.toString(i);
    System.out.println(s);

    alternatives();
  }

  private static void alternatives() {
    alternative_1();
    alternative_2();
  }

  private static void alternative_1() {
    int i = 38;
    String s = String.valueOf(i);
    System.out.println(s);
  }

  private static void alternative_2() {
    int i = -17;
    String s = "" + i;
    System.out.println(s);
  }
}
