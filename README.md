# webService-Spring
Spring整合cxf

教程地址 ：
http://blog.csdn.net/blueheart20/article/details/42971713

tips：

1.使用maven引入依赖时可能会发生 Failed  read artifact descriptor for xxx jar 错误 ，解决方式：删除仓库下的jar包，强制更新相关项目

2.访问路径： http://host:port/项目名称/services ， 可以获取该路径所有的服务列表

3.客户端：一个类JaxWsProxyFactoryBean，两个设置：接口，地址

