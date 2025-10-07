import java.util.ArrayList;
import java.util.List;

// Generic Entry class
class Entry<T> {
    private String typeName;
    private T value;

    public Entry(String typeName, T value) {
        this.typeName = typeName;
        this.value = value;
    }

    public void print() {
        System.out.println("Entry: " + typeName + ": " + value);
    }
}

public class Generics {
    public static void main(String[] args) {
        List<Entry<?>> entries = new ArrayList<>();

        entries.add(new Entry<Integer>("integer", 10));
        entries.add(new Entry<Double>("double", 3.14));
        entries.add(new Entry<Boolean>("boolean", true));
        entries.add(new Entry<String>("String", "Hello Generics"));
        entries.add(new Entry<Character>("char", 'A'));

        for (Entry<?> entry : entries) {
            entry.print();
        }
    }
}