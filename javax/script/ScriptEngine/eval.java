public class eval {

  public static void main(String[] argv) {

    javax.script.ScriptEngine se = new javax.script.ScriptEngineManager().getEngineByName("javascript");

    try {
      Object ret = se.eval(
       "  a = 21; " +
       "  b =  2; " +
       "  a*b "
      );
      System.out.println(ret.toString());

      ret = se.eval(new java.io.FileReader("division.js"));
      System.out.println(ret.toString());

    }
    catch (javax.script.ScriptException e) {
      System.out.println(e.toString());
    }
    catch (java.io.IOException e) {
      System.out.println(e.toString());
    }

  }

}
