public class getBytes {


  private static void printHex(byte[] bytes) {

    for (byte b: bytes) {
      System.out.printf("%02x ", b);
    }
    System.out.println();

  }


  public static void main(String[] argv) {

    String text = new String("René");

    try {
      printHex(text.getBytes(            ));
      printHex(text.getBytes("ISO-8859-1"));
      printHex(text.getBytes("UTF-8"     ));
      printHex(text.getBytes("UTF-16"    ));
      printHex(text.getBytes("UTF-32"    ));
      printHex(text.getBytes("GB18030"   ));
      printHex(text.getBytes("EBCDIC"    ));
    }
    catch (java.io.UnsupportedEncodingException e) {
      System.out.println(e.toString());
    }
  }

}
