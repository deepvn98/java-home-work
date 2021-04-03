import java.util.Scanner;

public class IsTriangle {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner number = new Scanner(System.in);
        System.out.println("mời bạn nhập cạnh thứ nhất: ");
        a = number.nextDouble();
        System.out.println("mời bạn nhập vào cạnh thứ 2: ");
        b = number.nextDouble();
        System.out.println("mời bạn nhập vào cạnh thứ 3: ");
        c = number.nextDouble();
        double x = Math.pow(a,2) +Math.pow(b,2);
        double y = Math.pow(a,2) +Math.pow(c,2);
        double z = Math.pow(b,2) +Math.pow(c,2);
        if (x == Math.pow(c,2)){
            System.out.println(" các số bạn nhập là của tam giác vuông");
        }else
            if (y == Math.pow(b,2)){
                System.out.println(" các số bạn nhập là của tam giác vuông");
            }else
                if (z == Math.pow(a,2)){
                    System.out.println(" các số bạn nhập là của tam giác vuông");
                }else {
                    System.out.println(" các số bạn nhập không phải là của tam giác vuông");
                }
    }
}
