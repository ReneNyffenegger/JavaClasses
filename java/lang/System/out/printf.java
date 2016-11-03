public class printf {

  private static void p(String s, int i, double d) {
    System.out.printf("%-18s:  %4d   % 9.4f\n", new Object[] {s, i,  d});  
  }

  public static void main(String[] args) {

    p("one"                ,     1,    1.1     );
    p("two"                ,     2,    2.22    );
    p("twenty-four"        ,    42,   42.424242);
    p("minus nine hundred" ,  -900, -900.900   );

  }

}
