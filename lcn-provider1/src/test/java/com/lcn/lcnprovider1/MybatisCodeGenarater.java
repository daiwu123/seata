package com.lcn.lcnprovider1;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MybatisCodeGenarater {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        projectPath = projectPath.contains("lcn-consumer")? projectPath:projectPath+"/lcn-consumer";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("");
        gc.setOpen(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/z-dingdan-server?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=Asia/Shanghai");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("");
        //pc.setModuleName("");
        pc.setEntity("com.lcn.lcnconsumer.entity");
        pc.setMapper("com.lcn.lcnconsumer.dao");
        pc.setService("com.lcn.lcnconsumer.service");
        pc.setServiceImpl("com.lcn.lcnconsumer.service.impl");
        pc.setController("com.lcn.lcnconsumer.controller");
        //pc.setXml("com.cloud.demo.bkuncunserver.mapper");
        mpg.setPackageInfo(pc);



        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();



        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);

        String table="lcn_dd";
        strategy.setInclude(table.split(","));
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
