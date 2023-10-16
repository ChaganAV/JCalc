public class Pair <T,V>{
    private T first;
    private V second;
    public Pair(T value1, V value2){
        this.first = value1;
        this.second = value2;
    }

    @Override
    public String toString() {
        return String.format("%s, fields: first type = %s, value = %s; second type = %s, value = %s",
                getClass().getName(),getFirst().getClass(), getFirst(), getSecond().getClass(), getSecond());
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}
