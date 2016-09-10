public class parseHexBinary {

  public static void main(String[] args) {

    byte[] bytes = javax.xml.bind.DatatypeConverter.parseHexBinary("48656C6C6F20576F726C64");
    String text  = new String(bytes);

    System.out.println(text); // Hello World
      
  }

}
