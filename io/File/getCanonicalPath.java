public class getCanonicalPath {

  public static void main(String[] argv) {

    java.io.File f = new java.io.File("/path/that/does/foo/bar/../../not/exist");

    try { 
      System.out.println(f.getCanonicalPath());
    }
    catch (java.io.IOException e) {
      System.out.println("Caught: " + e.toString());
    }

  }

}
