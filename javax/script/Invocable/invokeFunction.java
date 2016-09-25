public class invokeFunction {

  public static void main(String[] args) throws Exception {

    javax.script.ScriptEngine se = new javax.script.ScriptEngineManager().getEngineByName("javascript");

    se.eval(String.join("\n",
          "function aFunc(a, b) {",
          "  return a * b;",
          "}")
    );

    javax.script.Invocable iv = (javax.script.Invocable) se;

    Object ret = iv.invokeFunction("aFunc", 7, 6);

    System.out.println(ret);

  }

}
