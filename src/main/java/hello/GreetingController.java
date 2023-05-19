package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//comentario
@Controller
public class GreetingController {

	// Add a Post Controller to return a List of months
	@PostMapping("/months")
	public @ResponseBody String months() {
		return "January, February, March, April, May, June, July, August, September, October, November, December";
	}

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello World";
	}
}
