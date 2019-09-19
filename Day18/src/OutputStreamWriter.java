import java.io.*;

public class OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("C:"+File.separator+"Users"+File.separator
                +"孙诗尧"+File.separator+"Desktop"+File.separator+"Writer.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        //字节流
        OutputStream output = new FileOutputStream(file);
        //字节转换为字符流
        Writer out = new java.io.OutputStreamWriter(output);
        String msg = "诗尧喜欢刘苗";
        out.write(msg);
        out.close();
    }
}
