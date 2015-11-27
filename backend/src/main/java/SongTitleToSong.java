/********************************************************************************
* Al Gore Rhythms 
* Playlist Application Project
*
* This is the backend part. Including the web and data structure logic.
*
* Features:
*   + Autocomplete song
*   + List top 8 playlists
*   + Add up to 1024 playlists
*   + Suggest most popular playlist with input song
*   + Restful API
*   + Hackable (separated front end, separated data structures)
*   + Always returns JSON
*   + Efficient
*   + Nice frontend 
*
* @author: Eugene Kolo
* @email: eugene@kolobyte.com
* @version: 0.6
* @since: November 25, 2015
********************************************************************************/

package algore;

import java.util.HashMap;

public class SongTitleToSongMap {
	public HashMap<String, Song> _SongTitleToSongMap;

	public SongTitleToSongMap() {
		_SongTitleToSongMap = new HashMap<String, Song>();
	}

	public void putSong(String songTitle, Song song) {
		_SongTitleToSongMap.put(songTitle, song);
	}

	public Integer getSong(String songTitle) {
		return _SongTitleToSongMap.get(songTitle);
	}
}