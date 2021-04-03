import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double delta;
        Scanner getNumber = new Scanner(System.in);
        System.out.print(" nhập số a: ");
        a = getNumber.nextInt();
        System.out.print(" nhập số b: ");
        b = getNumber.nextInt();
        System.out.print(" nhập số c: ");
        c = getNumber.nextInt();
        delta = b*b - 4*a*c;
        double x1 = 0;
        double x2 = 0;
        if( a == 0 ){
            if (b == 0){
                System.out.println(" phương trình bạn nhập vô nghiệm");
            }else {
                System.out.println("phương trình có một nghiêm x = "+ (-c/b) );

            }return;
        }

        if (delta < 0 ){
            System.out.println(" Phương trình vô nghiệm");
        }else
            if ( delta == 0){
                x1 = -b / ( 2 * a);
                System.out.println("phương trình có nghiệm kép x1 = x2 là: "+ x1);
            }else{
                x1 = ( -b - Math.sqrt(delta))/(2*a);
                x2 = ( -b + Math.sqrt(delta))/(2*a);
                System.out.println("phương trình có hai nghiệm phân biệt: x1 = "+x1+ " và x2 = "+ x2 );
            }

    }
}
