package koulu.ekaTehtava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String handleIndex() {
		return "This is the main page!";
	}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String handleContact() {
		return "This is the contact page!";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String handleHello(@RequestParam(name="location", required=false, defaultValue="moon") String location,
			@RequestParam(name="name", required=false, defaultValue="John") String name) {
		return "Welcome to the " + location + ", " + name + "!";
	}
}
