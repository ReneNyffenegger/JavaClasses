public class sleep {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Going to sleep for 5 seconds...");

    java.lang.Thread.sleep(5 * 1000);

    System.out.println("...slept enough now.");
  }
}
