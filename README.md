# springmvcStudy

本项目为基于java实现的springmvc的demo

代替web.xml配置

定义DispatcherConfig类实现AbstractAnnotationConfigDispatcherServletInitializer类

重写getRootConfigClasses 、getServletConfigClasses、getServletMappings三个方法

参考《spring实战 第四版》

#测试
使用maven打war包到tomcat中运行即可。