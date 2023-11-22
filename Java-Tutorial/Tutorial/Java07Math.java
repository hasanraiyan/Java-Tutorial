// Java Math

public class Java07Math {
  public static void main(String[] args) {
    // java math
    // abs(x) : returns the absolute value of a number
    System.out.println(Math.abs(-4.7)); // 4.7
    // max(x,y) : return the maximum of two number
    System.out.println(Math.max(100,200)); // 200
    // min(x,y) : return the minimum of two number
    System.out.println(Math.min(100,200)); // 100
    // sqrt(x) : return the square root of a number
    System.out.println(Math.sqrt(64)); // 8.0
    // random() : return a random number between 0 and 1
    System.out.println(Math.random()); // 0 - 1
    // pow(x,y) : return x to the power of y
    // to get more control over random no
    // (int)(Math.random()*range) + min
    System.out.println((int)(Math.random()*10) + 1); // 1 - 10
    System.out.println(Math.pow(2,3)); // 8.0

  }
}
