package OOP;

public class Super {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        System.out.println("----------------");
        B b = new B();
        b.show();


        //数据
        byte b1=1, b2=2, b3, b6, b8;
        final byte b4=4, b5=6, b7=9;
//            b3 = (b1 + b2);
//            b6 = (b4 + b5);
//            b8 = (b1 + b4);
//            b7 = (b2 + b5);
    }
}
class A {
    int a = 1;
    double d = 2.0;
    void show(){
        System.out.println("Class A : a="+a+"\td="+d);
    }
}
class B extends A{
    float a = 14f;
    String d = "java-java";
    void show(){
        super.show();
        System.out.println("Class B : a="+a+"\td="+d);
    }
}
