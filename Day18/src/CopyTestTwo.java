import java.io.*;

public class CopyTestTwo {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("非法操作，命令为java CopyFile 源文件路径，目标文件路径");
            return;
        }
        String sourcePath = args[0];
        String destPath = args[1];
        if (CopyFileUtil.fileIsExists(sourcePath)) {
            CopyFileUtil.createParentsDir(sourcePath);
            System.out.println(CopyFileUtil.copyFile(sourcePath, destPath)
                    ? "文件拷贝成功" : "文件拷贝失败");
        } else {
            System.out.println("源文件不存在，无法进行拷贝");
        }
    }
}

/**
 * 建立一个专门负责文件拷贝处理的类
 * 1.判断拷贝的源文件是否存在
 * 2.判断目标文件的父路径是否存在，如果不在则创建父目录
 * 3.进行文件拷贝的处理
 */
class CopyFileUtil {
    private CopyFileUtil() {}
    //判断源文件是否存在
    public static boolean fileIsExists(String path) {
        return new File(path).exists();
    }
    //判断要拷贝的父路径是否存在
    public static void createParentsDir(String path) {
        File file = new File(path);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
    }

    /**
     * 拷贝文件
     * @param sourcePath 源文件路径
     * @param destPath 目标文件路径
     * @return 是否拷贝成功
     */
    public static boolean copyFile(String sourcePath, String destPath) throws FileNotFoundException {
        File infile = new File(sourcePath);
        File outfile = new File(destPath);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(infile);
            fileOutputStream = new FileOutputStream(outfile);
            copyFileHandle(fileInputStream,fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * 实现具体的拷贝操作
     * @param inputStream 输入流对象
     * @param outputStream 输出流对象
     */
    private static void copyFileHandle(InputStream inputStream,
                                       OutputStream outputStream) throws IOException {
        long start = System.currentTimeMillis();
        //InputStream有输出单个字节的方法
        //OutputStream有输出单个字节的方法
        byte[] data = new byte[1024];
        int len = 0;
        //判断条件表示将数据读取到字节数组之中，而后返回读取个数
        while ((len = inputStream.read(data)) != -1) {
            outputStream.write(data,0,len); //将字节数组的部分内容写到目标文件中
        }
        long end = System.currentTimeMillis();
        System.out.println("系统运行时间为："+(end - start)+"毫秒");

    }
}

