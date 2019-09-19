import java.io.*;

public class MemoryTeat {
    public static void main(String[] args) throws IOException {
        String msg = "hello world";
        InputStream input = new ByteArrayInputStream(msg.getBytes());
        OutputStream output = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = input.read()) != -1) {
            output.write(Character.toUpperCase(temp));
        }
        System.out.println(output);
        input.close();
        output.close();
    }
}
