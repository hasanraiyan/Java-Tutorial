// Java if ... Else
// syntax
public class Java08IfElse {
  public static void main(String[] args) {

    /* if (condition) {
    // block of code to be executed if the condition is true
    } */
    
   if (2<1){
     System.out.println("2 is less than 1");
   
   } 
    
/* if (condition){
  // block of code to be executed if the condition is true

} else {
  // block of code to be executed if the condition is false
} */
    if (20 > 18) { 
      System.out.println("20 is greater than 18");
    }
      
    else {
      System.out.println("20 is less than 18");
    }
     // short hand if else : ternary operator
    // Syntax : variable = (condition) ? expressionTrue : expressionFalse;
    String result = (20 > 18) ? "20 is greater than 18" : "20 is less than 18";
    System.out.println(result);
    
    
// if else if
/* if (condition){
   // block of code to be executed if the condition is true
} else if (condition){
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
} */

    int time = 20;
    if (time < 18) {
      System.out.println("Good day.");
    } else if (time > 18){
      System.out.println("Good evening.");
    } else {
      System.out.println("Good night.");
    }


    // Switch statement :
    // Syntax : switch (expression) {
    // case value1:
    // // code block
    // break;
    // case value2:
    // // code block
    // break;
    // case value3:
    // // code block
    // break;
    // default:
    // // code block
    // }

    int day = 4;
    switch (day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }
  }
}
