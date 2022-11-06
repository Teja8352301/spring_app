package spring.teja;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

	@Override
	public String getFortune() {
		return "Have a Happy Weekend";
	}

}
