package org.example;

import java.util.List;

public class Calculator {
    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    public double sum(List<? extends Number> array) {
        double result = 0.0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double multiplication(List<? extends Number> array) {
        double result = 1.0;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> array) {
        double result = (double) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result /= array.get(i).doubleValue();
        }
        return result;
    }

    public double binaryToDecimalConversion(List<?> array) {
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof String) {
                char[] chars = ((String) array.get(i)).toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    int binaryChar = Integer.parseInt(String.valueOf(chars[j]));
                    result += binaryChar * pow(2, chars.length - j - 1);
                }
            } else if (array.get(i) instanceof Integer) {
                Integer base = 1;
                Integer binaryNumber = (Integer) array.get(i);
                while (binaryNumber > 0) {
                    int lastDigit = binaryNumber % 10;
                    binaryNumber = binaryNumber / 10;
                    result += lastDigit * base;
                    base = base * 2;
                }

            }

        }
        return result;
    }

    public int decimalToBinaryConversion(List<?> array){
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < array.size(); i++) {
            int decimalNumber = (Integer) array.get(i);
            if (decimalNumber == 0) {
                return decimalNumber;
            }
            int quotient = decimalNumber;
            while (quotient > 0) {
                int remainder = quotient % 2;
                binaryNumber.append(remainder);
                quotient /= 2;
            }
            binaryNumber.reverse();
        }
        return Integer.parseInt(binaryNumber.toString());
    }
    public String doubleDecimalToBinaryConversion(double d, int precision){
        long wholePart = (long) d;
        return wholeToBinary(wholePart) + '.' + fractionalToBinary(d - wholePart, precision);
    }
    private String wholeToBinary(long l) {
        return Long.toBinaryString(l);
    }
    private String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }

}
