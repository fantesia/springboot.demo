package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
/**
 * 
* @ClassName: DemoApplication
* @module  : 模块描述
* @comment : 模块包括的子功能
* @Description: SpringBoot启动类 
* @author fanqingqing
* @date 2017年6月19日 下午3:18:31
 */
@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		//SpringApplication用来从java main方法启动一个spring应用
		SpringApplication.run(DemoApplication.class, args);
	}
	/**
	 * 
	 * @Title: containerCustomizer
	 * @Description: 401、404等常见错误 自定义页面
	 * @return    设定文件
	 * @return EmbeddedServletContainerCustomizer    返回类型
	 * @throws
	 * @author fanqingqing
	 * @date 2017年6月19日 下午4:43:28
	*
	 */
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		 return new EmbeddedServletContainerCustomizer() {
		        @Override
		        public void customize(ConfigurableEmbeddedServletContainer container) {
		            ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
		            ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
		            ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
		            container.addErrorPages(error401Page, error404Page, error500Page);
		        }
		    };
	}
}
