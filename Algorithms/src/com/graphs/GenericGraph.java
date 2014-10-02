package com.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class GenericGraph {

protected  HashMap<String, List<String>> graph = new HashMap<String, List<String>>();

	
	public HashMap<String,List<String>> getGraph(){
		return graph;
	}
	
	
	public  void makeLink(String nodeA, String nodeB){
		if(!graph.containsKey(nodeA)){
			graph.put(nodeA, new ArrayList<String>());
		}
		if(!graph.get(nodeA).contains(nodeB))
			graph.get(nodeA).add(nodeB);
		
		if(!graph.containsKey(nodeB)){
			graph.put(nodeB, new ArrayList<String>());
		}
		if( ! graph.get(nodeB).contains(nodeA))
			graph.get(nodeB).add(nodeA);
	}
	
	public void printGraph(){
		System.out.print(graph);
	}
	
	public abstract void createGraph();
	
}
