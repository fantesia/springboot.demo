package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
/**
 * 
* @ClassName: ThymeleafConfig
* @module  : 模块描述
* @comment : 模块包括的子功能
* @Description: 模板配置类 
* @author fanqingqing
* @date 2017年6月19日 下午3:58:10
 */
@Configuration
public class ThymeleafConfig {
	@Autowired
    private SpringTemplateEngine templateEngine;
	
	public void init() {
	        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
	        // 设置模板的前置路径
	        resolver.setPrefix("/");
	        //设置模板统一的后缀名
	        resolver.setSuffix(".html");
	        resolver.setTemplateMode("LEGACYHTML5");
	        resolver.setOrder(templateEngine.getTemplateResolvers().size());
	        templateEngine.addTemplateResolver(resolver);
	    }
}
