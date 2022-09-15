package cpit305;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class task1 {
    public static void main(String[] args) throws IOException {

       

        FileInputStream fis = new FileInputStream("C:\\Users\\ReeNo\\Documents\\NetBeansProjects\\CPIT305\\data.txt");
        InputStreamReader in = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(in);
        String newline = "";

        String str = "";

     
        int counter = 0;

        while ((str = reader.readLine()) != null) {

            if (counter == 0) {
                counter++;
                continue;
            }

            StringTokenizer tok = new StringTokenizer(str, ",");
            
            System.out.println("recored#: "+ counter + "\n--------------------");
            counter++;
            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());

            System.out.println(tok.nextToken());
            
            
        
            
            if (counter == 33) {
                System.exit(0);
            }
            
            System.out.println("");
            System.out.println("--------------------");
        }
    }
}