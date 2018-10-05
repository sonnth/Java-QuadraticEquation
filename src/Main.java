import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert value for a: ");
        a = scanner.nextDouble();
        System.out.println("Insert value for b: ");
        b = scanner.nextDouble();
        System.out.println("Insert value for c: ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("X1= " + quadraticEquation.getRoot1() + " X2= " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("X= " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
