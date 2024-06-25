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

索引


## mybatis

- 配置sql提示
- jdbc
- lombok
- 增删改查
- xml映射
- 动态sql if foreach sql include
- 分页查询
- 阿里云oss


## springboot 配置

- ConfigurationProperties @ConfigurationProperties(prefix = )


## 登录校验
- cookie
- session
- jwt
- filter
- interceptor


## 全局异常处理
- 

## AOP面向切面编程

- 目标对象 代理对象
- aspect注解
- 切入点表达式
- jointpoint 连接点
- advice 通知
- jointcut 切入点
- aspect
- target
- around 需要自己调用proceedingjointpoint.proceed() 其余的通知类型不需要
- around 环绕方法返回值必须object 用来接收原方法返回值
- execution 切入点表达式可以抽取出来一个方法
- 多个切面类的通知执行顺序 默认按照类名字母顺序 before就是先执行 after后执行
- 切面类order注解 @order(1) before数字越小越先执行 after相反
- execution(访问修饰符 返回值 包名.类名.方法名(方法参数(需要完整包名)) throws 异常)
-  *号匹配任意类型的单个参数(还可以匹配部分字符)  ..匹配任意类型的任意个参数
- 还可以用|| 连接多个表达式
- annotation 自定义类并给方法添加注解来控制切面
- 连接点jointpoint 来获取类名 方法名 参数


## springboot原理
- 配置优先级 properites>yml>yaml idea中vmoptions program argu 分别是vm属性和命令行参数的配置 命令行参数>vm属性
- 获取bean 直接注入applicationcontext 获取ioc容器对象
- applicationcontext.getbean(类名首字母小写) object类型的需要 强转
- bean作用域 singleton单例 容器内同名称只有一个 prototype 每次使用该bean创建新的
- scope 设置作用域 单例模式 容器启动的时候就有bean
- lazy注解 延迟初始化到第一次使用
- 第三方bean的管理 在启动类中添加方法 返回值是该对象 加bean注解
- 集中管理第三方bean 配置类 configuration注解类
- 第三方bean需要依赖其他bean对象就直接在 config类的方法中设置形参
- 项目中自定义的用component 第三方用bean
- 起步依赖 自动管理 
- 第三方包是扫描不上的 需要componentscan指定扫描包和当前包
- import注解导入的类 导入普通类 配置类 importselector实现类 启动类中加import注解
- enable...注解 封装import注解 自动配置第三方依赖
- conditional及其子注解 conditionalonclass等
- conditionalOnMissingBean 没有该类型bean的话 才会把他加入ioc 也可以指定名称name属性 或者类型value属性
- conditionalOnProperty 判断配置文件中是否有对应的属性和值 name=,havingValue= 有的话才注册bean到ioc
- 核心在SpringBootApplication 包含三个注解 SBConfiguration enableAutoConfiguration 和ComponentScan enable封装了import注解 import注解中封装了一个ImportSelector的实现类 AutoConfigurationI S.class 实现了selectImports方法 方法返回值就是那些容器需要给ioc管理 会读取两份配置文件spring.factories (SB2.xx才有)和spring下的autoconfiguration.imports 文件中配置了大量的类 这里所有的不一定都加入 在声明bean的时候会加上conditional..注解进行条件装配
- 自定义起步依赖starter 命名规范 官方和自定义的区别用 名字在前/后 区分开
- 自定义starter包 需要引入autoconfigure包
- pom引入 改造工具类 yml文件配置参数 通过properties实体类加载配置文件中的项 最后获取参数 声明component成为bean
- 创建starter模块 创建autoconfig模块并引入 在auto中定义自动配置 和配置文件META-INF/spring/xxx.imports

## maven高级
- 子模块设计 父工程和子工程的依赖继承
- <parent></> pom打包方式jar
- 父工程指定<packing>pom<>
- 子工程指定父工程pom位置<relativePath><>
- 标签<dependencyManagement> 父工程中锁定版本
- maven 自定义属性 <properties><xx.version>1.0.0</></> ${xx.version}引用
- maven聚合<modules><module>../xxx</></>
- 私服  central relese发行版本 snapshot版本
- 1. maven的settings.xml配置用户名密码 /config/settings.xml
- 2. mirrors配置私服连接地址
- 3. profile 指定允许使用snapshot版本依赖
- 4. distributionManagement标签 来指定私服地址 repostiry是relese地址