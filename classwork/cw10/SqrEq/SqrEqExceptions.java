package cw10.SqrEq;

class SqrEqException extends ArithmeticException {
    private String detail;

    SqrEqException(String message) {
        detail = message;
    }

    @Override
    public String toString() {
        return detail;
    }
}


class DiscriminantEqException extends ArithmeticException {
    // private String detail;
    private double a, b, c, d;

    DiscriminantEqException(String message, double a, double b, double c, double d) {
        // detail = message;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Discriminant is " + d + " for a, b, c: " + a + ", " + b + ", " + c;
    }
}
