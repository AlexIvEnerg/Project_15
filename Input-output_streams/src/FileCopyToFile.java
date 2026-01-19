import java.io.*;

public class FileCopyToFile {
    public static void main(String[] args)  {
        try(BufferedReader br = new BufferedReader(new FileReader("src\\io\\file.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\io\\copied_file.txt"))) {
            String s;
            while ((s= br.readLine())!= null){
                System.out.println(s);
                bw.write(s);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
