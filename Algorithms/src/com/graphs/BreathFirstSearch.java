package com.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BreathFirstSearch extends GenericGraph {
	
	private LinkedList<String> currentNodes = new LinkedList<String>();
	private HashMap<String, List<String>> markedNodes;

	private String[][] nodes = { { "a", "g" }, { "a", "d" }, { "d", "g" },
			{ "g", "c" }, { "b", "f" }, { "f", "e" }, { "e", "h" } };

	public void createGraph(){
		for(String[] node : nodes){
			makeLink(node[0],node[1]);
		}
	}
	
	public List<String> path(String nodeA, String nodeB){
		markedNodes = new HashMap<String, List<String>>();
		String currentNode = nodeA;
		currentNodes.add(currentNode);
		List<String> list = new ArrayList<String>();
		list.add(currentNode);
		markedNodes.put(currentNode, list);
		while(!currentNodes.isEmpty()){
			currentNode = currentNodes.poll();
			for(String node: graph.get(currentNode)){
				if(!markedNodes.containsKey(node)){
					List<String> visitedNodes = markedNodes.get(currentNode);
					visitedNodes.add(node);
					markedNodes.put(node, visitedNodes);
					currentNodes.add(node);
					if(node.equals(nodeB))
						return markedNodes.get(node);
					
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		BreathFirstSearch g = new BreathFirstSearch();
		g.createGraph();
		System.out.println(g.path("a","b"));
		System.out.println(g.path("a","c"));
	}

}
