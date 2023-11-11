// loops in java
public class javaLec09Loops {
  public static void main(String[] args) {
    //Loops in java
    //While loop
    // Syntax : while (condition) {
    //   // code block to be executed
    // }

    int i=0;
    while (i<11){
      System.out.println(i);
      i++;
    }

    // Do while loop
    // Syntax : do {
    //   // code block to be executed
    // } while (condition);

    int j=0;
     do {
       System.out.println(j);
       j++;
  } while (j<11);

    // For loops
    // Syntax : for (statement 1; statement 2; statement 3) {
    //   // code block to be executed
    // }
    // statement 1 is executed (one time) before the execution of the code block.
    // statement 2 defines the condition for executing the code block.
    // statement 3 is executed (every time) after the code block has been executed.

    for (int k=0; k<11; k++){
      System.out.println(k);
    }
    //Nested loops

    for (int a = 1; a<=2; a++){
      System.out.println("Outer: " + a); // Executes 2 times
      for (int b = 1; b<=3; b++){
        System.out.println("Inner: " + b); // Executes 6 times (2 * 3)
      }
    }

    // break and continue
    // break : used to jump out of a loop
    // continue : used to skip the current iteration
    for (int c = 0; c<10; c++){
      if (c==4){
        break;
      }
      System.out.println(c);
    }

    for (int l = 0; l<10; l++){
      if (l==4){
        continue;
      }
      System.out.println(l);
    }
    
  }
}
