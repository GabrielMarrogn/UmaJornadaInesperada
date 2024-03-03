import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt() + 2;
        double b = sc.nextInt();

        double d = b/a;

        System.out.printf("%.2f\n",+d);
        sc.close();
    }
}
