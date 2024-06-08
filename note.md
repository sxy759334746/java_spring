## note笔记，记录一下项目学习过程

1. 列表
2. 列表

- 无序列表1
- 无序列表2

测试放置图片效果  
![pic](pictures/微信图片_20240525230459.png) 

强调**语法**

> 引用语法

分割线
--- 
***

比较底层的处理请求的代码没有写完，需要看看javase的网络编程。

直接使用tomcat来处理。
tomcat web容器，serverlet容器,springweb是内置tomcat服务器

serverlet DispatcherServerlet 前端控制器
![pic2](pictures/微信截图_20240526230411.png)

postman 前端测试工具

controller类文件是不是只能写一个，然后再同一个类中写不同的方法？

ioc di入门 
将service层和dao层的实现类交给ioc容器管理
为controller和service注入运行时 依赖的对象
@Component注解  @Component  //加上component注解 表示将当前类交给容器管理 成为ioc容器中的bean
@Autowired //表示运行时ioc会提供该类型的bean对象 并赋值给该变量 依赖注入

service 和 controller 依赖了对象 需要autowried
dao 和service 他俩需要 component注解交给ioc

component的衍生注解 
@Component  不属于下面三种 但是想交给ioc管理的
@Service   
@Controller
@repository
bean有默认名字 默认类名首字母小写 可以用value设置
@ComponentScan  组件扫描默认是启动类所在包和子包 用value 和basePackages 来指定扫描路径

@Autowired注解是默认按照类型来分配的 当有多个相类型的bean 会报错
可以通过 
@Primary 加在多个同类型bean的其中一个上 比如 @primary @service
@Qualifier 加在autowired上面 @Qualifier("bean name")
@Resource  这个在包javax.annotation.resource下  @Resource(name = "bean name")

autowired是spring框架提供的注解 resource是jdk提供的注解
前者根据类型注入  后者按照名称注入


## mysql

- show databases;
- create database name;
- create database if not exists name;
- use name;
- selece database(); -- 查看当前数据库
- drop database id exists name;
-  --database 也可以换成schema
- show tables 查询表
- desc tablename
- show create table tablename 查询建表语句

表操作
- alter table 表明 add 字段名 类型 

事务
- start transaction;
- ...
- commit
- roolback
- 原子性
- 一致性
- 隔离性
- 持久性