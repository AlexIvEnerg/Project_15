import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        File file = new File("D:\\Обучение Java\\IdeaProjects\\Project_15\\Input-output_streams" +
                "\\src\\io\\a_file.txt");

        try(OutputStream output = new FileOutputStream(file, true);
            InputStream input = new FileInputStream(file)) {
            char[] symbols = {'a','b','c'};
            int i;
            for (char symb : symbols) {
                i = symb;
                output.write(i);
            }
            int size = input.available();
            for (int e=0; e<size; e++) {
                System.out.print((char) input.read() + " ");
            }
        }  catch (IOException ex) {
            System.out.println("Exception");
        }
    }
}