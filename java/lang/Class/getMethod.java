public class getMethod {

  public void meth(String a, int b) {
    System.out.println("hi");
  }

  public static void main(String[] argv) {

    Class cl = getMethod.class;

    try {
      java.lang.reflect.Method m = cl.getMethod("meth", String.class, int.class);

    }
    catch (java.lang.NoSuchMethodException e) {
      System.out.println("meth with args does not exist in class " + cl.getName());
    }

  }

}
