package cw10.SqrEq;

public class SqrEq {
    private double a, b, c, x1, x2;

    SqrEq() {}

    SqrEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double discriminant() throws DiscriminantEqException {
        double d = b*b - 4*a*b;

        if (d < 0) {
            throw new DiscriminantEqException("Oi!", a, b, c, d);
        }
        return d;
    }

    public void solution() throws DiscriminantEqException, SqrEqException {
        try {
            if (a == 0) throw new SqrEqException("Main member is 0.");

            double d = discriminant();
            double x1 = (-b - Math.sqrt(d))/(2*a);
            double x2 = (-b + Math.sqrt(d))/(2*a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            this.x1 = x1;
            this.x2 = x2;

        } catch (SqrEqException e) {
            System.out.println(e);
            throw new SqrEqException("Division by 0.");
        } catch (DiscriminantEqException e) {
            throw e;
        }
        // catch (ArithmeticException e) {
        //     throw e;
        // }
    }

    public void printRoots() {
        System.out.println("Roots: x1 = " + x1 + ", x2 = " + x2);
    }
}