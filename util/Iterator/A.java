public class A {

  private int    i;
  private String s;

  public A(int i_, String s_) {
    i = i_;
    s = s_;
  }

  public String toString() {

    return i + ": " + s;

  }

  public static void main(String[] args) {

    java.util.ArrayList<A> array = new java.util.ArrayList<A>();

    array.add (new A( 1, "one"       ));
    array.add (new A( 2, "two"       ));
    array.add (new A(42, "fourty-two"));

    java.util.Iterator<A> iter = array.iterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }


  }


}
