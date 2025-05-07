package study.stepup.online.calculations;

import java.util.List;

public class Sum {


    public Sum(List<String> numbers) {
        setSum(numbers);
    }

    private void setSum(List<String> numbers) {
        double sum = 0;
        for (String s : numbers) {
            sum += getDouble(s);
        }
        System.out.println("Результат :" + sum);
    }

    private double getDouble(String s) {
        double d = 0;
        if (s.matches("\\d+")) {
            d = Double.parseDouble(s);
        }
        return d;
    }
}
