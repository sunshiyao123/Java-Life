import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 本类主要负责实现自动的VO匹配处理操作
 */
public class BeanOperation {
    BeanOperation(){}

    /**
     *
     * @param actionObject 表示当前发出设置请求的程序类的当前对象
     * @param msg 属性的具体内容，格式：属性名称：内容|属性名称：内容

     */
    public static void setBeanValue(Object actionObject, String msg) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException {
        //输入内容 Person.name:|刘苗
        //把输入内容按照|分开
        String [] results = msg.split("\\|");
        for (int i = 0; i < results.length; i++) {
            //再把每个内容按照:分开
            String[] temp = results[i].split(":");
            //属性名称
            String attribute = temp[0];
            //属性内容
            String value = temp[1];
            //再把名称按照 . 分开
            String[] fields = attribute.split("\\.");
            //获取当前操作的简单Java类对象
            Object currentObject = getObject(actionObject, fields[1]);
            //调用简单Java类的setter方法
            setObject(currentObject, fields[1], value);
        }
    }

    /**
     * 将传进的字符串首字母大写
     * @param str 传进的字符串
     * @return 返回大写后的字符串
     */
    public static String initCap(String str) {
        return str.substring(0,1).toUpperCase()
                + str.substring(1);
    }

    /**
     * 调用XXXAction类中的getter方法取得简单的Java对象
     * @param obj 表示调用方法的所在类对象
     * @param attribute 表示属性名称
     * @return 调用对象结果
     */
    public static Object getObject(Object obj, String attribute) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //确定get方法的方法名称
        String methodName = "get"+initCap(attribute);
        //调用制定属性的Field对象，目的是取得对象类型，如果没有此属性意味着操作无法进行
        Field field = obj.getClass().getDeclaredField(attribute);
        if (field == null){
            //第二次尝试从类中取得该属性
            field = obj.getClass().getField(attribute);
        }
        if (field == null) {
            //两次都未取得指定属性的对象，表示该对象一定不存在
            return null;
        }
        //取得get方法并且使用
        Method method = obj.getClass().getMethod(methodName);
        return method.invoke(obj);
    }

    /**
     * 根据指定的类对象设置类中的属性，调用setter方法
     * @param obj 属性所在类的实例化对象
     * @param attribute 属性名称
     * @param value 设置的内容
     */
    public static void setObject(Object obj, String attribute, String value) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //判断属性是否存在
        Field field = obj.getClass().getDeclaredField(attribute);
        if (field == null) {
            field = obj.getClass().getField(attribute);
        }
        if (field == null) {
            //两次都未取得制定属性的对象，表示该对象一定不存在
            return;
        }
        //真实方法名
        String methodName = "set" + initCap(attribute);
        //取得set方法并使用
        Method setMethod = obj.getClass().getMethod(methodName,field.getType());
        setMethod.invoke(obj,value);
    }
}

