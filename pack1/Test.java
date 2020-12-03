package pack1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	
public class Test {	
	public static void main(String[] args) throws IOException {
		Student st= new Student();
		st.show();
		
		//char []stringArr =  st.show().toCharArray();
		Txt txt= new Txt();
		Txt.txt();
		File file = new File("D:\\JAVA\\Studentwork\\src\\pack1\\poem.txt");
		FileInputStream fis = new FileInputStream(file);
		//FileWriter  fw = new FileWriter("D:\\JAVA\\Studentwork\\bin\\pack1\\chg.txt");
		//fw.write(stringArr);
		ByteArrayOutputStream bos = new  ByteArrayOutputStream();
		int len;
		byte[] data = null;
		byte[] buffer = new byte[(int) file.length()];

		while ((len=fis.read(buffer))!=-1){
		    bos.write(buffer,0,len);
		}

		data = bos.toByteArray();
		String str = new String(data);

		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入你要查找的字或词：");
		char o = sc.next().charAt(0);
		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++){
		    if(o==ch[i]){
		        count++;
		        sc.close();
		    }

		}

		System.out.println("你输入的字或词在诗中出现过"+count+"次。");
		System.out.println("----------------------------");
		    fis.close();
		    bos.close();
		
	}
}



		
		

					
	
