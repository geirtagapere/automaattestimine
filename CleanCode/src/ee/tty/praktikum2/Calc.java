package ee.tty.praktikum2;

public class Calc {

    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    public static final int SPECIALIST = 3;
    
    public static void main(final String[] args) {
 
    }

    protected static int payJunior(final int type,final int h) {
        int Sum = 0;
        if (type == JUNIOR) {
            if (h > 8) {
                Sum = 10 * (h - 8) * 2;
                Sum += 10 * 8;
                if (h > 20) {
                	Sum += 10;
                }
            } else {
                Sum += 10 * h;
            }
        }
        return Sum;
    } 
    
    protected static int paySenior(final int type,final int h) {
    	int Sum = 0;
    	if (type == SENIOR) {
            if (h > 8) {
                Sum = 15 * (h - 8) * 2;
                Sum += 15 * 8;
                if (h > 20) {
                	Sum += 20;
                }           
            } else {
                Sum += 15 * h;
            }
        }
    	return Sum;
    }
    	
    protected static int paySpecialist(final int type,final int h) {
    	int Sum = 0;
    	if (type == SPECIALIST) {
            if (h > 9) {
                Sum = 22 * (h - 9) * 3;
                Sum += 22 * 9;
                if (h > 20) {
                	Sum += 30;
                }
            } else {
                Sum += 22 * h;
            }
        }
        return Sum;
    }
}