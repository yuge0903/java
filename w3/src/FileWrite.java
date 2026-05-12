import java.io.FileWriter;
import java.lang.String;
public class FileWrite {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("src\\data.txt",true);
            String data = "chao cac ban.";
            fw.write(data);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
