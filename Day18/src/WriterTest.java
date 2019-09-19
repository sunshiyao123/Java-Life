import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:"+File.separator+"Users"+File.separator
                +"孙诗尧"+File.separator+"Desktop"+File.separator+"Writer.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        String msg = "诗尧喜欢刘苗";
        Writer writer = new FileWriter(file);
        writer.write(msg);
        //当流如果没有关闭，数据就会存放在缓冲区，不会在文件里展现
//        writer.close();
        //表示强制清空缓冲内容，所有内容都输出
        writer.flush();

    }
}
