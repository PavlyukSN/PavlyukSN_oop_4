package org.example;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class BoxWithNumber <T extends Number> {


    private T[] array;

    public BoxWithNumber(T[] element) {
        this.array = element;
    }

    public Double average() {
        Double res = 0.0;
        for (int i = 0; i < array.length; i++) {
            res += array[i].doubleValue();
        }
        res = res / array.length;
        return res;
    }

    public boolean compareAverage(BoxWithNumber box2) {
        return average() > box2.average();
    }
    public boolean compareAverage(Double average1, Double average2) {
        return average1>average2;
    }

}
//1-30