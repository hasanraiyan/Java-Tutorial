//A methoad is a block of code which only runs when it is called. Methods are used to perform certain actions, and they are also known as functions.
// Create a method
// To create a method, use the following syntax:

public class Methods {
  static void myMethod() {
    // here , myMethod is the name of the method, static means the method belongs to the Methods class as opposed to an object of the Methods class, void means that the method does not have a return value, and the code to be executed is enclosed in curly braces.
    // code to be executed
    System.out.println("This is my first method");
  }
  
  public static void main(String[] args) {
    myMethod(); // call the method
    // Outputs "This is my first method"
    //A method can also be called multiple times
    myMethod();
    myMethod();
  }
}
