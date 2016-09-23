public class printHexBinary {

  public static void main(String[] args) {

    byte[] bytes  = "Hello World".getBytes();
    String hexStr = javax.xml.bind.DatatypeConverter.printHexBinary(bytes);
    
    System.out.println(hexStr); // 48656C6C6F20576F726C64

  }

}
