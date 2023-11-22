// printing a text methoad

public class Java02Print {
  public static void main(String[] args) {
    // This line prints the text "Hello World!" to the console and adds a new line.
    System.out.println("Hello World!");

    // This line prints the text "Hello World!" to the console with a new line using "\n".
    System.out.print("Hello World!\n");

    // This line uses the printf method to format and print text.
    // You can use format specifiers like %s for strings, %d for integers, %f for floats, %c for characters, %b for booleans, %x for hexadecimal, %o for octal, and %n for a new line.
    System.out.printf("Hello World!");

    // This line uses printf with format specifiers and arguments to print a more complex message.
    System.out.printf("Hello World! %s %d %f %c %b %x %o %n", "Java", 5, 3.14, 'A', true, 0x1A, 012);

    // This line uses the format() method to print a formatted message.
    System.out.format("Hello World! %s", "hello");

    // This line uses the write() method to output the character with an ASCII code of 65, which is 'A'.
    System.out.write(65); // This will output as "A".
  }
}
