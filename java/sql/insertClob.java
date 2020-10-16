// Create destination table:
//
//    create table files (
//       name varchar(260) primary key,
//       text clob
//    );
//
// & "$env:ORACLE_HOME\jdk\bin\javac"  -cp "$env:ORACLE_HOME\jdbc\lib\ojdbc8.jar;." ./oraConnection.java ./insertClob.java
// & "$env:ORACLE_HOME\jdk\bin\java"   -cp "$env:ORACLE_HOME\jdbc\lib\ojdbc8.jar;."  insertClob  wordlist.10000.txt  insertClob.java

public class insertClob {

   public static void main(String[] args) {

      try {

         if (args.length < 1) {
            System.out.println("Specify filenames to load");
            System.exit(-1);
         }

         java.sql.Connection conn = oraConnection.get();

         String sql = "insert into files(name, text) values (?, ?)";
         java.sql.PreparedStatement stmt = conn.prepareStatement(sql);

         for (String fileName: args) {
            insertTextFileIntoClob(stmt, fileName);
         }

         conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
   }

   private static void insertTextFileIntoClob(java.sql.PreparedStatement stmt, String filename) {

      try {

         String fileContent = slurpFile(filename);

         java.io.Reader reader = new java.io.StringReader(fileContent);
         stmt.setString(1, filename);
         stmt.setCharacterStream(2, reader, fileContent.length());
         stmt.executeUpdate();
      }
      catch (java.sql.SQLException ex) {
         System.out.println("Problem: " + ex.toString());
      }
    }

   private static String slurpFile(String fileName) {
      byte a[] = null;
      try {
               java.io.InputStream fso = new java.io.FileInputStream(fileName);
               a = new byte[fso.available()];
               fso.read(a);
               fso.close();
      }
      catch(Exception e) {
         e.printStackTrace();
      }

      return (new String( a,0,a.length));
   }
}
