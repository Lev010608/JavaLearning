package cn.edu.bupt.scanner;
import java.util.Scanner;  //导包不用自己做，IDEA会自己做

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //得到扫描器

        //调用sc的功能
        System.out.println("输入年龄");
        int age =sc.nextInt();//sc.nextInt()会等待直到用户输入回车键
        System.out.println("年龄是"+age);
        System.out.println("输入名字");
        String name=sc.next();
        System.out.println("名字是"+name);
    }
}
