import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public final class App implements CommandLineRunner {

	public static void main(String [] args) {
		SpringApplication.run(App.class, args);
	}

	public void run(String [] args) {
		System.out.println("Hello World!");
	}


}
