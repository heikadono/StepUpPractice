package study.stepup.online.calculations;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    List <String> numbers = new ArrayList<>();
    public double sum;

    public Sum (List <String> numbers) {
        this.numbers = numbers;
        setSum(numbers);
    }

    public void setSum(List <String> numbers) throws NumberFormatException {
        for (String s : numbers){
            try {
                sum=sum+Double.parseDouble(s);
            } catch (NumberFormatException ex){
                sum = sum +0;
            }

    }
        System.out.println("Результат :" + sum);
    }
}
