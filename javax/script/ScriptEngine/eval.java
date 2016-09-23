public class eval {

  public static void main(String[] argv) {

    javax.script.ScriptEngine se = new javax.script.ScriptEngineManager().getEngineByName("javascript");

    try {
      Object ret = se.eval("21 * 2");
      System.out.println(ret.toString());
    }
    catch (javax.script.ScriptException e) {
      System.out.println(e.toString());
    }

  }

}
