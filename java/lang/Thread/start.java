class aRunnable implements java.lang.Runnable {

  private String ident_;

  public aRunnable(String ident)  {
     ident_ = ident;
  }

  public void run() {

    for (int i=0; i<20; i++) {
      System.out.println(ident_ + ": " + i);
    }

  }

}

public class start {

  public static void main(String args[]) {

    aRunnable rA = new aRunnable("A");
    aRunnable rB = new aRunnable("B");
    aRunnable rC = new aRunnable("C");

    java.lang.Thread threadA = new java.lang.Thread(rA);
    java.lang.Thread threadB = new java.lang.Thread(rB);
    java.lang.Thread threadC = new java.lang.Thread(rC);

    threadA.start();
    threadB.start();
    threadC.start();

  }
}
