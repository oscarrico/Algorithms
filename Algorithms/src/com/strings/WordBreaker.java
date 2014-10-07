package com.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
//
//For example, given
//s = "leetcode",
//dict = ["leet", "code"].
//
//Return true because "leetcode" can be segmented as "leet code".

public class WordBreaker {

	private Set<String> dictionary = new HashSet<String>();
	private Map<String, Boolean> found;
	private Map<String, Boolean> notFound;

	public Set<String> wordBreak(String s) {
		found = new HashMap<String, Boolean>();
		notFound = new HashMap<String, Boolean>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String current = s.substring(i, j);
				if (!found.containsKey(current) && !notFound.containsKey(current)) {
					for (String word : dictionary) {
						if (word.equals(current)) {
							found.put(current, true);
							break;
						}
					}
					notFound.put(current, true);
				}
			}
		}
		return found.keySet();
	}
	
	public static void main(String[] args){
		WordBreaker breaker = new WordBreaker();
//		breaker.dictionary.add("leet");
//		breaker.dictionary.add("code");
//		System.out.println(breaker.wordBreak("leetcode"));
		
		breaker.dictionary.add("programcree");
		breaker.dictionary.add("program");
		breaker.dictionary.add("creek");
		System.out.println(breaker.wordBreak("programcreek"));

	}
}
