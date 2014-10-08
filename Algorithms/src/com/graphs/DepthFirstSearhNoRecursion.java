package com.graphs;

import java.util.HashMap;
import java.util.Stack;

public class DepthFirstSearhNoRecursion extends GenericGraph {

	private HashMap<String, Boolean> markedNodes = new HashMap<String, Boolean>();
	private Stack<String> currentNodes = new Stack<String>();

	private String[][] nodes = { { "a", "g" }, { "a", "d" }, { "d", "g" },
			{ "g", "c" }, { "b", "f" }, { "f", "e" }, { "e", "h" } };

	public void createGraph(){
		for(String[] node : nodes){
			makeLink(node[0],node[1]);
		}
	}

	public void checkConnection(String nodeA, String nodeB) {
		markedNodes.put(nodeA, true);
		currentNodes.push(nodeA);
		while (!currentNodes.isEmpty()) {
			String currentNode = currentNodes.pop();
			for (String node : graph.get(currentNode)) {
				if(!markedNodes.containsKey(node)){
					markedNodes.put(node, true);
					currentNodes.push(node);
				}
			}
		}
		System.out.println(markedNodes.containsKey(nodeB));
	}
	
	public static void main(String[] args){
		DepthFirstSearhNoRecursion graph = new DepthFirstSearhNoRecursion();
		graph.createGraph();
		graph.checkConnection("a", "b");
		graph.checkConnection("a", "c");
		graph.checkConnection("h", "b");
		
	}
}
