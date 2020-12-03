package pack1;
import java.util.Scanner;
public class Student {
	public String Name;
	public String Age;
	public String Sex;
	
	public String getName() {
		return Name;
	}
	public String getSex() {
		return Sex;
	}
	public String getAge() {
		return Age;
	}
//	public  void inform(String Name, String Sex, String Age){
//		this.Name = Name;
//		this.Sex = Sex;
//		this.Age = Age;
//	}
	
//	try {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入你的姓名");
//		 Name = scanner.nextLine();
//		System.out.println("请输入你的性别");
//		 Sex = scanner.nextLine();
//		System.out.println("请输入你的年龄");
//		 Age = scanner.nextLine();
//		System.out.println("您输入的信息是：");
//		System.out.println(Name);
//		System.out.println(Sex);
//		System.out.println(Age);
//		scanner.close();
//	}catch (Exception e) {
//		System.out.println("请检查输入是否有误");
//	}
	public String show() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的姓名");
		 Name = scanner.nextLine();
		System.out.println("请输入你的性别");
		 Sex = scanner.nextLine();
		System.out.println("请输入你的年龄");
		 Age = scanner.nextLine();
		System.out.println("您输入的信息是：");
		System.out.println(Name);
		System.out.println(Sex);
		System.out.println(Age);
		String str = "姓名："+Name+"年龄："+Age+"性别:"+Sex;
		return str;
	}

}





	

	



