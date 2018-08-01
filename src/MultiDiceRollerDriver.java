import java.util.ArrayList;

public class MultiDiceRollerDriver {

	public static void main(String[] args) {
		
		CommandParser parser = new CommandParser("2d10.hits(5) + 6d4.maximize(2) + 2d100");
		
//		CommandParser parser = new CommandParser();
//		
//		ArrayList<String> manyDice = parser.parseInput("2d10.hits(5) + 6d4.maximize(2) + 2d100");
//		
//		for(String s : manyDice) {
//			ArrayList<String> oneDie = parser.parseSingle(s);
//			parser.rollDie(oneDie.get(0));
//		}
		
//		ArrayList<String> oneDie = parser.parseSingle("2d10.hits(5)");
//		ArrayList<Integer> roll = parser.rollDie(oneDie.get(0));

	}

}
