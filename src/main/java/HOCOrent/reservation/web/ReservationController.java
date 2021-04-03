package HOCOrent.reservation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {
	@RequestMapping(value = "/index")
	public String indexString() {
		return "index";
	}
	
	@RequestMapping(value = "/reservations")
	public String varaus() {
		return "overview";
	}
	
	@RequestMapping(value = "/reservations/reserve")
	public String reserve(Model model) {
		return "reservationForm";
	}
}
