public class toHexString {

  private static void p(int i) {

    System.out.println(i + ": " + Integer.toHexString(i));

  }

  public static void main(String[] argv) {

    p(  0); //        0
    p( 16); //       10
    p(127); //       7f
    p(128); //       80
    p(255); //       ff
    p(256); //      100
    p(- 1); // ffffffff
    p(- 2); // fffffffe

  }

}
