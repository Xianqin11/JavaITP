package de.tum.cit.ase;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

	private static final Random random = new Random();

	public static void main(String[] args) {
		// TODO PART 1 WITHOUT INTERROGATOR TACTICS
		// Scanner scanner = new Scanner(in);
		// Penguin alice = new Penguin("Alice");
		// Penguin bob = new Penguin("Bob");

		// Print a welcome message
		// out.println("Welcome to the Cuff 'n' Fluff");

		// Ask from Alice
		// out.println("Do you want to betray (B) Bob or be silent (S)?");
		// String choiceAlice = scanner.nextLine();
		// while (!choiceAlice.equals("B") && !choiceAlice.equals("S")) {
		// 	choiceAlice = scanner.nextLine();
		// }
		// alice.setChoice(choiceAlice);

		// out.println("Alice chose to " + turnChoiceIntoSentence(choiceAlice) + ": " + choiceAlice);

		// Bob answers: 0 = Betray, 1 = Silent
		// bob.setChoice(generateRandomChoice());
		// out.println("Bob chose to " + turnChoiceIntoSentence(bob.getChoice()) + ": " + bob.getChoice());

		// Interrogator interrogates Alice and Bob
		// Interrogator interrogator = new Interrogator("Sherlock Holmes");
		// interrogator.setTactic(generateRandomInterrogationStyle());
		// InterrogationRoom interrogationRoom = new InterrogationRoom(interrogator);
		// interrogationRoom.interrogate(alice, bob);

		// out.println("Alice gets " + alice.getPrisonTime() + " years and Bob gets " + bob.getPrisonTime() + " years in prison.");

		// TODO: PART 2 WITH INTERROGATOR TACTICS
		// Interrogator decides the employ tactics during the interrogation
		// if (alice.getChoice().equals("B") && bob.getChoice().equals("B")) {
		// 	out.println("Interrogator is happy with the result and decides not to use tactics.");
		//	return;
		// } else {
		//	out.println("Interrogator was not so happy with the result and decides to use tactics.");
		// }

		// out.println("Would you like to change your choice? (Y/N)");
		// String changeChoice = scanner.nextLine();
		// while (!changeChoice.equals("Y") && !changeChoice.equals("N")) {
		//	changeChoice = scanner.nextLine();
		// }

		// if (changeChoice.equals("Y")) {
		//	alice.setChoice(changeChoiceIfYes(choiceAlice));
		// }

		// bob.setChoice(generateRandomChoice());

		// Interrogator uses tactics to change the prison time
		// interrogationRoom.interrogate(alice, bob);
		// interrogationRoom.interrogatorUsesTactics(alice, bob);

		// Alice chooses again
		// out.println("Alice chose to " + turnChoiceIntoSentence(alice.getChoice()) + ": " + alice.getChoice());

		// Bob chooses again
		// out.println("Bob chose to " + turnChoiceIntoSentence(bob.getChoice()) + ": " + bob.getChoice());

		// out.println("Interrogator " + interrogator.getName() + " employs " + (interrogator.getTactic().equals("O") ? "offer deal" : "aggressive") + " tactic.");

		// out.println("After the interrogation with tactics Alice gets " + alice.getPrisonTime() + " years and Bob gets " + bob.getPrisonTime() + " years in prison.");
	}

	private static String turnChoiceIntoSentence(String choice) {
		if (choice.equals("B")) {
			return "betray";
		}
		return "be silent";
	}

	public static String changeChoiceIfYes(String choiceAlice) {
		if (choiceAlice.equals("B")) {
			return "S";
		}
		return "B";
	}


	public static String generateRandomChoice() {
		int randomResult = random.nextInt(2);
		if (randomResult == 0) {
			return "B";
		}
		return "S";
	}

	public static String generateRandomInterrogationStyle() {
		int randomResult = random.nextInt(2);
		String[] interrogationStyles = {"O", "A"};
		return interrogationStyles[randomResult];
	}
}