# IDEA开发与配置



## IDEA管理Java结构

- project
- module
- package
- class（类）

![image-20230831184540908](D:\JavaLearning_2023\Pic\image-20230831184540908.png)

- src创建包，行业内经常用公司名称的倒写来创建

## IDEA开发入门

### 创建流程

1. new project
2. new module->选择JDK17
3. new Package
4. 创建类（class）

一个project中可以创建多个module

一个module中可以创建多个package

一个package中可以创建多个class



- 智能输入

进入class后，代码如图所示：

```java
package cn.edu.bupt.helloworld; //package名

public class HelloWorld {
}

```

智能输入，直接在类内这样写：

```java
package cn.edu.bupt.helloworld; 

public class HelloWorld {
    main
}

```

或

```java
package cn.edu.bupt.helloworld; 

public class HelloWorld {
    psvm
}

```

能够得到：

```java
package cn.edu.bupt.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        
    }
}

```

同理

```
 System.out.println();
```

可以直接用sout这样的缩写直接生成



IDEA编译后的class文件在out目录





## IDEA配置



### IDEA快捷键

![image-20230901101446357](C:\Users\Lev\AppData\Roaming\Typora\typora-user-images\image-20230901101446357.png)

|      |      |
| ---- | ---- |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |
|      |      |



### IDEA其他操作

- 删除类文件
- 修改类名词



- 修改模块
- 导入模块
- 删除模块



- 打开工程
- 关闭工程