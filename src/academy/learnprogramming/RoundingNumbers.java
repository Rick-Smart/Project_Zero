package academy.learnprogramming;

import java.math.BigDecimal;

public class RoundingNumbers {
    int decimalPlaces = 2;
    double number;

    public BigDecimal getNumber(double num) {
        BigDecimal bigDecimal = new BigDecimal(num);
        BigDecimal roundedNumber = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);

        return roundedNumber;
    }
}
