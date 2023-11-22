// Method scope
// Variables defined inside a method are only accessible within that method.
public class MethodScope {
  public static void main(String[] args) {
    // code here CANNOT use myNum
    int myNum = 5;
    // code here can use myNum
    System.out.println(myNum);

  }
}