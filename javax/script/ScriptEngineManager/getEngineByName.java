public class getEngineByName {

  public static void main(String[] args) {

    javax.script.ScriptEngineManager sem = new javax.script.ScriptEngineManager();
    javax.script.ScriptEngine        eng = sem.getEngineByName("nashorn");

    System.out.println(eng.toString());

  }

}
