//Method Overloading: Mutiple Methods with the same name but different parameters.
public class MethodsOverloading {
  static int plusMethod(int a, int b){
    return a + b;
  }
  static double plusMethod(double a, double b){
    return a + b;
  }
  public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1); // output 13
    System.out.println("double: " + myNum2);// Outputs 10.55
  }
}

