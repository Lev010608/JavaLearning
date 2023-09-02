package cn.edu.bupt.random;
import java.util.Random;
import java.util.random.*;

public class RandomDemo {
    public static void main(String[] args) {
        //Random生成随机数
        Random r = new Random();
        for(int i =1;i<=20;i++) {
            //得到随机数
            int data = r.nextInt(10);
            System.out.println("随机数是" + data);
        }
    }
}
