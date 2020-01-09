/**
 * 
 * @author Nainoa Faulkner-Jackson
 *
 */

import java.util.*;

public class char_connection{
	
	private char_connection_half oneToTwo;
	
	private char_connection_half twoToOne;
	
	public char_connection_half[] getHalves() {
		char_connection_half[] output = new char_connection_half[2];
		output[0] = oneToTwo;
		output[1] = twoToOne;
		return output;
	}
	
	/**
	 * Construct a new two way character connection Relationship types:
	 * 0 -> Normal
	 * 1 -> Mutual (Two way, but all data is copied instead of manually entered)
	 * 2 -> One Directional
	 * @param host_in
	 * @param subject_in
	 * @param starting_status1
	 * @param starting_status2
	 * @param relation_type
	 * @param summary1
	 * @param summary2
	 */
	public char_connection(net_char host_in, net_char subject_in, 
			int starting_status1, int starting_status2, 
			int relation_type, String summary1, String summary2) {
		switch (relation_type) {
		case 0:
			// Normal relationship setup
			oneToTwo = new char_connection_half(host_in, subject_in, starting_status1, summary1);
			twoToOne = new char_connection_half(subject_in, host_in, starting_status2, summary2);
			break;
		case 1:
			// Mutual relationship setup
			oneToTwo = new char_connection_half(host_in, subject_in, starting_status1, summary1);
			twoToOne = new char_connection_half(subject_in, host_in, starting_status1, summary1);
			break;
		case 2:
			// One Directional relationship setup
			oneToTwo = new char_connection_half(host_in, subject_in, starting_status1, summary1);
			twoToOne = null;
		}
	}
}

/**
 * This class represents half of a potential relationship
 * @author Nainoa Faulkner-Jackson
 *
 */
class char_connection_half {
	
	// The host character, or "number 1"
	private static net_char host;
	
	// The Subject character, or "number 2"
	private static net_char subject;
	
	// A value between -10 and 10.
	// Represents the current state of the relationship.
	private ArrayList<Integer> status = new ArrayList<Integer>();
	
	// Contains a log of every summary and event within the relationship.
	private ArrayList<String> summary = new ArrayList<String>();
	
	public net_char getHost() {
		return host;
	}
	
	public net_char getSubject() {
		return subject;
	}
	
	public char_connection_half(net_char host_in, net_char subject_in, int starting_status, String summary_in) {
		host = host_in;
		subject = subject_in;
		status.add(starting_status);
		summary.add(summary_in);
	}
}
