package com.hpq.item.util;


import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hpq
 * @title: CodeGeneratorUtil
 * @projectName common
 * @description: 代码生成器
 * @date 2021/9/13/013 8:27
 */
public class CodeGeneratorUtilTest {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        final String projectPath = "D:/code";
        gc.setOutputDir(projectPath + "/src/main/java");
        //作者
        gc.setAuthor("hpq");
        //打开输入目录
        gc.setOpen(false);
        //xml开启BaseResultMap
        gc.setBaseResultMap(true);
        //xml开启BaseColumnList
        gc.setBaseColumnList(true);
        //gc.setServiceName("%sService");
        //实体属性 Swagger2 注解
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://192.168.2.201:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf-8&serverTimezone=GMT%2B8");
        // com.mysql.jdbc.Driver和mysql-connector-java 5一起用。
        // dsc.setDriverName("com.mysql.jdbc.Driver");
        // com.mysql.cj.jdbc.Driver和mysql-connector-java 6 一起用。比5多了一个时区
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //  pc.setModuleName(scanner("模块名"));
        pc.setModuleName(null);
        //如果需要事务单独，加manager层。本处无实现。
        pc.setParent("com.zlk.db")
                .setEntity("model.po")
                .setMapper("mapper")
                .setService("service")
                .setServiceImpl("service.impl")
                .setController("controller");
        mpg.setPackageInfo(pc);


        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        /*// 如果模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";*/

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/"
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        //自定义模板，不需要加.ftl (.ftl为freemarker模板)
        templateConfig.setEntity("/templates/entity2.java");
        templateConfig.setMapper("/templates/mapper2.java");
        templateConfig.setService("/templates/service2.java");
        templateConfig.setServiceImpl("/templates/serviceImpl2.java");
        templateConfig.setController("/templates/controller2.java");
        templateConfig.setEntity("/templates/entity2.java");
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库表字段映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //lombok模型
        strategy.setEntityLombokModel(true);
        //设置@RestController 控制器
        strategy.setRestControllerStyle(true);
        // 写于父类中的公共字段
        // strategy.setSuperEntityColumns("id");
        //strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
        strategy.setInclude("ts_user");
        strategy.setControllerMappingHyphenStyle(true);
        //表前缀
        strategy.setTablePrefix("ts_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}
