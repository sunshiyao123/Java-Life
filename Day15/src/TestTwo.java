import java.lang.reflect.Field;

public class TestTwo {
    public static void main(String[] args) {

//        MyClass<String,Integer> myClass1 = new MyClass<>();
//        Class class = myClass1.getClass();
//        Field[] fields = class.getDeclaredFields();
//        for (Field field:fields) {
//            System.out.println(field);
//        }
    }
}
class MyClass<T,E>{
    private T message;
    private E text;
    public E getText() {
        return text;
    }
    public void setText(E text) {
        this.text = text;
    }
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
}