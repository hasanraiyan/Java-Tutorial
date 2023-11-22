// Question: Print table from 2 to n ?
import java.util.Scanner;

public class Question01{
    static void multiply(int n){
        for (int i=1 ; i<11; i++){

            int z= n*i;
            System.out.println(n + " * " + i + " = " + z);
        }
    }
    public static void main(String[] args){
        int z;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number till you want to get mulptiple of: ");
        z = scan.nextInt();
        for (int i =2 ; i<z ;i++){
            System.out.println("Table of "+i);
            multiply(i);
        }
    }
}
