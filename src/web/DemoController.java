package web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.User;

import service.IUserService;

@Controller("/demo")
public class DemoController {
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	
	
	@RequestMapping("/list")
	@ResponseBody
	public Map list(){
		Map map = new HashMap();
		map.put("1", "gg");
		map.put("2", "222");
		return map;
	}
	
	@RequestMapping("/testMybatis")
	@ResponseBody
	public User testMybatis(){
		return userService.getUser("123");
	}
}
