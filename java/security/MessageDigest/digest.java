public class digest {

  private static void digest(byte[] src, String algorithm) { try {

    java.security.MessageDigest md = java.security.MessageDigest.getInstance(algorithm);

    byte[] digested = md.digest(src);

    String digestedHex = javax.xml.bind.DatatypeConverter.printHexBinary(digested);

    System.out.println(algorithm + ": " + digestedHex);

    } catch (java.security.NoSuchAlgorithmException e ) {
      System.out.println(e.toString());
    }

  }

  public static void main(String[] argv) { try {

    String text = new String("Foo bar baz");
    byte[] src  = text.getBytes("UTF-8");

    digest(src, "MD2"    );
    digest(src, "MD5"    );
    digest(src, "SHA-1"  );
    digest(src, "SHA-256");
    digest(src, "SHA-384");
    digest(src, "SHA-512");

    } catch(java.io.UnsupportedEncodingException e) {
      System.out.println(e.toString());
    }

  }

}
