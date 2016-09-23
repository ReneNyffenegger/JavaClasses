public class getEncoder {

  public static void main(String[] argv) {

    java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();

 // Compare with encoder.encodeToString(...)
    byte[] encoded = encoder.encode("Hello World".getBytes());

    System.out.println("Encoded: " + new String(encoded));
  }

}
