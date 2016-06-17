public class getProperty {

  static private void  p(String propertyName) {

    System.out.println(String.format("%1$-" + 20 + "s", propertyName + ":") + System.getProperty(propertyName));

  }

  public static void main(String[] argv) {

  //   «Predefined» properties

    p("file.separator"  ); //   "/" on UNIX and "\" on Windows.
    p("java.class.path" ); //   Try   java -cp foo:bar:. getProperty   to see effect
    p("java.home"       ); //   Installation directory for JRE
    p("java.vendor"     ); //   JRE vendor name
    p("java.vendor.url" ); //   JRE vendor URL
    p("java.version"    ); //   JRE version number
    p("line.separator"  ); //   How text files seperate lines
    p("os.arch"         ); //   Processor?
    p("os.name"         );
    p("os.version"      );
    p("path.separator"  ); //   : on Unix and ; on Windows?
    p("user.dir"        ); //   Working directory
    p("user.home"       ); //   Home directory
    p("user.name"       );

 //    Properties passed with the -D flag
  
    p("foo.bar"         ); //   java -Dfoo.bar=something getProperty 


  }

}
