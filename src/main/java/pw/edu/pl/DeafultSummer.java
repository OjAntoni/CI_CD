package pw.edu.pl;

public class DeafultSummer implements Summer {
    @Override
    public double sum(double a, double b) {
        return a+b;
    }
}
