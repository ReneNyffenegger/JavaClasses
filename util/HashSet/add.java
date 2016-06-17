public class add {

  public static void main(String[] argv) {

    java.util.HashSet<String> hash = new java.util.HashSet<String>();

    hash.add("one"  );
    hash.add("two"  );
    hash.add("one"  );
    hash.add("three");
    hash.add("five" );
    hash.add("four" );
    hash.add("five" );
    hash.add("three");
    hash.add("two"  );

    for (String elem: hash) {
       System.out.println(elem);
    }

  }
}
