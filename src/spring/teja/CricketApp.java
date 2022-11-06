package spring.teja;

import org.springframework.stereotype.Component;

@Component
public class CricketApp implements Toss {
	
	public CricketApp() {
		System.out.println(">>>Exeecuting the Cricket Toss Method.....");
	}

	@Override
	public String toss() {
		return "The Toss was heads";
	}

}
