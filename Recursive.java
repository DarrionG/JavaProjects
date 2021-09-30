/*This program consists of two methods
  method 1: fractionSums() takes an input of type int from the user and assigns it to n
  it then returns the result of 1/n + 1/(n-1) using recursion
  method 2: linesOfStars() takes an input of type int from the user and assigns it to n
  then it prints out a right pointing pyramid of size 2*n also uses recursion */

import java.util.Scanner;

public class Recursive {
    //Returns the sum of fractions of the input
    public static float fractionSums(float n){
        //base case
        if(n == 1){
            return n;
        }
        //recursive call
        else{
            return ((1/n) + fractionSums(n-1));
        }
    }
    //returns lines of stars based on n
    public static void linesOfStars(int n, int j){
            //Stops the user from entering a negative number
            if (n < 0 || j < 0){
                throw new IllegalArgumentException("Please enter a positive number");
            }
            try {
                //base case
                if (j == 0) {
                    if (n == 0) {
                        System.out.print("");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print(" *");
                        }
                        System.out.print("\n");
                        //recursive call
                        linesOfStars(n - 1, j);
                    }
                } else {
                    for (int h = n; h >= j; h--) {
                        System.out.print(" *");
                    }
                    System.out.print("\n");
                    //recursive call
                    linesOfStars(n, j - 1);
                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
    }
    //main
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        //start --
        //runs fractionSums function
            System.out.println("Enter an integer for sum of fractions");
            int userChoice2 = scn.nextInt();
            System.out.println(fractionSums((userChoice2)));
            //end--
        //runs linesOfStars function
            System.out.println("Enter an integer for lines of stars");
            int userChoice3 = scn.nextInt();
                linesOfStars(userChoice3, userChoice3);
                //end--
    }
}
