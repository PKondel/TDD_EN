public class Calculator {

    public int add(int a, int b){
        System.out.println("Somethhing");
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(double a, double b){
        if (b == 0.0){
            throw new IllegalArgumentException(
                    String.format("Divider equals:%5.3f, but have " +
                            "to not equals 0", b));
        }
        return a/b;
    }

    public double inverse(double a){
        if (a == 0.0){
            throw new IllegalArgumentException(
                    String.format("Number equals:%5.3f, " +
                            "but mustn't equals 0", a));
        }
        return 1.0/a;
    }

    public double power(double a, double b){
        return Math.pow(a, b);
    }
}
