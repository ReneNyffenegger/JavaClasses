public class oraConnection {

   public static java.sql.Connection get() throws java.sql.SQLException {

      try {
         return java.sql.DriverManager.getConnection("jdbc:oracle:oci:rene/rene@ora19");
      }
      catch (Exception e) {
         System.out.println(e);
         System.exit(-1);
         return null; // Never reached
      }
   }
}
