// Java Recursion: Recursion is techniques of making a function   call itself
public class JavaRecursion {
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);

    } else {
      return 0;
    }

  }

  public static void main(String[] args) {
    sum(7);
  }
}