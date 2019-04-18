package edu.smith.cs.csc212.p8;

import java.util.List;

import org.junit.Test;


public class CharTrieTest {
	@Test
	public void countNodesTest() {
		CharTrie test = new CharTrie();
		List<String> listOfWords = CheckSpelling.loadDictionary();
		for(String word : listOfWords) {
			if(word.startsWith("d")) {
				test.insert(word);
			}
		}
	}
}
