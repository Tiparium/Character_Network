/**
 * Holds every created character, and all of their corresponding connections
 * @author Nainoa Faulkner-Jackson
 *
 */

import java.util.*;

public class fullnetwork {
	
	//Full list of every character
	private ArrayList<net_char> charList = new ArrayList<net_char>();
	
	//Full list of all available relationships
	private ArrayList<char_connection> relationList = new ArrayList<char_connection>();
	
	//Retrieve the list of characters
	public ArrayList<net_char> getChars(){
		return charList;
	}
	
	//Retrieve the list of relationships
	public ArrayList<char_connection> getRelations(){
		return relationList;
	}
	
	/**
	 * Attempt to create a new character and add them to the charList
	 * Returns false if there is already an identical instance
	 * @param name_in
	 * @param race_in
	 * @param summary_in
	 * @param tags_in
	 * @return
	 */
	public boolean newChar(String name_in, String race_in, String summary_in, ArrayList<String> tags_in) {
		net_char char_in = new net_char(name_in, race_in, summary_in, tags_in);
		if(!charList.contains(char_in)) {
			charList.add(char_in);
			return true;
		}
		return false;
	}
}
