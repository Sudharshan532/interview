package com.java.generic;

public class GenericExample<T> {

    private Object[] data = new Object[3];

    public void setData(int index, T value) {
        data[index] = value;
    }

    @SuppressWarnings("unchecked")
	public T getData(int index) {
        return (T) data[index];
    }

    public static void main(String[] args) {

        GenericExample<String> ge = new GenericExample<>();

        ge.setData(0, new String("Hello World"));
        ge.setData(1, new String("This is an example of generics"));
        ge.setData(2, new String("Enjoy.........."));

        String str1 = ge.getData(0);
        String str2 = ge.getData(1);
        String str3 = ge.getData(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
