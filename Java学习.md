# Java学习



## 1.关键字与标识符

标识符：类名等，不能以数字开头，不能以关键字作为名字，区分大小写

标识符规范：

- 变量名：英文，有意义，**首字母小写**，驼峰模式
- 类名称，**首字母大写**，驼峰模式



## 2.java语法

- 最重要的是，学会查文档





- 数据最小表示单元，一个字节，8位一组



#### 数据类型

![image-20230901113609506](D:\JavaLearning_2023\Pic\image-20230901113609506.png)

- 如果只是输入数据，还是会存入int类型；想要long，需要后面加L，float之于double同理

```java
long a=1021002010201L;
float b=2.345F;
```



- 引用数据类型String（字符串），记住一个字符串

  ```java
  String name="fuck"
  ```

  

#### 数据类型转换





#### Scanner

导包：

```
import java.util.Scanner;
```

![image-20230902111116371](D:\JavaLearning_2023\Pic\image-20230902111116371.png)

在文档中如图所示:

```java
Scanner sc = new Scanner(System.in);  //得到扫描器

        //调用sc的功能
        System.out.println("输入年龄");
        int age =sc.nextInt();//sc.nextInt()会等待直到用户输入回车键
        System.out.println("年龄是"+age);
        System.out.println("输入名字");
        String name=sc.next();
        System.out.println("名字是"+name);
```



#### Break与Continue

- Break直接跳出循环
- Continue跳出循环本次执行，进行下一次执行



#### 生成随机数Random



#### 数组



##### 2.6.1静态初始化数组



##### 2.6.2动态初始化数组



