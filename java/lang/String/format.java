public class format {

  public static void main(String[] argv) {

    String res = String.format(
          "The string is >%s<, the number is %d, the float is %f.",
          "hello world",
           42,
          -18.29
    );

    System.out.println(res);

  }


}
