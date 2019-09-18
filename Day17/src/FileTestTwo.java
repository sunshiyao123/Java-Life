import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//public class FileTestTwo {
//    public static void main(String[] args) throws Exception {
//        File file = new File("C:"+File.separator+"Users"
//                +File.separator+"孙诗尧"+File.separator+"Desktop");
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();
//        }
//        try (OutputStream outputStream =
//                     new FileOutputStream(file,true)){
//            String msg = "诗尧喜欢刘苗";
//            outputStream.write(msg.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
////        Message message = new Message();
////        message.print();
////        message.close();
//
//    }
//}
//class Message implements AutoCloseable {
//
//    public Message() {
//        System.out.println("创建一个新的信息");
//    }
//    @Override
//    public void close() throws Exception {
//        System.out.println("AutoCloseable自动关闭方法");
//    }
//    public void print() {
//        System.out.println("www.bit.java");
//    }
//}
