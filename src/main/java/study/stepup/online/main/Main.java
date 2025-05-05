package study.stepup.online.main;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import study.stepup.online.calculations.Fraction;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        //8.15 Возведение в степень
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        String num = in.next();
        System.out.println("Введите степень числа: ");
        String exp = in.next();
        System.out.println("Число " + num + " в степени " + exp + " равно " + exponentation(num, exp));


      /*  Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(49, 12);
        Fraction fraction3 = new Fraction(3, 2);
        Fraction fraction4 = new Fraction(1, 3);

        List<Double> numbers1 = new ArrayList<>(Arrays.asList((double) 2, fraction1.doubleValue(), 2.3));
        List<Double> numbers2 = new ArrayList<>(Arrays.asList(3.6, fraction2.doubleValue(), (double) 3, fraction3.doubleValue()));
        List<Double> numbers3 = new ArrayList<>(Arrays.asList(fraction4.doubleValue(), (double)1));

        System.out.println(sumAll(numbers1));
        System.out.println(sumAll(numbers2));
        System.out.println(sumAll(numbers3)); */
    }

   /* public static double sumAll (List<Double> numbers) {
        double sum =0;
        for (int i=0; i<numbers.size(); i++){
            System.out.println(sum);
            sum+=numbers.get(i);
        }
        return sum;
    }*/

    public static int exponentation(String num, String exp){
        return (int) pow(parseInt(num), parseInt(exp));
    }

}
