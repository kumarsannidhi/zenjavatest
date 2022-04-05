package programs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("C:\\files\\File1.txt");
			int c;
			char ch;
			String str="";
            while ((c = fr.read()) != -1) {
               ch= (char) c;
               str=str+ch;
            }
            fr.close();
            System.out.println(str);
           FileWriter fw=new FileWriter("C:\\files\\File2.txt");
            fw.append(str);
            fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
