public class put {

  public static void main(String[] args) {

    try {

      javax.script.ScriptEngine se = new javax.script.ScriptEngineManager().getEngineByName("javascript");

      se.put("var_one", 7);
      se.put("var_two", 6);

      Object ret = se.eval("print(var_one * var_two);");

    }
    catch (javax.script.ScriptException e) {
      System.out.println(e.toString());
    }

  }

}
