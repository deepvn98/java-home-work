import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner getnumber = new Scanner(System.in);
        System.out.println(" Mời bạn nhập số muốn kiểm tra: ");
        int number = getnumber.nextInt();
        boolean count = true;
        if ( number < 2 ){
            count = false;
        }
        for ( int i = 2; i <= Math.sqrt(number); i++){
            if ( number % i == 0 ){
                count = false;
            }
        }
        if (count){
            System.out.println(number+" là số nguyên tố");

        }else {
            System.out.println(number+" không phải số nguyên tố");
        }
    }
}
