package spring.teja;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import spring_boot.teja.Cinema;

@Configuration
@ComponentScan("spring.teja")
@PropertySource("classpath:config.properties")
public class ContextApp {
	
	@Bean
	public Cinema getCinemaInstance() {
		return new Cinema();
	}
}
