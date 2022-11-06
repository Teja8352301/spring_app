package spring.teja;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CricketGame implements Game {
	
	private Fortune fortune;
	
	@Value("${favourite_player}")
	private String favouritePlayer;
	
	@Autowired
	public void setFortune(Fortune fortune) {
		System.out.println("Setting Dependency Methods......");
		this.fortune = fortune;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Executing the post construct Method.....");
	}
	
	@PreDestroy
	public void preDestory() {
		System.out.println("Executing the pre destory method........");
	}
	
	public String getFavouritePlayer() {
		return favouritePlayer;
	}
	
	public String getAvailableFortune() {
		return fortune.getFortune();
	}

	@Override
	public String getPlayingGame() {
		return "I'm Playing Cricket";
	}
}
