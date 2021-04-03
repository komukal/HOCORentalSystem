package HOCOrent.reservation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import HOCOrent.reservation.domain.Reservation;
import HOCOrent.reservation.domain.ReservationRepository;
import HOCOrent.reservation.domain.User;
import HOCOrent.reservation.domain.UserRepository;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository urepository,ReservationRepository rrepository) {
		return (args) -> {
			urepository.deleteAll();
			rrepository.deleteAll();
			//Reservations for testing
			Reservation res1 = new Reservation(null, "A8", "user", "03.04.2021", "05.04.2021", "12:00", "15:00", false);
			Reservation res2 = new Reservation(null, "A23", "admin", "13.03.2021", "05.06.2021", "16:00", "18:00", false);
			//save temp reservations to memory
			rrepository.save(res1);
			rrepository.save(res2);
			//Temporary users for testing
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			//Save tempo users to memory
			urepository.save(user1);
			urepository.save(user2);

		};
	}
}
