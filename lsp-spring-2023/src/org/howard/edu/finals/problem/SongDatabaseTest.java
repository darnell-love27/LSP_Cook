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
	}

}
