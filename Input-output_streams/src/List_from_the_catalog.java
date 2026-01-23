import java.io.File;
import java.util.Objects;

public class List_from_the_catalog {
    public static void main(String[] args) {
        File dir = new File("src");
        if (dir.isDirectory()) {
            for (File item : Objects.requireNonNull(dir.listFiles())) {
                if(item.isDirectory()) {
                    File cat = new File(dir, item.getName());
                    System.out.println("Folder "+cat.getName());
                    for (File file : Objects.requireNonNull(cat.listFiles())) {
                        if (file.isFile()) System.out.println("File " + file.getName());
                    }
                } else System.out.println("File " + item.getName());
            }
        }
    }
}
