/**
 * 
 */
package com.cbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**   
* @Title: IndexController.java 
* @Package com.cbw.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author cbw   
* @date 2017年12月19日 下午3:13:25 
* @version V1.0   
*/

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}

}
