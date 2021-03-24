package HOCOrent.reservation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {
	@RequestMapping(value = "/index")
	public String indexString() {
		return "index";
	}
	
	@RequestMapping(value = "/varaus")
	public String varaus() {
		return "index";
	}
}
