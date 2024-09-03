package FileIO;

import java.io.File;
import java.io.FileReader;

public class testFile {
    public static void main(String[] args) {
        /*tao file moi
        try{
            File myFile = new File("text.txt");
            if(myFile.createNewFile()){
                //tao file moi neu file chua co
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Wrong");
            e.printStackTrace();
        }*/


        /*gi du lieu vao file su dung file write
        FileWriter fw = null;
        try{
            fw = new FileWriter("text.txt");
            fw.write("Hello World\n");
            for(int i=0;i<10;i++){
                fw.write(i+" ");
            }
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }*/

        //doc du lieu tu file ra su dung File Read va
        File myFile = new File("text.txt");
        try {
            FileReader fr = new FileReader(myFile);
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
