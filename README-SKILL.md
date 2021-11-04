## 技术介绍

以下介绍皆为Windows10下安装。

    前置环境安装：jdk1.8、Maven3.8.1、IDEA2020.2、MySql5.7、Redis5.0。
    
    另：
        数据库操作工具：SQLyog或者Navicat
        Redis操作工具：RedisDesktopManager

使用技术列表：

    SpringBoot2.0+、jdk1.8、Maven3.8.1、MySql5.7、Redis5.0、mybatis-plus、vue3等。

### 1 后端框架介绍

提供权限、数据等相关管理，并给前端提供接口服务。

### 1.1 MySql

    开源关系型数据库，存放数据，做数据持久化存储。提供事务，备份，容灾等功能。

### 1.2 Redis

    内存型非关系型数据库。做数据缓存，存放Token做数据共享。存放高访问数据提高用户并发量。理论上可以达到10W QPS,一般可以达到4W QPS左右。

### 1.3 jdk

    java运行环境

### 1.4 Maven

    java打包环境

### 1.5 SpringBoot2.0

    一个Spring+SpringMVC的简化开发版本，微服务设计。

### 1.6 mybatis-plus

    ORM数据库持久层框架，用于与数据库交互。

### 1.1 SpringSecurity实现OAuth2+JWT

SpringSecurity实现认证与授权。
OAuth2做第三方登录，提供Token做为访问权限。（单点登录，一个系统登录，相关系统无需再次登录就可以进入其他系统）
JWT用来生成Token。

    综合当前系统需要，只需要使用到SpringSecurity+JWT。Redis用来缓存用户登录Token,退出登录清除Token即可。

### 1. 拓展（分布式） -- 可不关注，感兴趣可以看一下相关资料


### 2 前端框架

做页面展示，调用后端接口做交互。

#### 2.1 vue

### 3 中间件Nginx

前端调用后端前的一个中转。

    1.部署前端项目
    2.做静态资源加载（提高前端页面的响应能力）
    3.负载均衡，且可以一定程度多部署后端服务提高用户访问并发QPS。
