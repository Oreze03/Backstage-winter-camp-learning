## 继承  
### 1. 继承的概述  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673673476365-a2098e60-7b30-4ec6-83f5-acf3a6d52887.png#averageHue=%23f6f2f1&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=533&id=ub8c6c63d&margin=%5Bobject%20Object%5D&name=image.png&originHeight=666&originWidth=1504&originalType=binary&ratio=1&rotation=0&showTitle=false&size=258469&status=done&style=none&taskId=u81f785f7-1b0c-458e-9cce-8baeb909add&title=&width=1203.2)  ![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673673688517-0ab60f9c-5fa0-4941-aaca-8ed1e117274a.png#averageHue=%23f4f4f4&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=332&id=u42e98f4f&margin=%5Bobject%20Object%5D&name=image.png&originHeight=415&originWidth=1574&originalType=binary&ratio=1&rotation=0&showTitle=false&size=107339&status=done&style=none&taskId=u84a982e5-50b9-4f4c-aa03-d9b9b7f27ea&title=&width=1259.2)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673673991303-ff25bd25-7534-4edb-a06a-ca839c125b45.png#averageHue=%23f7f2db&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=597&id=u72c49213&margin=%5Bobject%20Object%5D&name=image.png&originHeight=746&originWidth=1642&originalType=binary&ratio=1&rotation=0&showTitle=false&size=476114&status=done&style=none&taskId=u628c154f-9abe-4138-88d4-3b55c4a0413&title=&width=1313.6)
### 2. 继承的特点  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674040062-7e31e381-cd5c-4e98-8440-8e37d33b8a8a.png#averageHue=%23f5f5f5&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=170&id=u8f4ce35d&margin=%5Bobject%20Object%5D&name=image.png&originHeight=213&originWidth=436&originalType=binary&ratio=1&rotation=0&showTitle=false&size=31647&status=done&style=none&taskId=ud2f51eaa-722a-4ac3-8adf-b65341175d2&title=&width=348.8)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674149456-12ffdd64-2041-40ab-b542-69a7cd57cf5f.png#averageHue=%23f0edeb&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=628&id=ue158dfb9&margin=%5Bobject%20Object%5D&name=image.png&originHeight=785&originWidth=1100&originalType=binary&ratio=1&rotation=0&showTitle=false&size=304736&status=done&style=none&taskId=u6fae7990-dd2a-4784-84ed-c83fad3faa3&title=&width=880)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674376334-673f8031-099a-483f-836e-87171f381ebd.png#averageHue=%23eeeeee&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=223&id=u03838a75&margin=%5Bobject%20Object%5D&name=image.png&originHeight=279&originWidth=853&originalType=binary&ratio=1&rotation=0&showTitle=false&size=80785&status=done&style=none&taskId=ua2537e88-8cba-4527-8b5f-50b99e192a5&title=&width=682.4)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674404383-c55df06b-a0ec-4101-9358-b3c69ad84ab2.png#averageHue=%23f3f1f1&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=141&id=u1fac5147&margin=%5Bobject%20Object%5D&name=image.png&originHeight=176&originWidth=1153&originalType=binary&ratio=1&rotation=0&showTitle=false&size=56438&status=done&style=none&taskId=u5452ced3-9580-4cc4-bfe1-7a0305eb700&title=&width=922.4)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674448866-ecd033d3-e596-44ae-be97-dad99ac13904.png#averageHue=%23f6f3ea&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=615&id=u5bc50c9a&margin=%5Bobject%20Object%5D&name=image.png&originHeight=769&originWidth=1669&originalType=binary&ratio=1&rotation=0&showTitle=false&size=436572&status=done&style=none&taskId=u858a6b9a-caf1-4d4d-8421-4de092fc505&title=&width=1335.2)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674499313-318045ed-fc61-4344-936f-d3b3e09bcef5.png#averageHue=%23f0f0f0&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=136&id=u1b608c12&margin=%5Bobject%20Object%5D&name=image.png&originHeight=170&originWidth=638&originalType=binary&ratio=1&rotation=0&showTitle=false&size=30062&status=done&style=none&taskId=u1ef5eee2-a2f9-4250-af9d-70d6a00b6c5&title=&width=510.4)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674526837-e23de855-b94b-444a-b5aa-5955b5ffbb23.png#averageHue=%23f3f3f3&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=61&id=u5fbaaf64&margin=%5Bobject%20Object%5D&name=image.png&originHeight=76&originWidth=662&originalType=binary&ratio=1&rotation=0&showTitle=false&size=15587&status=done&style=none&taskId=u53d3c55b-0b42-4b6e-9a0e-17a1331df4b&title=&width=529.6)  
### 3. 继承的访问特点  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674600644-f7ccf2da-20a1-42dd-ad59-33ee857a509d.png#averageHue=%23f6f3f3&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=225&id=ua1931c3c&margin=%5Bobject%20Object%5D&name=image.png&originHeight=281&originWidth=667&originalType=binary&ratio=1&rotation=0&showTitle=false&size=70207&status=done&style=none&taskId=ub950717b-7740-4f66-978e-1011120205f&title=&width=533.6)  
### 4.继承中的方法重写  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674666835-812a011a-f7b2-443d-9dfe-0678bf5da9f4.png#averageHue=%23f2f2f2&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=205&id=u56d60dfa&margin=%5Bobject%20Object%5D&name=image.png&originHeight=256&originWidth=595&originalType=binary&ratio=1&rotation=0&showTitle=false&size=55875&status=done&style=none&taskId=u66f3cfba-7f43-4c99-b529-d0808380bde&title=&width=476)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674742873-35ebcff4-cad0-4053-859d-6f7d47bbb6d5.png#averageHue=%23fdfdfc&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=274&id=u5e7578bf&margin=%5Bobject%20Object%5D&name=image.png&originHeight=343&originWidth=479&originalType=binary&ratio=1&rotation=0&showTitle=false&size=52835&status=done&style=none&taskId=ub6672093-983d-4e7c-99c4-6142271db23&title=&width=383.2)![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674761391-e272eddb-5410-4139-8e28-54a763491823.png#averageHue=%23f4f1e4&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=338&id=udbdd2e97&margin=%5Bobject%20Object%5D&name=image.png&originHeight=422&originWidth=612&originalType=binary&ratio=1&rotation=0&showTitle=false&size=121397&status=done&style=none&taskId=u04b474d9-6e18-48da-9d66-a8cb9be4b48&title=&width=489.6)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674873078-e95b22c3-b7a2-41f1-aa21-a3835730b4d9.png#averageHue=%23f4f2f2&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=246&id=u99d66361&margin=%5Bobject%20Object%5D&name=image.png&originHeight=307&originWidth=603&originalType=binary&ratio=1&rotation=0&showTitle=false&size=84440&status=done&style=none&taskId=u4723b29b-8949-4db8-965a-f5633123450&title=&width=482.4)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673674807084-20cbd659-95e8-409b-9716-85977936794a.png#averageHue=%23faf9f7&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=342&id=u6bcf6e5a&margin=%5Bobject%20Object%5D&name=image.png&originHeight=428&originWidth=1070&originalType=binary&ratio=1&rotation=0&showTitle=false&size=177189&status=done&style=none&taskId=u0fe270cf-fccc-4736-8dc5-ab3993952e7&title=&width=856)  
### 5. 继承后构造器的特点，this和super的小结  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673675067921-d36bd9fd-ee25-463b-81e8-95fe3cf57bdc.png#averageHue=%23f7f5f5&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=466&id=u1ba5602e&margin=%5Bobject%20Object%5D&name=image.png&originHeight=582&originWidth=1264&originalType=binary&ratio=1&rotation=0&showTitle=false&size=175776&status=done&style=none&taskId=u5bffd6c7-742c-47fe-8978-b5cef3db4d8&title=&width=1011.2)![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673675605297-8451de40-8e3a-4603-95a6-cab23d39846e.png#averageHue=%23f2f2f2&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=114&id=uff759599&margin=%5Bobject%20Object%5D&name=image.png&originHeight=142&originWidth=1140&originalType=binary&ratio=1&rotation=0&showTitle=false&size=34604&status=done&style=none&taskId=u6d15dda3-f7a1-4eb9-b0be-10d9d0fcfb9&title=&width=912)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673675556727-9e3b6d7a-7280-4fb1-804f-59ba7cb447a6.png#averageHue=%23f8f7f5&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=568&id=u68e50af8&margin=%5Bobject%20Object%5D&name=image.png&originHeight=710&originWidth=1350&originalType=binary&ratio=1&rotation=0&showTitle=false&size=355281&status=done&style=none&taskId=u426d742e-412e-4bbb-8cff-a7682178d02&title=&width=1080)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673675632832-320c27ae-b0cd-46be-b811-f573b61dc7f8.png#averageHue=%23f1f1f1&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=282&id=u5a1785d3&margin=%5Bobject%20Object%5D&name=image.png&originHeight=352&originWidth=999&originalType=binary&ratio=1&rotation=0&showTitle=false&size=85572&status=done&style=none&taskId=u150d90bf-a103-43d9-bfbc-fbbae72570b&title=&width=799.2)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673675728555-ce80bb6f-ad47-4275-8ae4-4ca32f83beef.png#averageHue=%23fcfefc&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=445&id=u08108d8c&margin=%5Bobject%20Object%5D&name=image.png&originHeight=556&originWidth=1112&originalType=binary&ratio=1&rotation=0&showTitle=false&size=199354&status=done&style=none&taskId=u799f5aec-4692-4e57-9d3c-5cb79c1ae9d&title=&width=889.6)  
![image.png](https://cdn.nlark.com/yuque/0/2023/png/34902278/1673675753951-dabaa0e2-d801-4b36-831d-0c261322122b.png#averageHue=%23f0f0f0&clientId=u4b369fc8-b9e0-4&crop=0&crop=0&crop=1&crop=1&from=paste&height=118&id=ub28dd69c&margin=%5Bobject%20Object%5D&name=image.png&originHeight=148&originWidth=1324&originalType=binary&ratio=1&rotation=0&showTitle=false&size=41564&status=done&style=none&taskId=u97875e68-7ae2-4c3f-8a94-c00b553463a&title=&width=1059.2)