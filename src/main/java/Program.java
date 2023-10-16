import java.util.Arrays;
import java.util.concurrent.Callable;

public class Program {
    public static void main(String[] args) {
        //Calculation calc = new Calculation();
        int value1 = 3;
        double value2 = 3.4;
        Calculation.sum(value1,value2);
        Calculation.multiply(value1,value2);
        Calculation.divide(value1,value2);
        Calculation.subtract(value1,value2);
        // compareArray
        Integer[] numbs = new Integer[] {1,3,4,5};
        Integer[] numbs2 = new Integer[] {2,3,4,5};
        String[] arrayString1 = new String[] {"Вася","рулит","бублик"};

        Calculation calc = new Calculation();

        System.out.println(calc.compareArrays(numbs,numbs));
        System.out.println(calc.compareArrays(numbs,numbs2));
        System.out.println(calc.compareArrays(arrayString1,arrayString1));
        // Pair
        Pair p1 = new Pair(1,"первый");
        Pair p2 = new Pair("Второй", p1);
        System.out.println(p1);
        System.out.println(p2);
    }
}
