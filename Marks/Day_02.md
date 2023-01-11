# Day_02  

## 1. 数组  

### 1. 静态初始化数组  

​	![image-20230111104816415](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111104816415.png)

  ![image-20230111110954807](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111110954807.png)  



### 2. 数组的访问与长度属性  

![image-20230111111455825](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111111455825.png)    

  

### 3. 动态初始化数组  

![image-20230111111925801](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111111925801.png)  

![image-20230111112718766](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111112718766.png)  

![image-20230111113525826](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111113525826.png)  

(一个结束死循环的方法，类似于C语言中的goto的写法)  

![image-20230111114252285](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111114252285.png)  

补充：二维数组：<[Java数组之二维数组 - cowbe - 博客园 (cnblogs.com)](https://www.cnblogs.com/qq308015824/p/10732940.html)>

### 4. 数组内存图及常见使用问题  

#### 1. Java内存分配介绍   

![image-20230111120303427](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111120303427.png)  

例：![image-20230111120523716](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111120523716.png)  

#### 2. 两个变量指向同一个数组  

![image-20230111121315065](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111121315065.png)  

#### 3. 数组使用常见问题  

![image-20230111121429073](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111121429073.png)  

![image-20230111121517586](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111121517586.png)  

### 5. Debug工具的使用  

![image-20230111121650033](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111121650033.png)  

### 6.方法  

* **方法的概述及优点**  

![image-20230111122621605](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111122621605.png)  

![image-20230111122648422](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111122648422.png)  

* **方法的定义及常见问题**  

类似于C语言中自己另外定义的函数，但是相比于C语言中的函数，Java中的方法无需在调用前声明，只要在任何一个地方定义过这个方法，那就可以直接调用  

![image-20230111124736764](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111124736764.png)  

![image-20230111125533139](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111125533139.png)  

![image-20230111125554889](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111125554889.png)  

![image-20230111125642230](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111125642230.png)  

![image-20230111130105229](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111130105229.png)  

  

* **方法的内存原理**  

![image-20230111131015638](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111131015638.png)  

![image-20230111132038364](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111132038364.png)  

* **方法的参数传递机制**  

1. 基本类型的参数传递  

![image-20230111133325839](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111133325839.png)  



2. 引用类型的参数传递  

地址传递

![image-20230111134450179](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111134450179.png)  

* **方法重载和return关键字**  

![image-20230111135322870](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111135322870.png)  

![image-20230111140006785](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111140006785.png)  

![image-20230111140049654](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111140049654.png)  

![image-20230111140618242](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111140618242.png)  

### 7.面向对象  

#### 1. 设计对象和注意事项  

* **设计对象并使用**  

1. 设计类，创建对象并使用

类和C语言中的结构体相似    

![image-20230111152707757](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111152707757.png)  

在同一包的类中可直接调用另一类中所创建的对象

![image-20230111153216428](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111153216428.png)  

* 类名首字母建议大写，满足“驼峰模式”，不能用关键字，必须是合法标识符，且有意义  
* 一个Java文件中可定义多个class类，但是只能有一个类由public修饰，且public修饰的类名称必须成为代码文件名  
* 成员变量的完整定义格式是：*修饰符 数据类型 变量名称 = 初始化值* 一般无需指定初始化值，存在默认值

#### 2.内存机制  

* **多个对象的内存图**  

![image-20230111155335325](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111155335325.png)  



* **两个变量指向同一个对象内存图**  

![image-20230111160022615](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111160022615.png)  

#### 3. 构造器（构造方法），this  

* **构造器**  

![image-20230111161233892](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111161233892.png)  

![image-20230111161812497](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111161812497.png)  

* **this**  

![image-20230111161919228](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111161919228.png)  

  ![image-20230111162438959](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111162438959.png)  

#### 4. 封装  

* 封装思想

![image-20230111162825396](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111162825396.png)    



  ![image-20230111163014415](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111163014415.png)  

重点理解：多个对象的关系  

如：人关门--人给了门一个力，门自己关了

![image-20230111163644108](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111163644108.png)  

* 如何更好地封装  

![image-20230111163930957](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111163930957.png)  

 #### 5.JavaBean  

![image-20230111164058652](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111164058652.png)  

![image-20230111165020377](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111165020377.png)    ![image-20230111165117962](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111165117962.png)  

### 8.常用API（String、Arraylist）  

#### 1. String类<[Java String 类 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-string.html)>  

* **String类的概述及特点**  

![image-20230111165619304](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111165619304.png)  

![image-20230111165903666](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111165903666.png)  

* **创建String对象的方法**  

![image-20230111170254320](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111170254320.png)  

![image-20230111170655001](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111170655001.png)  

![image-20230111171053754](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111171053754.png)  

![image-20230111171151299](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111171151299.png)  

![image-20230111171537235](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111171537235.png)  

上面题目中的s1指向常量池中的"abc"，s2指向堆内存新开辟出来的"abc"  

![image-20230111172100538](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111172100538.png)    

Test3中的s1指向常量池中的"abc"，s3指向s2+"c"运算时在堆内存中生成的"abc"  

Test4中的s2在对3个单独字母相加时因为编译优化机制，直接转化成常量池中的"abc"

* **String类中常用API**  

![image-20230111173000326](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111173000326.png)  

![image-20230111173057601](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111173057601.png)  

* StringBuffer和StringBuilder

<[Java StringBuffer 和 StringBuilder 类 | 菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-stringbuffer.html)>

1. 目的：提高字符串操作效率
2. 定义：一个可变的字符序列（字符串缓冲区）（详细见API手册）
3. 常用方法：

1. 1. `append(任何类型)`：向缓冲区添加内容
   2. `reverse()`：反转缓冲区的内容
   3. `length()`：缓冲区中字符的数量，输出一个整形变量，所以需要一个值来接受
   4. `toString()`：将StringBuilder格式转换为String，需要接受值

4. StringBuffer跟StringBuilder类似，但是更安全，因此效率更低一点  

#### 2. Arraylist  <[Java ArrayList |菜鸟教程 (runoob.com)](https://www.runoob.com/java/java-arraylist.html)>  

* **集合概述**  

![image-20230111184332066](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111184332066.png)  

![image-20230111184350322](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111184350322.png)  

* **Arraylist的使用**  

![image-20230111184520203](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111184520203.png)  

![image-20230111184915145](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111184915145.png)  

![image-20230111185015530](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111185015530.png)  



![image-20230111185650185](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111185650185.png)  

![image-20230111191951781](C:\Users\16612\AppData\Roaming\Typora\typora-user-images\image-20230111191951781.png)  

