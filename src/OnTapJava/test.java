

package OnTapJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {


    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        //xoa khong trang thua o dau cau
////        int i = 0;
////        while(s.charAt(i) == ' '){
////            i++;
////        }
////        for(;i<s.length();i++){
////            System.out.print(s.charAt(i));
////        }
//        //cuoi cau
////        int i = s.length() - 1;
////        while(s.charAt(i) == ' '){
////            i--;
////        }
////        for(int l=0;l<=i;l++){
////            System.out.print(s.charAt(l));
////        }
////        String [] ss = s.split("\\s+");
////        for(int i=0;i<ss.length;i++){
////            System.out.print(ss[i]);
////            if(i!=ss.length - 1){
////                System.out.print(" ");
////            }
////        }
//        //dem so tu trong xau
////        s = s.trim().replaceAll("\\s+"," ");
////        String [] ss = s.split("\\s+");
////        System.out.println(ss.length);
//        int cnt = 0;
//        for(int i=0;i<s.length();i++){
//            if()
//        }
        int n = 96;
        try {
            File myfile = new File("text.txt");
            if (myfile.createNewFile()) {
                System.out.println("File da tao");
            } else System.out.println("File da duoc tao trc");
            System.out.println("File da san sang");
        } catch (IOException e) {
            System.out.println("Co loi");
            e.printStackTrace();
        }
        try {
            FileWriter myfile = new FileWriter("text.txt");
            myfile.write(n);
            myfile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
//
//
