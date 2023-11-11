// Java Arrays
public class JavaLec10JavaArrays {
  public static void main(String[] args) {
    // Java Arrays
    // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    // Syntax : 
    // dataType[] arrayName = new dataType[size];
    // dataType - Specifies the data type of the elements stored in the array.
    // arrayName - Specifies the name of the array.
    // new dataType[size] - Creates a new array of the specified size.
    // size - Specifies the number of elements in the array.
    // Arrays are zero-indexed, which means that the first element of an array has an index of 0.
    // To access an element in an array, you use the index of the element.
    // Syntax : arrayName[index]
    // Example :
    int[] marks = new int[3];
    marks[0] = 98;
    marks[1] = 95;
    marks[2] = 94;
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);

    String[] cars ={"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);
    // to find the length of an array
    System.out.println(cars.length);
    // Looping through an array
    for (int i = 0; i < cars.length; i++) {
    System.out.println(cars[i]);
    }

    // for each loops
    // for (dataType varName : arrayName) {
    //   // code block to be executed
    // }
    // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }
    // Multidimensional Arrays
    // Multidimensional arrays are arrays that contain other arrays as elements.
    // Syntax :
    // dataType[][] arrayName = new dataType[size1][size2];
    // size1 - Specifies the number of arrays contained in the outer array.
    // size2 - Specifies the number of elements contained in each inner array.

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]);
    // To access the elements of a multidimensional array, you use two indices, one for the outer array and
    // one for the inner array.
    // Syntax : arrayName[outerArrayIndex][innerArrayIndex]
    // Example :

    // loop through a multidimensional array
    for (int i =0; i<myNumbers.length; ++i ) {
       for(int j = 0; j < myNumbers[i].length; ++j) {
         System.out.println(myNumbers[i][j]);
       }
    }
  }
}
