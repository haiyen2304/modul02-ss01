import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hãy nhập vào 1 số");
        double number = scanner.nextDouble();
        double binhphuong=number*number;
        double lapphuong=number*number*number;
        System.out.println("bình phương = "+binhphuong);
        System.out.println("lập phương = "+lapphuong);
    }
}
