package engine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
	
	@RequestMapping("/about")
	public About about() {
		return new About();
	}

}
