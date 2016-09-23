public class getenv {

  public static void main(String[] argv) {

    java.util.Map<String, String> envVars = System.getenv();

    for (String varName: envVars.keySet()) {
       System.out.format("%-40s= %s%n", varName, envVars.get(varName));
    }


    System.out.println();

    System.out.println("$HOME=" + System.getenv("HOME"));

  }

}
