// Paramets and Arguments
// Parameters are variables that are passed to a method when it is called, while arguments are the values that are passed to a method when it is called.
// Consider the following example:
public class ParametersAndArguments {
  static void myMethod(int a , int b) {  
    System.out.println(a + b);
  }
  // return values 
  static int sum(int a, int b) {
    return a + b;
  }
  // if age is less than 18 you can not vote
  static boolean canVote(int age) {
    if (age < 18) {
      return false;
    } else {
      return true;
    }
  }
  public static void main(String[] args) {
    myMethod(5, 5);
    // Outputs 10
    System.out.println(sum(5, 5));
    // use camVote
    System.out.println(canVote(17));

  }
}
