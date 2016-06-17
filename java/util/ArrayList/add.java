public class add {

  public static void main(String[] argv) {

    java.util.ArrayList<String> array = new java.util.ArrayList<String>();

    array.add("one"  );
    array.add("two"  );
    array.add("three");
    array.add("four" );
    array.add("five" );

    for (String elem: array) {
       System.out.println(elem);
    }

  }

}
