public class displayFileContent {

  public static void main(String[] args) {

    try {
      java.io.FileReader fr = new java.io.FileReader("displayFileContent.java");

      int c;
      while ( (c = fr.read()) != -1) {
        System.out.print(Character.toChars(c));
      }

    }
    catch (java.io.FileNotFoundException e) {
      System.out.println(e.toString());
    }
    catch (java.io.IOException e) {
      System.out.println(e.toString());
    }

  }

}
