
    // Write a program to find the sum of 5 integers.

import java.util.*;
/**
 * Assignment_ day 4
 */
public class Assignment_Day4 {
    
    public static void main(String[] args) {
        //let the 5 integers be 5,4,1,5,5 their sum will be 20;
        int sum = 0;
        int n;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five integer : ");
        while(i < 5){
            i=i+1;
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("The sum is : "+ sum);
        }
    }

    


    

    



