import java.util.ArrayList;

public class Calculation{
    public static <T extends Number> double sum(T value1, T value2){
        double val1 = value1.doubleValue();
        double val2 = value2.doubleValue();
        return val1+val2;
    }
    public static <T extends Number> double multiply(T value1, T value2){
        double val1 = value1.doubleValue();
        double val2 = value2.doubleValue();
        return val1 * val2;
    }
    public static <T extends Number> double divide(T value1, T value2){
        double val1 = value1.doubleValue();
        double val2 = value2.doubleValue();
        if(val2 != 0)
            return val1 / val2;
        else{
            System.out.println("Делить на 0 нельзя!");
            return 0;
        }
    }
    public static <T extends Number> double subtract(T value1, T value2){
        double val1 = value1.doubleValue();
        double val2 = value2.doubleValue();
        return val1 - val2;
    }
    public <T extends Comparable<T>,V extends T> boolean compareArrays(V[] array1, V[] array2){
        if(array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) return false;
        }
        return true;
    }
}
