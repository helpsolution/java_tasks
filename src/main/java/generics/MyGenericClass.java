package generics;

public class MyGenericClass<T> {

    private T value;

    public MyGenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    public static void main(String[] args) {
        MyGenericClass<Integer> myGenericClass = new MyGenericClass<>(123);
        System.out.println(myGenericClass.getValue());

        MyGenericClass<String> myGenericClassStr = new MyGenericClass<>("String");
        System.out.println(myGenericClassStr.getValue());

        MyGenericClass<?> re =  new MyGenericClass<>(123);
        System.out.println(re.getValue());
    }
}

