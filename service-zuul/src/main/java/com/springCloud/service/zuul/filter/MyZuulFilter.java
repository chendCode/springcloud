package com.springCloud.service.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;


@Component
public class MyZuulFilter extends ZuulFilter {
	
	private Logger logger = LoggerFactory.getLogger(MyZuulFilter.class);
	
/**
	shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
 */
	@Override
	public boolean shouldFilter() { 
		/* 
		 * true 表示进行拦截
		 * false 表示不进行拦截
		 */
		return true;
	}

	/**
	 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
	 */
	//拦截器业务处理
	@Override
	public Object run() {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request =  context.getRequest();
		logger.info("http请求方式 method = {},url = {}", request.getMethod(),request.getRequestURI());
		
		
		return null;
	}

	
	//设置拦截器类型
	@Override
	public String filterType() {
		/**
		  	filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下： 
			pre：路由之前
			routing：路由之时
			post： 路由之后
			error：发送错误调用
		 */
		return "pre";
	}
	//设置拦截器顺序
	@Override
	/**
	 * filterOrder：过滤的顺序
	 */
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
