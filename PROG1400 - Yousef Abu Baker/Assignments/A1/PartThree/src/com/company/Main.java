//Part 3
//        Using Arrays, do the following:
//        Declare two dimensional array myArray[3][4] and let the program do the following:
//        1.	Enter the array’s elements from inside the program
//        (Hard coded, i.e., the Array elements should be initialized, i.e.,
//        no need to enter them from Java console).
//        2.	Calculate the total sum of the first row in the array.
//        Calculate the Average of all array’s elements.
//        Your results should be printed as follows:
//
//        Welcome to the Third Part!
//        The array’selements are:
//
//        10  20  30 40
//        12  15  18 19
//        10  10  10 10
//
//        The summation of Row # 1 is : 100
//
//        The average for the entire array is : 17
//
//
//
//
//
//        3.	Save the Previous array in a one-dimensional array and display the elements of the new array as follows:
//
//        The converted array’selements are:
//        10
//        20
//        30
//        40
//        12
//        15
//        18
//        19
//        10
//        10
//        10
//        10

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int row=3;
        int column=4;
        int [][] myArray = new int[row][column];
        int rowOneSum=0;
        int arrayAverage=0;
        //the position of the myArrayOneDimension
        int k=0;
        //The dimension of the myArrayOneDimension
        int newDimension = (row*column);
        int [] myArrayOneDimension = new int[newDimension];
        //Filling the array
        myArray[0][0]=10;
        myArray[0][1]=20;
        myArray[0][2]=30;
        myArray[0][3]=40;
        myArray[1][0]=12;
        myArray[1][1]=15;
        myArray[1][2]=18;
        myArray[1][3]=19;
        myArray[2][0]=10;
        myArray[2][1]=10;
        myArray[2][2]=10;
        myArray[2][3]=10;
        //Printing it
        System.out.println("Welcome to the Third Part!");
        System.out.println("The array elements are: ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++){
                System.out.print(myArray[i][j] + " ");
                if(i==0) {
                    rowOneSum+=myArray[i][j];
                }
                arrayAverage+=myArray[i][j];
                myArrayOneDimension[k]=myArray[i][j];
                k++;
            }
            System.out.println();
        }
        System.out.println("The summation of Row # 1 is : " + rowOneSum);
        System.out.println("The average for the entire array is : " + (arrayAverage/(row*column)));
        System.out.println("The converted array elements are: ");
        for(int i=0;i<newDimension;i++) {
            System.out.println(myArrayOneDimension[i]);
        }
    }
}
