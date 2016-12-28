/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * @Desc 访问过滤器
 * @Author feizi
 * @Date 2016/12/20 14:13
 * @Package_name com.feizi.filter
 */
public class AccessFilter extends ZuulFilter {

    private static Logger logger = Logger.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("accessToken");
        if(null == accessToken){
            logger.warn("accessToken is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }

        logger.info("accessToken is ok");
        return accessToken;
    }
}
