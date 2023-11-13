// Block Scope: Variables defined inside a block ({}) are only accessible within that block.
public class Scope {
  public static void main(String[] args) {
    // code here CANNOT use myNum
    {
      // This is a block
      // Here you can not use myNum
      int myNum = 5;
      // Here you can use myNum
      System.out.println(myNum);

    }// end of block

  // code here CANNOT use myNum
  //A block of code may exist on its own or it can belong to an if, while or for statement. In the case of for statements, variables declared in the statement itself are also available inside the block's scope.
}