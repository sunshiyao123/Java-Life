import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        //创建新文件
////        File file = new File("C:\\Users\\孙诗尧\\Desktop\\IOTest.txt");
////        file.createNewFile();
////        //判断文件是否存在
////        System.out.println(file.exists());
////        //删除文件
////        file.delete();
////        System.out.println(file.exists());

        //使用文件分隔符
//        File file = new File("C:"+File.separator+"Users"+File.separator
//                +"孙诗尧"+File.separator+"Desktop"+File.separator+"File.txt");
//        if (file.exists()) {
//            file.delete();
//        } else {
//            file.createNewFile();
//        }


//        //创建父目录
//        File file = new File("C:"+File.separator+"Users"+File.separator
//                +"孙诗尧"+File.separator+"Desktop"+File.separator+"SsyAndLm"+File.separator+"File.txt");
//        //创建父目录，有多少级父目录就创建多少级
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdir();
//        }
//        if (file.exists()) {
//            //文件存在，删除
//            file.delete();
//        } else {
//            file.createNewFile();
//        }

//        File file1 = new File("C:"+File.separator+"Users"+File.separator
//                +"孙诗尧"+File.separator+"Desktop"+File.separator+"File.txt");
//        if (file.exists() && file.isFile()) {
//            System.out.println("文件大小："+file1.length()/1024+"KB");
//            System.out.println("最后一次修改日期："+file1.lastModified());
//        }

        //列出目录的子目录
//        long start = System.currentTimeMillis();
//        File file = new File("C:"+File.separator+"Users"+File.separator +
//                                "孙诗尧"+File.separator+"Desktop");
//        if (file.exists() && file.isDirectory()) {
//            File[] result = file.listFiles();
//            for (File file1 : result) {
//                System.out.println(file1);
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("运行时间为："+(end - start)+"毫秒");

        //目录列表（综合案例）
//        long start = System.currentTimeMillis();
//        File file = new File("C:"+File.separator+"Users"
//                +File.separator+"孙诗尧"+File.separator+"Desktop");
//        listAllFiles(file);
//        long end = System.currentTimeMillis();
//        System.out.println("运行时间为"+(end - start)+"毫秒");


//        File file = new File("C:"+File.separator+"Users"
//                +File.separator+"孙诗尧"+File.separator+"Desktop"
//                +File.separator+"hello.txt");
//        //必须保证父目录存在，创建多级父目录
//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();
//        }
//        //OutputStream是一个抽象类，所以需要通过子类进行实例化，此时
//        //只能操作File类,当我在后面再传入一个true参数则进行的是文件内容的追加
//        OutputStream output = new FileOutputStream(file,true);
//        //要求输出到文件的内容
//        String msg = "刘苗喜欢诗尧";
//        //将内容变为字节数组
//        output.write(msg.getBytes(),1,2);
//        //关闭流
//        output.close();
    }

//    public static void listAllFiles(File file) {
//        if (file.isDirectory()) {
//            File[] result = file.listFiles();
//            if (result != null) {
//                for (File file2 : result) {
//                    listAllFiles(file2);
//                }
//            }
//        } else {
//            System.out.println(file);
//        }
//    }
}
