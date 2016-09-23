public class add {

  private int    i;
  private String s;

  public add(int i_, String s_) {
    i = i_;
    s = s_;
  }

  public String toString() {

    return i + ": " + s;

  }

  public static void main(String[] args) {

    java.util.ArrayList<add> array = new java.util.ArrayList<add>();

    array.add (new add( 1, "one"       ));
    array.add (new add( 2, "two"       ));
    array.add (new add(42, "fourty-two"));

    java.util.Iterator<add> iter = array.iterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }


  }


}
