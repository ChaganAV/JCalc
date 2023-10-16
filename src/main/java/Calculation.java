import java.util.ArrayList;

public class Calculation{
    public static <T extends Number> void sum(T value1, T value2){
        double val1 = 0;
        double val2 = 0;
        if(value1 instanceof Integer){
            val1 = (Integer) value1;
        }
        if(value1 instanceof Double){
            val1 = (Double) value1;
        }
        if(value1 instanceof Float){
            val1 = (Float) value1;
        }
        if(value2 instanceof Integer){
            val2 = (Integer) value2;
        }
        if(value2 instanceof Double){
            val2 = (Double) value2;
        }
        if(value2 instanceof Float){
            val2 = (Float) value2;
        }
        System.out.println(val1 + val2);
    }
    public static <T extends Number> void multiply(T value1, T value2){
        double val1 = 0;
        double val2 = 0;
        if(value1 instanceof Integer){
            val1 = (int) value1;
        }
        if(value1 instanceof Double){
            val1 = (double) value1;
        }
        if(value2 instanceof Integer){
            val2 = (int) value2;
        }
        if(value2 instanceof Double){
            val2 = (double) value2;
        }
        System.out.println(val1 * val2);
    }
    public static <T extends Number> void divide(T value1, T value2){
        double val1 = 0;
        double val2 = 0;
        if(value1 instanceof Integer){
            val1 = (int) value1;
        }
        if(value1 instanceof Double){
            val1 = (double) value1;
        }
        if(value2 instanceof Integer){
            val2 = (int) value2;
        }
        if(value2 instanceof Double){
            val2 = (double) value2;
        }
        if(val2 != 0)
            System.out.println(val1 / val2);
        else{
            System.out.println("Делить на 0 нельзя!");
        }
    }
    public static <T extends Number> void subtract(T value1, T value2){
        double val1 = 0;
        double val2 = 0;
        if(value1 instanceof Integer){
            val1 = (int) value1;
        }
        if(value1 instanceof Double){
            val1 = (double) value1;
        }
        if(value2 instanceof Integer){
            val2 = (int) value2;
        }
        if(value2 instanceof Double){
            val2 = (double) value2;
        }
        System.out.println(val1 - val2);
    }
    public <T extends Comparable<T>,V extends T> boolean compareArrays(V[] array1, V[] array2){
        if(array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) return false;
        }
        return true;
    }
}
