package com.java.example;

import java.util.Arrays;

import org.testng.annotations.Test;

public class PairsOfElementsInArray {

	@Test
	public void method1() {
		findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);
		 findThePairs1(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
	}

	public void findThePairs(int inputArray[], int inputNumber) {
		// Sorting the given array

		Arrays.sort(inputArray);

		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

		// Initializing i to first index

		int i = 0;

		// Initializing j to last index

		int j = inputArray.length - 1;

		// Till i crosses j, perform the following task

		while (i < j) {
			// If inputArray[i]+inputArray[j] is equal to inputNumber

			if (inputArray[i] + inputArray[j] == inputNumber) {
				// then Print inputArray[i] and inputArray[j]

				System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);

				// Increment i

				i++;

				// Decrement j

				j--;
			}

			// If inputArray[i]+inputArray[j] is smaller than inputNumber

			else if (inputArray[i] + inputArray[j] < inputNumber) {
				// then increment i

				i++;
			}

			// If inputArray[i]+inputArray[j] is greater than inputNumber

			else if (inputArray[i] + inputArray[j] > inputNumber) {
				// then decrement j

				j--;
			}
		}
	}
	
	static void findThePairs1(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
 
        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
    }

}
