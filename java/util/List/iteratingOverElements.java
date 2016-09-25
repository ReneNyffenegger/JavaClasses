//
//     http://stackoverflow.com/questions/18410035/ways-to-iterate-over-a-list-in-java
//
public class iteratingOverElements {


  public static void main(String[] args) {

//  Note: java.util.List is an abstract class from which
//  java.util.Vector inherits.
    java.util.List<String> list = new java.util.Vector<String>();

    list.add("one"  );
    list.add("two"  );
    list.add("three");

    for (String s: list) {
      System.out.println(s);
    }

//  -------------------

    System.out.println("");
    for (java.util.Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
      System.out.println(iter.next());
    }

//  -------------------

    System.out.println("");
    for (java.util.ListIterator<String> iter = list.listIterator(); iter.hasNext(); ) {
      System.out.println(iter.next());
    }

//  -------------------

    System.out.println("");
    list.forEach(System.out::println);

//  -------------------

    System.out.println("");
    list.stream().forEach(System.out::println);

//  -------------------

    System.out.println("");
    list.parallelStream().forEach(System.out::println);

  }

}
