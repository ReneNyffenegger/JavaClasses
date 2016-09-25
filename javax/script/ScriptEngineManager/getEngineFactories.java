public class getEngineFactories {

  public static void main(String[] args) {

    javax.script.ScriptEngineManager sem = new javax.script.ScriptEngineManager();
    java.util.List<javax.script.ScriptEngineFactory> fac = sem.getEngineFactories();

    for (javax.script.ScriptEngineFactory f: fac) {
      System.out.println(f.toString());
    }

  }

}
