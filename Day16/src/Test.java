import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        String value = "Emp.name:刘苗|Emp.job:学生";
        EmpAction empAction = new EmpAction();
        empAction.setValue(value);
        System.out.println(empAction.getEmp());
    }

}

class Emp {
    public  String name;
    public String job;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

