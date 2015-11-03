package ee.tty.praktikum2;

public class Calc {

    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    public static final int SPECIALIST = 3;

    public static void main(final String[] args) {
        System.err.println(Calc.pay(JUNIOR, 3) + " should be 30");
        System.err.println(Calc.pay(JUNIOR, 10) + " should be 120");
        System.err.println(Calc.pay(SENIOR, 3) + " should be 45");
        System.err.println(Calc.pay(SENIOR, 10) + " should be 180");
        System.err.println(Calc.pay(SPECIALIST, 3) + " should be 66");
        System.err.println(Calc.pay(SPECIALIST, 11) + " should be 330");
    }

    protected static int pay(final int type,final int h) {
        int Sum = 0;
        if (type == JUNIOR) {
            if (h > 8) {
                Sum = 10 * (h - 8) * 2;
                Sum += 10 * 8;
            } else if (h > 20) {
            	Sum += 10;
            } else {
                Sum += 10 * h;
            }
        }
        if (type == SENIOR) {
            if (h > 8) {
                Sum = 15 * (h - 8) * 2;
                Sum += 15 * 8;
            } else if(h > 20) {
            	Sum += 20;
            } else {
                Sum += 15 * h;
            }
        }
        if (type == SPECIALIST) {
            if (h > 9) {
                Sum = 22 * (h - 9) * 3;
                Sum += 22 * 9;
            } else if(h > 20) {
            	Sum += 30;
            } else {
                Sum += 22 * h;
            }
        }
        return Sum;
    }
}