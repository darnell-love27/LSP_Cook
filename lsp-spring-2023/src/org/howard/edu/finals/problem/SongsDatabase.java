//Name:Darnell Love
package org.howard.edu.finals.problem;
import java.util.*;

/**
 * 
 * @author Darnell Love
 * This class will be used to keep track of different song titles that are a part of various musical genres.
 */

public class SongsDatabase {
	
	//Private variable used to store the data of the songs and song names
	private Map<String, HashSet<String>> song_map = new HashMap<>();
	
	//Adding song title to type of genre in song_map
	public void addSong(String genre, String songTitle) {
		HashSet<String> new_song = song_map.get(genre);
		//Test to see if new_song is not a null value
		if (new_song == null) {
			//Add new_song to new HashSet 
			new_song = new HashSet<String>();
			//If new then insert into song_map, otherwise replace
			song_map.put(genre, new_song);
			
		}
		//Add the song title 
		new_song.add(songTitle);
	}
	
	public Set<String> getSongs(String genre) {
		//Songs in HashSet
		HashSet<String> current_song = song_map.get(genre);
		if (current_song == null) {
			//Return empty HashSet if songs not a part of genre
			return new HashSet<>();
		}
		//Otherwise return HashSet 
		return current_song;
	}
	
	public String getGenreOfSong(String songTitle) {
		//Iterate through to find the songs of each genre
		for (String genre:song_map.keySet()) {
		//Create new HashSet to access songs from given genre 
			HashSet<String> new_songs = song_map.get(genre);
			//If new_songs has the title -> return genre
			if (new_songs.contains(songTitle)) {
				return genre;
			}
		}
		//If no songs are in the genre -> return null
		return null;
	}
}

