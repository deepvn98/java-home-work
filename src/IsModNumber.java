import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class IsModNumber {
    public static void main(String[] args) {
        int number;
        Scanner getNumber = new Scanner(System.in);
        System.out.println(" mời bạn nhập số bạn muốn: ");
        number = getNumber.nextInt();
        if( number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz!");
        }else
            if( number % 3 == 0){
                System.out.println("Fizz!");
            }else
                if ( number % 5 == 0){
                    System.out.println("Buzz!");
                }
    }
}
