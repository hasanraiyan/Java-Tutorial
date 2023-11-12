// Java String used to store text
public class Java06Strings {
  public static void main(String[] args){
    String greeting = "Hello"; // method to declare a string
    String greeting2 = new String("Hello"); // method to declare a string

    // methoads of String
    // length() : returns the length of the string
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    // toUpperCase() : converts the string to uppercasel
    System.out.println("The uppercase of the txt string is: " + txt.toUpperCase());
    // toLowerCase() : converts the string to lowercase
    System.out.println("The lowercase of the txt string is: " + txt.toLowerCase());
    // indexOf() : returns the index of the first occurrence of a specified text in a string
    String txt2 = "Please locate where 'locate' occurs!";
    System.out.println(txt2.indexOf("locate"));
    // important point: java counts position from 0 

    // concat() : joins two strings
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName)); // JohnDoe

    // equals() : compares two strings
    String txt3 = "Hello";
    String txt4 = "Hello";
    System.out.println(txt3.equals(txt4)); // true
    // equalsIgnoreCase() : compares two strings ignoring case sensitivity
    System.out.println(txt3.equalsIgnoreCase(txt4)); // true
    // compareTo() : compares two strings
    String txt5 = "Hello";
    String txt6 = "Hello";
    System.out.println(txt5.compareTo(txt6)); // 
    // important point: compareTo() returns a negative value if the first string is less than the second string, a
    // positive value if the first string is greater than the second string, and 0 if they are equal

    // trim() : removes whitespace from both ends of a string
    String txt7 = "      Hello World!      ";
    System.out.println(txt7.trim()); // Hello World!
    
    // replace() : replaces a specified text with another text
    String txt8 = "Hello World";
    System.out.println(txt8.replace("World", "Java")); // Hello Java
    // important point: replace() replaces only the first occurrence of a text
    // replaceFirst() : replaces the first occurrence of a text
    String txt9 = "Hello World";
    System.out.println(txt9.replaceFirst("World", "Java")); // Hello Java
    // replaceAll() : replaces all occurrences of a text
    String txt10 = "Hello World and how are you in this World!";
    System.out.println(txt10.replaceAll("World","Sansaar"));

    // substring() : extracts a part of a string
    String txt11 = "Hello World";
    System.out.println(txt11.substring(6,11)); // World
    // important point: substring() extracts characters from a string based on the index
    // substring(int start, int end) : extracts characters from a string based on the index

    // adding number with string
    int num1 = 10;
    int num2 = 20;
    String txt12 = "10";
    String txt13 = "20";
    System.out.println(num1 + num2); // 30
    System.out.println(txt12 + txt13); // 1020
    // important point: concat() joins two strings

    // escape sequences
    // \n : new line
    System.out.println("Hello\nWorld");
    // \t : tab
    System.out.println("Hello\tWorld");
    // \b : backspace
    System.out.println("Hello\bWorld");  // HelloWorld
    // \r : carriage return
    System.out.println("Hello\rWorld"); // World
    // \' : single quote
    System.out.println("Hello\'World"); // Hello'World
    // \" : double quote
    System.out.println("Hello\"World"); // Hello"World
    // \\ : backslash
    System.out.println("Hello\\World"); // Hello\World
    // \f : form feed
    System.out.println("Hello\fWorld"); // HelloWorld
    // \0 : null character
    System.out.println("Hello\0World"); // HelloWorld
 
  }
}
