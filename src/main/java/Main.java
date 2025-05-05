import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //8.6 Сложение
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(49, 12);
        Fraction fraction3 = new Fraction(3, 2);
        Fraction fraction4 = new Fraction(1, 3);

        List<Number> numbers1 = new ArrayList<>(Arrays.asList(1, fraction1.doubleValue(), 2.3));
        List<Number> numbers2 = new ArrayList<>(Arrays.asList(3.6, fraction2.doubleValue(), 3, fraction3.doubleValue()));
        List<Number> numbers3 = new ArrayList<>(Arrays.asList(fraction4.doubleValue(), 1));

        System.out.println(sumAll(numbers1));
        System.out.println(sumAll(numbers2));
        System.out.println(sumAll(numbers3));
    }

    public static double sumAll (List<Number> numbers) {
        double sum =0;
        for (int i=0; i<numbers.size(); i++){
            System.out.println(sum);
            double x = (double) numbers.get(i);
            sum+= x;
        }
        return sum;
    }
}
