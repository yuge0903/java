import java.io.FileReader;

public class FileRead {
    public static void main(String args[]) throws Exception {
        try {
            FileReader fr = new FileReader("src\\data.txt");
            int c = 0;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
