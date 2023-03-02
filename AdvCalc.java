import tools.Calc;

public class AdvCalc extends Calc {
    public long mul(int n1, int n2) {
        return n1 * n2;
    }
    public double div(int n1, int n2) {
        return n1 / n2;
    }
    public int add(int n1, int n2) { // Method overriding
        return n1 + n2 + 1;
    }
}