public class isDirectory {

//  Call for example with
//
//      java isDirectory /not/a/directory
//      java isDirectory $(pwd)

  public static void main(String[] argv) {

    if (argv.length != 1) {

      System.out.println("Exactly one argument required");
      System.exit(-1);

    }

    java.io.File f=new java.io.File(argv[0]);

    if (f.isDirectory()) {
      System.out.println(f.toString() + " is a directory");
    }
    else {
      System.out.println(f.toString() + " is not a directory");
    }

  }

}
