package pack1;
import java.util.Scanner;
import java.io.*;
public class Test {	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入你的姓名");
			String Name = scanner.nextLine();
			System.out.println("请输入你的性别");
			String Sex = scanner.nextLine();
			System.out.println("请输入你的年龄");
			int Age = scanner.nextInt();
			System.out.println("您输入的信息是：");
			System.out.println(Name);
			System.out.println(Sex);
			System.out.println(Age);
			Txt txt = new Txt();
			Test.txt();
		} catch (Exception o) {
			System.out.println("请检查输入是否有误");
			scanner.close();
		}
}
		
		public static void txt() {
			try(FileReader FileInputStream = new FileReader("D:\\JAVA\\Studentwork\\bin\\pack1\\poem.txt");
				FileWriter FileOutputStream = new FileWriter("D:\\JAVA\\Studentwork\\bin\\pack1\\chg.txt")){
				StringBuffer gs = new StringBuffer();
				char[] chg = new char [16];
				while((FileInputStream.read(chg))!=-1){
					gs.append(chg, 0,7);
					gs.append(",");
					gs.append(chg, 7, 7);
					gs.append("。"+"\n");
					}
					
					System.out.println(gs);
					FileOutputStream.write(new String(gs));
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
					
	}
