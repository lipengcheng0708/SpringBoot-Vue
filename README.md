##搭建前端服务器

（除最后一步，以下需在在命令提示符中完成）

1.安装node.js

node -v和npm -v，出现相应版本证明安装成功。

安装包下载地址：[https://nodejs.org/en/download/](https://nodejs.org/en/download/)

2.安装淘宝镜像cnpm

    npm install -g cnpm –registry=https://registry.npm.taobao.org

3.安装vue脚手架

    cnpm install -g vue-cli

4.构建项目

在本地目录下，假设我们要开发一个“后台管理”的项目，项目名称是“admin”。

    vue init webpack admin

5.安装依赖

    cd admin
    cnpm install

6.启动项目

需在admin目录中输入以下命令。

    npm run dev

7.运行项目

[http://localhost:8080/#/](http://localhost:8080/#/)




## 前后端分离 ##

springboot+vue

参考链接：[http://www.cnblogs.com/GoodHelper/p/8430422.html](http://www.cnblogs.com/GoodHelper/p/8430422.html)


前端vue：

1.进入package.json同级目录

参考安装组件： [http://www.cnblogs.com/GoodHelper/p/8430861.html](http://www.cnblogs.com/GoodHelper/p/8430861.html)



## 项目部署 ##

常用的部署方式有两种：

1.是把生成好的静态页面放到spring boot的static目录下，与打包后的spring boot项目一起发布，当spring boot运行起来后，自然而然就能访问到静态页面文件了。

这种方法比较简单，适用于非常小型的系统。优点是：不需要复杂的配置。而缺点也很明显：需要两者一同发布。我在这里就不做赘述了。

2.是通过http服务器发布，本文以nginx为例，重点介绍这种方式。

参考链接：[http://www.cnblogs.com/GoodHelper/p/8435112.html](http://www.cnblogs.com/GoodHelper/p/8435112.html)


## 问题 ##

1.Spring Boot中使用Jpa的findOne方法不能传入id

[https://blog.csdn.net/kaifaxiaoliu/article/details/79990996](https://blog.csdn.net/kaifaxiaoliu/article/details/79990996)

2.焦点问题

描述：新增数据时，选择性别的单选框的焦点不会立即切换，需触发其他事件才可切换。

解决方法：

handleAdd方法中的form为空代码注释，在data方法中给form赋值。

````
let handleAdd = function() {
 // this.form = {}
  this.form.sex = 2  //注：添加数据时，选择性别的单选框焦点不会立刻改变，先修改成不给默认值。（已解决）
  this.formVisible = true
}
````


````
 form: {sex:1},
````

3.接着问题2修改

描述：此时编辑其他数据，再新增数据时，name输入框会保存编辑的数据。

解决方法：将form.name赋值空字符串

````
this.form.name=""
````

4.接着问题3修改

描述：增加数据时，不输入name，会有警告提示，此时编辑数据，警告提示不消失。

解决方法：注释rules代码

````
  name: [{
    required: true,
    message: '请输入姓名',
   // trigger: 'blur'
  }],
````