//类的定义
class Person{
    //使用private封装属性
    private String name;
    private int age;

    public Person(){
        System.out.println("*********");
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        if(n <= 0){
            age = 0;
        }
        else{
            age = a;
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    //构造方法进行初始化赋值
    // public Person(String n, int i){
    //     name = n;
    //     age = i;
    // }



    //构造方法重载
    // public Person(){
    //     System.out.println("***********");
    // }    
    // public Person(String n){
    //     name = n;
    // }
    // public Person(String n, int i){
    //     name = n;
    //     age = i;
    // }


    // //构造方法
    // public Person(){
    //     System.out.println("**************");
    // }
    // //命名不规范的普通方法
    // public void Person(){
    //     System.out.println("==============");
    // }


    //定义方法
    // public void fun(){
    //     System.out.println(name+"在"+age+"岁学习");
    // }
    // public void work(){
    //     if(age < 22){
    //         System.out.println("还在上学");
    //     }
    //     else{
    //         System.out.println("应该工作了");
    //     }
    // }
}
//主方法
public class Day4{
    public static void main(String[] args){

        //封装后的进行属性访问
        Person per = new Person();
        per.setName("刘苗");
        per.setAge(20);
        System.out.println(per.getName());
        System.out.println(per.getAge());
        
        //根据Person类产生一个Person对象
        //Person per = new Person("刘苗",20);

        //匿名对象
        //new Person("刘苗",20).work();

        // per.name = "诗尧";
        // per.age = 20;
         //per.fun();
         //per.work();
    }
}