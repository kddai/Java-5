package pack1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class Txt {
	public static void txt() {
			try(FileReader FileInputStream = new FileReader("D:\\JAVA\\Studentwork\\src\\pack1\\poem.txt");
				FileWriter FileOutputStream = new FileWriter("D:\\JAVA\\Studentwork\\src\\pack1\\chg.txt")){
				StringBuffer gs = new StringBuffer();
				char[] chg = new char [14];
				while((FileInputStream.read(chg))!=-1){
					gs.append(chg, 0,7);
					gs.append(",");
					gs.append(chg, 7, 7);
					gs.append("¡£\n");
					}
					System.out.println(gs);
					FileOutputStream.write(new String(gs));
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
	}

