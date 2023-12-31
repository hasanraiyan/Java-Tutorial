public class Java04DataTypes {
  public static void main(String[] args) {
    // Declare and initialize a final variable 'a' with the value 10.
    final int a1 = 10;

    // Attempting to reassign a final variable will result in a compilation error.
    // Uncommenting this line would lead to a compilation error.
    // a = 20;

    // Print the value of 'a' to the console.
    System.out.println(a1);

    // Declare and initialize a string variable 'firstName' with the value "John".
    String firstName = "John";

    // Declare and initialize a string variable 'lastName' with the value "Doe".
    String lastName = "Doe";

    // Concatenate 'firstName' and 'lastName' with a space in between and store the result in 'fullName'.
    String fullName = firstName + " " + lastName;

    // Print the value of 'fullName' to the console, which will be "John Doe".
    System.out.println(fullName); 
    System.out.println("Hello, " + fullName + "!");

    int x =7;   // Declare and initialize an integer variable 'x' with the value 7.
    int y = 9;   // Declare and initialize an integer variable 'y' with the value 9.
    System.out.println(x+y);  // Print the sum of 'x' and 'y' to the console.

    int a=1, b=6 , c=9; // Declare and initialize three integer variables 'a', 'b', and 'c' with the values 1, 6, and
    System.out.println(a+b+c); 

    // java identifiers
    int minutesPerHour = 60; // Good
    int m = 60; // ok, but not so easy to understand what m is

    // java data types
    // Integer types
    byte aSingleByte = 100; // -128 to 127
    short aSmallNumber = 20000; // -32,768 to 32,767
    int anInteger = 2147483647; // -2147483648 to 2147483647
    long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
    System.out.println(aSingleByte);
    System.out.println(aSmallNumber);
    System.out.println(anInteger);
    System.out.println(aLargeNumber);


    // Decimal types
    float aFloat = 3.4028F; // 7 decimal digits
    float aFloat1 = 3.897f; // you can use f or F
    double aDouble = 1.79769313D; // 16 decimal digits
    double aDouble1 = 3.14d; // you can use d or D
    System.out.println(aFloat);
    System.out.println(aFloat1);
    System.out.println(aDouble);
    System.out.println(aDouble1);



    // Scientific numbers
    double sciDouble = 12E4D;
    System.out.println(sciDouble);

    //Boolean types
    // The boolean data type can have only two values: true and false.
    boolean isJavaFun = true;
    boolean isfishTasty = false;
    System.out.println(isJavaFun); // Output true
    System.out.println(isfishTasty); // Outputs false

    //character types
    // char it store single letter, number, or ASCII values.
    char copyrightSymbol = '\u00A9';
    System.out.println(copyrightSymbol);

    char myGrade = 'B';
    System.out.println(myGrade); // B

    // Non-primitive data types
    // Non-primitive data types are called reference types.
    // Reference types are used to store the memory addresses of objects.
    String name = "John";
    System.out.println(name);

    //java type casting
    // Widening casting (automatically) lets you convert a smaller type to a larger type
    // byte -> short -> char -> int -> long -> float -> double
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    System.out.println(myInt); // Outputs 9
    System.out.println(myDouble); // Outputs 9.0

    // Narrowing casting (manually) lets you convert a larger type to a smaller type
    // double -> float -> long -> int -> char -> short -> byte
    double myDouble1 = 9.78d;
    int myInt1 = (int) myDouble1; // Manual casting: double to int
    System.out.println(myDouble1); // Outputs 9.78
    System.out.println(myInt1); // Outputs 9


  }
}
