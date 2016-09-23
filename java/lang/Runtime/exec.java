public class exec {

  public static void main(String[] argv) {

    java.lang.Runtime rt = java.lang.Runtime.getRuntime();

    try {
      java.lang.Process pr = rt.exec("c:\\Program Files\\Mozilla Firefox\\firefox.exe http://renenyffenegger.ch/");
    }
    catch (java.io.IOException ex) {
      System.out.println(ex.toString());
    }

  }

}
