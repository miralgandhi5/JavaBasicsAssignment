import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by miral on 6/21/2017.
 */
public class ReadFile {
    static void readfile(){
        try {
            File file = new File("C:\\Users\\miral\\IdeaProjects\\JavaBasics\\src\\temp");
            BufferedReader br = new BufferedReader(new FileReader(file));

            StringBuffer fileContents = new StringBuffer();
            String line = br.readLine();

            while (line != null) {
                fileContents.append(line);
                line = br.readLine();
            }
            br.close();
            System.out.println(fileContents);
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        readfile();
    }
}
