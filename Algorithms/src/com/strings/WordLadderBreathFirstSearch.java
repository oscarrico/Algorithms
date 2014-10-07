package com.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordLadderBreathFirstSearch {
	private LinkedList<String> queue;
	private List<String> path;
	private Set<String> dictionary = new HashSet<String>();
	
	public List<String> findPath(String start, String end){
		queue = new LinkedList<String>();
		path = new ArrayList<String>();
		queue.add(start);
		path.add(start);
		while(!queue.isEmpty()){
			String current = queue.poll();
			
			if(end.equals(current))
				break;
			
			 for(int i=0; i< current.length(); i++){
				   
	                char[] currCharArr = current.toCharArray();
	                for(char c='a'; c<='z'; c++){
	                    currCharArr[i] = c;
	                    String newWord = new String(currCharArr);
	                    
	                    if(dictionary.contains(newWord)){
	                    	queue.add(newWord);
	                    	path.add(newWord);
	                    	dictionary.remove(newWord);
	                    
	                    	current = newWord;
	                    }
	                }
	            
			 }
			
			
		}
		return path;
	}
	
	public static void main(String[] args){
		WordLadderBreathFirstSearch search = new WordLadderBreathFirstSearch();
		search.dictionary.add("hot");
		search.dictionary.add("dot");
		search.dictionary.add("dog");
		search.dictionary.add("lot");
		search.dictionary.add("log");
		
		System.out.println(search.findPath("hit","cog"));
		
	}

}
