/**
 * assignment
 */
import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        //checking the number whether it is +ve or -ve
        if( n > 0 ){
            System.out.println( n +" is a positive number.");
        }else if(n == 0){
            System.out.println( n + " is neither a negative number or a positive number." );
        }else{
            System.out.println(n +" is a negative number.");
        }
    }
}