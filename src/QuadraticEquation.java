public class QuadraticEquation {
    private double a,b, c;
    private double r1,r2,delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b - 4 * a * c);
    }
    public double  getRoot1() {
        return ((-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a));
    }

    public double getRoot2() {
        return  ((-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a));

    }
}
