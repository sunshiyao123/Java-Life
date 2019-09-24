import java.io.*;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:"+File.separator+"Users"+File.separator
                +"孙诗尧"+File.separator+"Desktop"+File.separator+"Writer.txt");
        if (file.exists()) {
            Reader in = new FileReader(file);
            char[] data = new char[1024];
            int len = in.read(data);
            String result = new String(data, 0, len);
            System.out.println(result);
            in.close();

        }
    }
}
