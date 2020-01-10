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
	 * Attempt to add an existing character to the charList
	 * @param char_in
	 * @return
	 */
	public boolean addChar(net_char char_in) {
		if(!charList.contains(char_in)) {
			charList.add(char_in);
			return true;
		}
		return false;
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
		return this.addChar(char_in);
	}
	
	
	/**
	 * 
	 * @param char1:		 Host character
	 * @param char2: 		 Subject character
	 * @param status1: 		 How 1 feels about 2
	 * @param status2: 		 How 2 feels about 1
	 * @param type:			 
	 * 						 0 -> Normal
	 * 						 1 -> Mutual
	 * 						 2 -> One Way
	 * 
	 * @param summary1		 Summary 1 -> 2
	 * @param summary2		 Summary 2 -> 1
	 * @return				 Was the connection added successfully?
	 */
	public boolean addConnection(net_char char1, net_char char2, 
			int status1, int status2, int type,
			String summary1, String summary2) {
		char_connection connection_in = new char_connection(char1, char2, status1, status2, type, summary1, summary2);
		if(!relationList.contains(connection_in)) {
			relationList.add(connection_in);
			return true;
		}
		else
			return false;
	}
}
