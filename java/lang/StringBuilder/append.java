public class append {

  public static void main(String[] args) {

    String str = new StringBuilder()
      .append("foo ")
      .append("bar ")
      .append("baz" )
      .toString();

    System.out.println(str);

  }

}
