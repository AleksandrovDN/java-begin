import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class mut {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("E:/Devel/NewDir/macdouble.txt");
            FileOutputStream fos=new FileOutputStream("E:/Devel/NewDir/macdouble.csv"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер


            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
            catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        }
    }