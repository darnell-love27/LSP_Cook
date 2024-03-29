package org.howard.edu.finals.problem;

//Import Statements
import java.util.Set;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;


public class SongDatabaseTest {

	private SongsDatabase song_base;
	
	@Before
	public void newSongDatabase() {
		song_base = new SongsDatabase();
	}
	
	@Test
	@DisplayName("Test addition of songs")
	//Test Cases for AddSong()
	public void testAddSong() {
		//Test 1:Add a singular song
		song_base = new SongsDatabase();
		song_base.addSong("R&B", "Good Days");
		Set<String> new_song = song_base.getSongs("R&B");
		assertEquals(1, new_song.size());
		assertTrue(new_song.contains("Good Days"));
		
		//Test 2:Adding to already in genre
		song_base.addSong("R&B", "Flowers");
		new_song = song_base.getSongs("R&B");
		assertTrue(new_song.contains("Flowers"));
		assertTrue(new_song.contains("Good Days"));
		
		//Test 3:Adding song to new genre
		song_base.addSong("Hip Hop", "Ms.Jackson");
		Set<String> hipsongs = song_base.getSongs("Hip Hop");
		assertFalse(hipsongs.contains("Good Days"));
		
	}
	
	@Test
	@DisplayName("Test to get songs")
	public void testGetSongs() {
		song_base = new SongsDatabase();
		//Test 1:Get 2 songs in genre
		song_base.addSong("Hip Hop", "OPP");
		song_base.addSong("Hip Hop", "Slow Down");
		Set<String> hipsongs = song_base.getSongs("Hip Hop");
		assertEquals(2, hipsongs.size());
		assertTrue(hipsongs.contains("OPP"));
		
		//Test 2:Get 2 songs in 2 genre
		song_base.addSong("Pop", "Watermelon Sugar");
		song_base.addSong("Pop", "Dynamite");
		song_base.addSong("HipHop", "Ice Ice Baby");
		song_base.addSong("HipHop", "The Message");
		Set<String> popsongs = song_base.getSongs("Pop");
		Set<String> hipsongs2 = song_base.getSongs("HipHop");
		assertTrue(popsongs.contains("Dynamite"));
		assertTrue(hipsongs2.contains("Ice Ice Baby"));
		assertTrue(popsongs.contains("Watermelon Sugar"));
		assertTrue(hipsongs2.contains("The Message"));
	}
	
	@Test
	@DisplayName("Test to get genre of song")
	public void testGetGenreOfSong(){
		song_base = new SongsDatabase();
		
		//Test 1: Check for no items
		assertEquals(null, song_base.getGenreOfSong("Rock"));
		
		//Test2:
		song_base.addSong("Classical", "Clair de lune");
		song_base.addSong("Hip Hop", "Lose Yourself");
		song_base.addSong("Blues", "Crazy Blues");
		String new_genre = song_base.getGenreOfSong("Crazy Blues");
		assertEquals("Blues", new_genre);
		new_genre = song_base.getGenreOfSong("Clair de lune");
		assertEquals("Classical", new_genre);
		new_genre = song_base.getGenreOfSong("Lose Yourself");
		assertEquals("Hip Hop", new_genre);
		
	}

}
