
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
 
public class WriteToFile {
 
    public static void main(String[] args) {
         
        BufferedWriter bufferedWriter = null;
        try {
            String strContent = "This example shows how to write string content to a file";
            File myFile = new File("C:/MyTestFile.txt");
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            Writer writer = new FileWriter(myFile);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(strContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(bufferedWriter != null) bufferedWriter.close();
            } catch(Exception ex){
                 
            }
        }
    }
}
 