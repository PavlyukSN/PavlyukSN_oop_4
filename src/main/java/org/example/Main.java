package org.example;

//1)расширить класс калькулятор на умножение
//2)расширить класс калькулятор на деление
//3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт -
// тут необходимо подумать как наилучшим образом реализовать, что будет если будут приниматься округляемые
// Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        System.out.println(sum);
        intBox1.setObj("qwer");
        int sum2  = 0;
        if (intBox2.getObj() instanceof Integer && intBox1.getObj() instanceof Integer) {
            sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
        }
        System.out.println(sum2);
        GenBox<Integer> gen1 = new GenBox(10);
        GenBox<Integer> gen2 = new GenBox(20);
        int sum3= gen2.getObj()+gen1.getObj();
        System.out.println(sum3);

        Double[] array = {1.0, 2.0, 3.0, 4.0};
        BoxWithNumber <Double> nums = new BoxWithNumber<>(array);
        System.out.println("nums.average() = " + nums.average());
        Double[] array2 = {5.0,6.0,1.0};
        BoxWithNumber <Double> nums2 = new BoxWithNumber<>(array2);
        System.out.println("nums.compareAverage(nums2) = " + nums.compareAverage(nums2));
        Double average1 = nums.average();
        Double average2 = nums2.average();
        System.out.println("nums.compareAverage(average1, average2) = " + nums.compareAverage(average1, average2));
        Integer[] boxInt = {1,2,3,100};
        BoxWithNumber<Integer> nums3 = new BoxWithNumber<>(boxInt);
        System.out.println("nums3.average() = " + nums3.average());
        System.out.println("nums2.compareAverage(nums3) = " + nums2.compareAverage(nums3));


        List<Integer> array3 = new ArrayList<>(Arrays.asList(1, 56, 12, 86));
        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(array3) = " + calculator.sum(array3));
        List<Double> array4 = new ArrayList<>(Arrays.asList(4.7,4.1));
        System.out.println("calculator.sum(array4) = " + calculator.sum(array4));
        List<Double> array5 = new ArrayList<>(Arrays.asList(2.5, 2.2));
        System.out.println("calculator.multiplication(array5) = " + calculator.multiplication(array5));
        List<Double> array6 = new ArrayList<>(Arrays.asList(3.0,2.0));
        System.out.println("calculator.division(array6) = " + calculator.division(array6));
        List<String> array7 = new ArrayList<>(List.of("101"));
        System.out.println("calculator.binaryConversion(array7) = " + calculator.binaryToDecimalConversion(array7));
        List<Integer> array8 = new ArrayList<>(List.of(101));
        System.out.println("calculator.binaryConversion(array8) = " + calculator.binaryToDecimalConversion(array8));
        List<Integer> array9 = new ArrayList<>(List.of(5));
        System.out.println("calculator.decimalToBinaryConversion(array9) = " + calculator.decimalToBinaryConversion(array9));
        System.out.println("calculator.doubleDecimalToBinaryConversion(3.14, 5) = " + calculator.doubleDecimalToBinaryConversion(3.14, 5));

    }
}