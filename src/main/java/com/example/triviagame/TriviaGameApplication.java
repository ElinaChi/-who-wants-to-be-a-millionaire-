package com.example.triviagame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.triviagame.engine.TriviaAdmin;
//import com.example.triviagame.engine.TriviaGame;
//import com.example.triviagame.service.QuestionService;

@SpringBootApplication
public class TriviaGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(TriviaGameApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(TriviaAdmin triviaAdmin, TriviaGame triviaGame, QuestionService questionService){
//		return args -> {
//			List<Question> questions;
//			questions = new ArrayList<>(Arrays.asList(
//					new Question(100, 1, "Which of these is not a country in Africa?",
//							new HashSet<>(Arrays.asList(new Answer("Ecuador", true, "A"), new Answer("Benin", false, "B"),
//									new Answer("Mali", false, "C"), new Answer("Ghana", false, "D")))),
//
//					new Question(100, 1, "How many sides on a heptagon?",
//							new HashSet<>(Arrays.asList(new Answer("6", false, "A"), new Answer("10", false, "B"),
//									new Answer("3", false, "C"), new Answer("7", true, "D")))),
//
//					new Question(250, 2, "Humans and chimpanzees share roughly how much DNA?",
//							new HashSet<>(Arrays.asList(new Answer("98%", false, "A"), new Answer("77%", false, "B"),
//									new Answer("100%", true, "C"), new Answer("0%", false, "D")))),

//			questions.forEach(questionService::save);
//			log.debug("[{}] questions saved...", questions);
//
//			Scanner scanner = new Scanner(System.in);
//			boolean gameMenuRunning = true;
//			do {
//				System.out.println("Enter [START] to start the game or [EXIT] to quit...");
//				String response = scanner.nextLine();
//				if (response.equalsIgnoreCase("START")) {
//					triviaGame.start();
//				} else if (response.equalsIgnoreCase("ADMIN")) {
//					triviaAdmin.start();
//				} else if (response.equalsIgnoreCase("EXIT")) {
//					System.out.println("Bye, bye!");
//					gameMenuRunning = false;
//				} else {
//					System.out.println("Enter [START] to start the game or [EXIT] to quit...");
//				}
//
//			} while (gameMenuRunning);
//			log.info("Game shutdown...");
//		};
}
//
//
//
