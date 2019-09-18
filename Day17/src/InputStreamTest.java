import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamTest {
    public static void main(String[] args) throws Exception {
        File file = new File("C:"+File.separator+
                "Users"+File.separator+"孙诗尧"+File.separator+"Desktop"+File.separator+"File.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.exists()) {
            InputStream input = new FileInputStream(file);
            byte[] data = new byte[1024]; //没可以读取的最大数量
            int len = input.read(data); //返回文件内容长度
            //当文件无内容时返回-1
            if (len > 0) {
                String result = new String(data,0,len);
                System.out.println("读取内容："+result);
            } else {
                System.out.println("文件无内容");
            }
            input.close();
        }

    }
}
