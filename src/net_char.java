/**
 * 
 * @author Nainoa Faulkner-Jackson
 * This class represents a single character.
 * A brief summary of the character is stored here.
 */

import java.util.*;

public class net_char {
	
	// Name of the character
	private String name;
	
	// The Race of the character
	// todo: update to use race dropdown as opposed to a string
	private String race;
	
	// List of tags that apply to the character
	private ArrayList<String> tags = new ArrayList<String>();
	
	// A brief under 350 character summary of the character
	private String summary;
	
	// Basic getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name_in) {
		name = name_in;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race_in) {
		race = race_in;
	}
	public String getSummary() {
		return summary;
	}
	public void setSumary(String summary_in) {
		if(summary_in.length() < 350)
			summary = summary_in;
	}
	public ArrayList<String> getTags() {
		return tags;
	}

	public String getTagAtIndex(int i) {
		if (i < tags.size()) {
			return tags.get(i);
		}
		return null;
	}
	
	/**
	 * Attempt to add a tag to the character's tag list
	 * Fails if the input is over 20 characters,
	 * or if the tag is already present.
	 * @param tag_in
	 * @return
	 */
	public boolean addTag(String tag_in) {
		//Check if the tag length is under 20 characters
		if (tag_in.length() < 20) {
			//Check if tag_in is already in tags
			if(!tags.contains(tag_in)) {
				tags.add(tag_in);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check the character for a tag. Remove if present.
	 * @param tag_in
	 * @return
	 */
	public boolean removeTag(String tag_in) {
		//Check if the tag length is under 20 characters
		if (tag_in.length() < 20) {
			//Check if tag_in is already in tags
			if(tags.contains(tag_in)) {
				tags.remove(tag_in);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Overrides .equals method
	 * Note: Unsure if this will work due to typecasting from base object class
	 * @param test_in
	 * @return
	 */
	@Override
	public boolean equals(Object test_in) {
		if (test_in instanceof net_char) {
			if (((net_char) test_in).getName() == name)
				return true;
		}
		return false;
	}
	
	/**
	 * Override toString method to return name
	 */
	@Override
	public String toString() {
		return name;
	}
	
	/**
	 * Construct an instance of a character
	 * @param name_in
	 * @param race_in
	 * @param summary_in
	 * @param tags_in
	 */
	public net_char(String name_in, String race_in, String summary_in, ArrayList<String> tags_in) {
		name = name_in;
		race = race_in;
		summary = summary_in;
		tags = tags_in;
	}
}
