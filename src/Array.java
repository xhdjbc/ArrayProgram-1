/**
 *
 * Name: Zichao Liu
 * Teacher: Mr.Hardman
 * Assignment 5, Program 1
 * Date Last Modified: 11/30/2016
 *
 */

import java.util.Scanner;

/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner userInput = new Scanner(System.in);
		
		int[] arrayToSearch = {12, -3, 67, 78, 88, 520, 13, 564, 7, 6};
		int indexOfSearch = -1;
		int minimum;
		int userValue;
		
		System.out.print("The Array:");
		
		//Code to display all values
		for(int i = 0; i < arrayToSearch.length; i++){
			System.out.print(arrayToSearch[i] + "  ");
		}
		System.out.println();
		System.out.println("\nWhat value do you want the index of?");
		userValue = userInput.nextInt();
		
		for(int i = 0; i < arrayToSearch.length; i++){
			if(arrayToSearch[i]==userValue  ){
				indexOfSearch = i;
				System.out.println(" ");
			}
		}
			if(indexOfSearch == -1){
				System.out.println("This is not in the array!");
			} else{
				System.out.println(userValue + " is at index " + indexOfSearch);
				}
			
			minimum = arrayToSearch[0];
		
		for(int i = 0; i < arrayToSearch.length; i++){
			if(arrayToSearch[i] < minimum){
				minimum = arrayToSearch[i];
				System.out.println("");
			}
		}
		System.out.println("The minimum value is:" + minimum);
			
		userInput.close();
	}
}


