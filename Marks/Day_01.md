
1. **IDEA**
   1. **项目的创建**

project(项目)-module(模块)-package(包)-class(类,即程序)
tips:package在工作中一般以公司域名倒写的方式来命名
如：com.baidu.包名称

   2. **常用快捷键**
      1. mian/psvm、sout、....		键入后按回车可以快速输入代码
      2. Ctrl+D					复制当前数据到下一行
      3. Ctrl+Y					删除所在行
      4. Ctrl+Alt+L				格式化代码
      5. Alt+Shift+↑,Alt+Shift+↓		上下移动当前代码
      6. Ctrl+/,Ctrl+Shift+/			注释
   3. **字面量**
      1. 整数						123
      2. 小数						1.23
      3. 字符						 '1'
      4. 字符串					 "123"
      5. 布尔值					 ture或false
      6. 空值						 null(一定是小写)
2. **Java入门**
   1. **变量**

定义与赋值方法和C语言一致

   2. **数据类型**

除了C语言中有的数据类型之外，整数中还有byte类型，取值范围为-128-127；而C语言中的bool类型在Java中改名为boolean
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673366806679-42453cf3-b87a-4a7b-9e85-bdd3c6b90f97.png#averageHue=%23e6d9d8&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=u9154ff40&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=417&originWidth=879&originalType=binary&ratio=1&rotation=0&showTitle=false&size=103812&status=done&style=none&taskId=u402c2f7a-b30b-4c34-adfa-e8a96ef0310&title=)
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673366845020-942f8d4d-bdd7-4a1e-8c77-5c09155059fd.png#averageHue=%23f0f0f0&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=u46b40019&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=159&originWidth=558&originalType=binary&ratio=1&rotation=0&showTitle=false&size=103812&status=done&style=none&taskId=u02652b98-c5b1-4d08-a5fc-84b1931e646&title=)

   3. **类型转换**
      1. **自动类型转换**

![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673366895139-50596bab-2983-4578-8d7c-f229855472b9.png#averageHue=%23f7f5f2&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=u116fd098&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=231&originWidth=688&originalType=binary&ratio=1&rotation=0&showTitle=false&size=51964&status=done&style=none&taskId=ub17babd5-405d-49b1-9087-a5794d17f1c&title=)
需要注意的是，在byte类型运算时，系统会将byte类型转换为int类型再进行运算，其输出类型为int

      2. **强制类型转换**

![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673367001828-1be9d9b5-1971-421f-8017-102eca96dc67.png#averageHue=%23f2f2f2&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=a4xIm&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=362&originWidth=546&originalType=binary&ratio=1&rotation=0&showTitle=false&size=65699&status=done&style=none&taskId=ufb2ebe4f-6b02-4005-9e78-a58e5b6584a&title=)

   4. **API**

在Java中，API类似于C语言中的头文件，是别人已经写好的东西，可以直接调用（如Scanner，Random）【具体内容见API文档】
tips:API文档使用流程：搜索->看包(是否需要导包)>看类的介绍(明确功能)->看类的构造方法(方便对象的创建)->看该类的成员介绍

3. **运算符与基本语句**
   1. **算术运算符**

与C语言中的并无区别，自增自减也一样，但是值得注意的是Java中的'+'运算符，可以用作连接符，将不能运算的数据连接在一起
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673367215545-5bf023e0-3008-4abe-9a18-f2ec6b918706.png#averageHue=%23f2f0e9&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=ub388ab3b&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=228&originWidth=453&originalType=binary&ratio=1&rotation=0&showTitle=false&size=87664&status=done&style=none&taskId=u23a62544-fce2-4bcb-89b6-b28c5baa9ee&title=)
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673367308847-06f45c28-5f5e-4839-b19f-48b0b3f7160f.png#averageHue=%23fdfcfa&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=ub43a08b6&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=174&originWidth=498&originalType=binary&ratio=1&rotation=0&showTitle=false&size=87664&status=done&style=none&taskId=u807f293d-9232-4026-90b0-df6906a1420&title=)

   2. **赋值运算符**

赋值运算符和关系运算符与C中并无二异，但关系运算符中表示逻辑或的运算符更改为'|'，且新增了表示逻辑异或的运算符'^'。
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673367515536-e9d359d2-48ef-44ca-a6e1-48aa3b7d669b.png#averageHue=%23e1cecb&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=u0ccb61b9&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=266&originWidth=716&originalType=binary&ratio=1&rotation=0&showTitle=false&size=87664&status=done&style=none&taskId=u12750f80-b1c2-4023-9cf9-bf810ad390d&title=)

   3. **三元（三目）运算符**

与C语言中一致，都是条件?结果1:结果2，可嵌套使用

   4. **条件语句**

与C语言中一致
需要注意switch的()中不支持double,float,long这三种类型的数据
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673367778511-795e1d3b-92ce-4a70-9d94-b97d25846fd0.png#averageHue=%23f2f2f2&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=u94ca3e0c&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=276&originWidth=608&originalType=binary&ratio=1&rotation=0&showTitle=false&size=87664&status=done&style=none&taskId=udb533be3-dc54-4484-afd8-8fc18151eec&title=)

   5. **循环语句**

与C语言中一致
![未命名图片.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368185472-b4460c5a-3205-4108-b3a5-7a4ff66fa734.png#averageHue=%23f9f7ec&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=ui&id=ua18a7cf1&margin=%5Bobject%20Object%5D&name=%E6%9C%AA%E5%91%BD%E5%90%8D%E5%9B%BE%E7%89%87.png&originHeight=377&originWidth=382&originalType=binary&ratio=1&rotation=0&showTitle=false&size=87664&status=done&style=none&taskId=u00b49ce2-50bd-45eb-9ff7-7c7e3bff8d5&title=)

   6. **Scanner类**
      1. 创建scanner对象

![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368378348-0b5ab6cd-ce0f-4797-b5de-e1254a27967e.png#averageHue=%23f6f5f3&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=77&id=u7320fe03&margin=%5Bobject%20Object%5D&name=image.png&originHeight=96&originWidth=368&originalType=binary&ratio=1&rotation=0&showTitle=false&size=6427&status=done&style=none&taskId=u6f8669e2-323e-45fe-8d36-7bcdbf442e7&title=&width=294.4)

      2. 使用next方法

![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368457178-6580b2a3-20bf-48d4-9107-01f6fe55858e.png#averageHue=%23f7f6f5&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=323&id=u8a561d1f&margin=%5Bobject%20Object%5D&name=image.png&originHeight=404&originWidth=573&originalType=binary&ratio=1&rotation=0&showTitle=false&size=24036&status=done&style=none&taskId=u88955393-3a3c-4308-bb88-beb197c2228&title=&width=458.4)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368564280-f818875c-a07d-4579-a431-0a3ac454f51d.png#averageHue=%23f6f5f4&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=113&id=ufde820ae&margin=%5Bobject%20Object%5D&name=image.png&originHeight=141&originWidth=291&originalType=binary&ratio=1&rotation=0&showTitle=false&size=6178&status=done&style=none&taskId=u34b0e9ff-f15e-4a3a-808a-b8671e04e8b&title=&width=232.8)

      3. 使用nextline方法

![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368536119-510d24da-8142-44a8-8053-3ae145e9f8a1.png#averageHue=%23f7f6f5&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=318&id=u4d5eb720&margin=%5Bobject%20Object%5D&name=image.png&originHeight=397&originWidth=593&originalType=binary&ratio=1&rotation=0&showTitle=false&size=24948&status=done&style=none&taskId=u9e21766b-b8fd-4210-8575-e59626814ce&title=&width=474.4)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368577288-71873623-2c85-456c-9363-d497a6a6f449.png#averageHue=%23f5f4f2&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=110&id=uc7ba52cf&margin=%5Bobject%20Object%5D&name=image.png&originHeight=137&originWidth=270&originalType=binary&ratio=1&rotation=0&showTitle=false&size=6372&status=done&style=none&taskId=u5e21322a-f9e1-4452-bf87-40713d67229&title=&width=216)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368626110-8cabd90d-911b-479e-9e00-a2d6a5d8f62b.png#averageHue=%23fbfaf9&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=350&id=u66b17e17&margin=%5Bobject%20Object%5D&name=image.png&originHeight=438&originWidth=1042&originalType=binary&ratio=1&rotation=0&showTitle=false&size=40599&status=done&style=none&taskId=ubb24377b-6e88-455c-b5e3-22da77059b7&title=&width=833.6)

   7. **Random类**
      1. 创建Random对象

Random r=new Random();
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368866852-6bc16392-9862-44e0-b178-f738c13eda69.png#averageHue=%23f5f3f1&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=110&id=u4b7e43a6&margin=%5Bobject%20Object%5D&name=image.png&originHeight=138&originWidth=887&originalType=binary&ratio=1&rotation=0&showTitle=false&size=16190&status=done&style=none&taskId=u4b7d447d-5b36-4c14-955e-b8a9a67c82c&title=&width=709.6)

      2. Random类常用方法

![](https://cdn.nlark.com/yuque/0/2023/webp/34902278/1673368925437-3439590d-fdfe-493c-89fe-bcf13163d494.webp#averageHue=%23f5f5f4&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&id=u478b8691&margin=%5Bobject%20Object%5D&originHeight=445&originWidth=651&originalType=url&ratio=1&rotation=0&showTitle=false&status=done&style=none&taskId=u03960941-93c8-477c-ba63-4851781cb92&title=)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368963545-239ba7a6-b898-45c5-a40b-f7b158a1740f.png#averageHue=%23fcfcfb&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=209&id=u8350f0be&margin=%5Bobject%20Object%5D&name=image.png&originHeight=261&originWidth=525&originalType=binary&ratio=1&rotation=0&showTitle=false&size=65840&status=done&style=none&taskId=u591578d2-2e2b-43ff-8dbd-856356d0fbb&title=&width=420)![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673368973234-58b18278-4b00-40e6-a9a4-84d7a81e032a.png#averageHue=%23f6f4f0&clientId=ua101b6e7-345c-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=297&id=ubd2f1ed2&margin=%5Bobject%20Object%5D&name=image.png&originHeight=371&originWidth=567&originalType=binary&ratio=1&rotation=0&showTitle=false&size=69171&status=done&style=none&taskId=u4e90d22d-b011-4249-abe9-4d1f8510798&title=&width=453.6)
