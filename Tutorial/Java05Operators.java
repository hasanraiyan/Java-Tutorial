// Java operators
public class Java05Operators {
  public static void main(String[] args) {
    // Arithmetic operators
    // addition operator "+"
    int sum = 100 + 50; // 150 (100 + 50)
    System.out.println(sum);

    // subtraction operator "-"
    int sub = 100 - 50; // 50 (100 - 50)
    System.out.println(sub);

    // multiplication operator "*"
    int multiply = 100 * 50; // 5000 (100 * 50)
    System.out.println(multiply);

    // division operator "/"
    int divide = 100 / 50; // 2 (100 / 50)
    System.out.println(divide);

    // remainder operator "%"
    int remainder = 100 % 50; // 0 (100 % 50)
    System.out.println(remainder);

    // increment operator "++"
    int increment = 100;  
    increment++; // 101 (increment = increment + 1)

    // decrement operator "--"
    int decrement = 100;
    decrement--; // 99 (decrement = decrement - 1)

    // Assignment operators : it assigns a value to a variable
    int x = 10;
    // addition assignment operator "+="
    int y=10;
    y += 5; // y = y + 5
    System.out.println(y); // 15 
    // subtraction assignment operator "-="
    int z = 5;
    z -= 3; // z = z - 3
    System.out.println(z); // 2

    // multiplication assignment operator "*="
    int a = 5;
    a *= 2; // a = a * 2
    System.out.println(a); // 10
    
    // division assignment operator "/="
    int b =6;
    b /= 2; // b = b / 2
    System.out.println(b); // 3

    // remainder assignment operator "%="
    int c = 6;
    c %= 2; // c = c % 2

    // Java Comparison operaors
    // Comparison operators are used to compare two values.
    // it returns a boolean value (true or false)

    // Equality operator "=="
    int num1 = 10;
    int num2 = 10;
    System.out.println(num1 == num2); // true

    // Not equal to operator "!="
    int num3 = 10;
    int num4 = 9;
    System.out.println(num3 != num4); // true

    // Greater than operator ">"
    int num5 = 10;
    int num6 = 9;
    System.out.println(num5 > num6); // true

    // Greater than or equal to operator ">="
    int num7 = 10;
    int num8 = 11;
    System.out.println(num7 >= num8); // false

    // Less than operator "<"
    int num9 = 10;
    int num10 = 9;
    System.out.println(num9 < num10); // true

    // Less than or equal to operator "<="
    int num11 = 10;
    int num12 = 7;
    System.out.println(num11 <= num12); // false

    // Logical operators: used to combine two or more boolean expressions
    // Logical AND operator "&&"
    int num13 = 10;
    int num14 = 9;
    System.out.println(num13 > num14 && num13 == num14); // false, it returns true when both expressions are true

    // Logical OR operator "||"
    int num15 = 10;
    int num16 = 9;
    System.out.println(num15 > num16 || num15 == num16); // true, it returns

    // Logical NOT operator "!"
    int num17 = 10;
    System.out.println(!(num17 == num16)); // true

  }
}
