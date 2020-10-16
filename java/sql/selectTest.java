//  & "$env:ORACLE_HOME\jdk\bin\javac"  -cp "$env:ORACLE_HOME\jdbc\lib\ojdbc8.jar;." ./oraConnection.java ./selectTest.java
//  & "$env:ORACLE_HOME\jdk\bin\java"   -cp "$env:ORACLE_HOME\jdbc\lib\ojdbc8.jar;."  selectTest

public class selectTest {

   public static void main(String[] args) {

      try {

         java.sql.Connection conn = oraConnection.get();

         java.sql.Statement sqlStatement=  conn.createStatement();
         String readRecordSQL  = "select user, sysdate from dual";
         java.sql.ResultSet myResultSet =  sqlStatement.executeQuery(readRecordSQL);

         while (myResultSet.next()) {
            System.out.println("User:    " + myResultSet.getString("USER"   ));
            System.out.println("Sysdate: " + myResultSet.getString("SYSDATE"));
         }

          myResultSet.close();
          conn.close();
      }
      catch (Exception e) {
          System.out.println(e);
      }
   }
}
