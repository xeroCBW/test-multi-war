/**
 * 
 */
package com.cbw.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: TestController.java
 * @Package com.cbw.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author cbw
 * @date 2017年12月19日 下午2:29:34
 * @version V1.0
 */

@Controller
@RequestMapping(value = "/test")
public class TestController {

	// 设置logger
	protected final Log logger = LogFactory.getLog(getClass());

	// 返回对象为json
	@RequestMapping(value = "/hello")
	@ResponseBody
	public Object test() {

		
		logger.info("this is  hello info  log");
		logger.debug("this is hello debug  log...");
		logger.error("this is hello error  log...");
		
		return "test";
	}

}
