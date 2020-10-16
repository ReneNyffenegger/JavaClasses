// & "$env:ORACLE_HOME\jdk\bin\javac"  -cp "$env:ORACLE_HOME\jdbc\lib\ojdbc8.jar;." ./oraConnection.java ./selectClob.java
// & "$env:ORACLE_HOME\jdk\bin\java"   -cp "$env:ORACLE_HOME\jdbc\lib\ojdbc8.jar;."  selectClob

public class selectClob {

   public static void main(String[] args) {

      try {

         java.sql.Connection        conn = oraConnection.get();
         java.sql.PreparedStatement stmt = conn.prepareStatement("select * from files");
         java.sql.ResultSet         rs   = stmt.executeQuery();

         while (rs.next()) {

            String        fileName = rs.getString("NAME");
            java.sql.Clob clob     = rs.getClob  ("TEXT");

            fillFile(fileName, clob.getSubString(1, (int) clob.length()));
         }


         conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
   }

   private static void fillFile(String fileName, String content) {

      try {

         java.io.FileWriter fwr = new java.io.FileWriter(fileName);
         fwr.write(content);
         fwr.close();
         System.out.println(fileName);
      }
      catch (java.io.IOException ex) {
         System.out.println("Exception: " + ex.toString());
      }
   }
}
