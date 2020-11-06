public class exec {

   public static void main(String[] argv) {

      java.lang.Runtime rt = java.lang.Runtime.getRuntime();

      try {

      // java.lang.Process proc   = rt.exec("c:\\Program Files\\Mozilla Firefox\\firefox.exe http://renenyffenegger.ch/");
         java.lang.Process proc   = rt.exec("cmd.exe /c dir /s /b ..\\..");

      // proc.waitFor();

      //
      // Note: «StdOut» is returned by getInputStream() | and «stdIn» is returned by «getOutputStream»...
      //
         java.util.Scanner stdOut = new java.util.Scanner(proc.getInputStream()).useDelimiter("\\n");
      // java.util.Scanner stdErr = new java.util.Scanner(proc.getErrorStream()).useDelimiter("\\n");

         while (stdOut.hasNext() && proc.isAlive()) {
            System.out.println("stdout: " + stdOut.next());
         }
      // while (stdErr.hasNext()) {
      //    System.out.println("stdErr: " + stdErr.next());
      // }
         
      }
      catch (java.lang.Exception ex) {
         System.out.println(ex.toString());
      }
   }
}
