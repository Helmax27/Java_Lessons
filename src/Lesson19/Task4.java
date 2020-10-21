package Lesson19;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        Values[] value1 = {new Values(25), new Values(25.2), new Values("Value"),
                new Values(true)};

        ArrayList<Values> value = new ArrayList<>();
        for (Values vl : value) {
            value.add(vl);
        }

        ArrayList<Integer> intValue = new ArrayList<>();
        ArrayList<Double> floatsValue = new ArrayList<>();
        ArrayList<Boolean> boolValue = new ArrayList<>();
        ArrayList<String> stringValue = new ArrayList<>();

        for (Values vl : value) {
            Object o = vl.getValue();
            if (o instanceof Integer) {
                intValue.add((int) o);
            } else if (vl.getValue() instanceof Double) {
                floatsValue.add((double) vl.getValue());
            } else if (vl.getValue() instanceof Boolean) {
                boolValue.add((Boolean) vl.getValue());
            } else if (vl.getValue() instanceof String) {
                stringValue.add((String) vl.getValue());
            }
        }
        System.out.println(intValue.toString());
        System.out.println(stringValue.toString());
        System.out.println(boolValue.toString());
        System.out.println(floatsValue.toString());
    }

}

class Values<T> {
    private T value;

    public Values(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
