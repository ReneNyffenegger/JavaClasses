// javac -classpath ../commons-lang3.jar   split.java
// java  -classpath ../commons-lang3.jar:. split
public class split {

  public static void main(String[] argv) {

    String str = new String("one two three four five six seven eight nine ten");

    for (String num: org.apache.commons.lang3.StringUtils.split(str)) {

      System.out.println(num);

    }
  }

}
