package com.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepthFirstSearch extends GenericGraph {

	private String[][] nodes = { { "a", "g" }, { "a", "d" }, { "d", "g" },
			{ "g", "c" }, { "b", "f" }, { "f", "e" }, { "e", "h" } };
	private HashMap<String, Boolean> markedNodes = new HashMap<String, Boolean>();

	public void createGraph(){
		for(String[] node : nodes){
			makeLink(node[0],node[1]);
		}
	}
	
	public int markNodes(String node){
		markedNodes.put(node, true);
		int totalMarked = 1;
		for(String neighbor: graph.get(node))
			if(markedNodes.get(neighbor) == null){
				totalMarked += markNodes(neighbor);
			}
		return totalMarked;
	}
	
	public static void main(String[] args){
		DepthFirstSearch graph = new DepthFirstSearch();
		graph.createGraph();
		for (Map.Entry<String, List<String>> edge : graph.getGraph().entrySet()){
			if( graph.markedNodes.get(edge.getKey()) == null)
				System.out.println("Graph: "+edge.getKey()+ graph.markNodes(edge.getKey()));
		}
	}
	
	
}
