/********************************************************************************
* Al Gore Rhythms 
* Playlist Application Project
*
* This is the backend part. Including the web and data structure logic.
*
* Features:
*   + Autocomplete song, and list top 4 songs based on popularity
*   + List top 8 most popular playlists
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
* @version: 0.8
* @since: November 25, 2015
********************************************************************************/

package algore;

import java.util.HashMap;
import java.util.SortedMap; // TODO(eugenek): Why sorted map?
import java.util.ArrayList;

import org.apache.commons.collections4.trie.PatriciaTrie;

/* 
https://apache.googlesource.com/commons-collections/+/COLLECTIONS_4_0/src/test/java/org/apache/commons/collections4/trie/PatriciaTrieTest.java

https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/trie/PatriciaTrie.html#headMap(K)
*/
// TODO(eugenek): Be nice if could traverse the tree 1 letter at a time.
public class AutocompleteDB {
    public PatriciaTrie<String> _SongTrie;

    public AutocompleteDB() {
        _SongTrie = new PatriciaTrie<String>();
    }

    public void putSong(String song) {
        _SongTrie.put(song, song);
    }

    public SortedMap<String, String> getPrefixMap(String prefix) {
        SortedMap<String, String> map = _SongTrie.prefixMap(prefix);
        return map;
    }

    // TODO(eugenek): Should I really be using ArrayList and not built-in list[]?
    public ArrayList<String> getPrefixList(String prefix) {
        SortedMap<String, String> map = getPrefixMap(prefix);
        ArrayList<String> list = new ArrayList<String>(map.values());
        return list;
    }

}