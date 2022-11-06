package spring.teja;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_boot.teja.Cinema;

public class SpringBootApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextApp.class);
		
//		Fortune fortune = context.getBean("happyFortune",Fortune.class);
//		System.out.println(fortune.getFortune());
		Game game = context.getBean("cricketGame",Game.class);
		Cinema cinema = context.getBean("getCinemaInstance",Cinema.class);
		System.out.println(cinema.getFavouriteCinema());
		System.out.println(game.getFavouritePlayer());
		System.out.println(game.getAvailableFortune());
		System.out.println(game.getPlayingGame());
		context.close();
	}

}
