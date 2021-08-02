import java.util.Scanner;

public class Quadratic {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ax^2 + bx+ c = 0");
        System.out.println("Enter value of \"a\" : ");
        int a = scanner.nextInt();
        System.out.println("Enter value of \"b\" : ");
        int b = scanner.nextInt();
        System.out.println("Enter value of \"c\" : ");
        int c = scanner.nextInt();
        float delta = (b*b)-(4*a*c);
        double Root1 = ((-b)+(Math.sqrt(delta)))/(2*a);
        double Root2 = ((-b)-(Math.sqrt(delta)))/(2*a);
        System.out.println("\n Root 1 : " + Root1);
        System.out.println("\n Root 2 : " + Root2);
    }
}
