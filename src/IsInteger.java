import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println(" mời bạn nhập số: ");
        int number = getNumber.nextInt();
        if ( number >= 0 ){
            System.out.println("số bạn nhập là số nguyên dương!");
        }else {
            System.out.println(" số bạn nhập là số nguyên âm!");
        }
    }
}
