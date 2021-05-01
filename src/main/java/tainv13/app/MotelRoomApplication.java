package tainv13.app;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MotelRoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotelRoomApplication.class, args);
// 		refeshServer();
	}

	public static void refeshServer() {
		new Thread(() -> {
			try {
				LocalDateTime now = LocalDateTime.now();
				while (true) {
					now = LocalDateTime.now();
					if ((now.getMinute() == 10 || now.getMinute() == 30 || now.getMinute() == 50)
							&& now.getSecond() == 0) {
						System.out.println("Refesh Server");
						continue;
					}
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}).start();
	}
}
