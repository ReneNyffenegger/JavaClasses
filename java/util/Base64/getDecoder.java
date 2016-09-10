public class getDecoder {

  public static void main(String[] argv) {

    java.util.Base64.Decoder decoder = java.util.Base64.getDecoder();
    byte[] decoded = decoder.decode("SGVsbG8gV29ybGQ=".getBytes());

    System.out.println("Decoded: " + new String(decoded));
  }

}

