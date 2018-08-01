import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class CommandParser {
	
	private String input;
	private SecureRandom random = new SecureRandom();
	private ArrayList<Handful> handfuls;
	
	// constructors
	
	public CommandParser(String input) {
		this.input = input;
		this.handfuls =  parseToHandfuls(input);
		for(Handful h : handfuls) {
			h.rollDice();
		}
	}
	
	// get & set
	
	
	
	
	// other methods
	
	public ArrayList<Handful> parseToHandfuls(String input){
		String[] splitString = input.split("\\+");
		ArrayList<Handful> output = new ArrayList<Handful>();
		for(String s : splitString) {
			Handful h = new Handful(s.trim());
			output.add(h);
		}
		return output;
	}
	
	
}
