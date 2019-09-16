/**
 * 定义一个泛型接口
 * @param <T>
 */
//public interface IMessage<T> {
////    public void print(T t);
//}

@FunctionalInterface
public interface IMessage {
    public void print();
}