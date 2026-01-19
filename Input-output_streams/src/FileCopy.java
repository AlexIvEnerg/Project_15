import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        try(FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
        FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt");
            FileOutputStream file = new FileOutputStream("src\\io\\file.txt", true)) {
            int a;
            String text = "Проверка";
            byte[] scope = text.getBytes();
            file.write(scope);
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }  catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
