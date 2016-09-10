public class currentTimeMillis {

  public static void main(String[] argv) {

    long ms_start = java.lang.System.currentTimeMillis();

    long ms_now   = ms_start;

    int  i = 1;

    while (ms_start + 1000 > ms_now) {

      System.out.println(i);

      ms_now = java.lang.System.currentTimeMillis();
      i++;
    }

  }

}
