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

}
