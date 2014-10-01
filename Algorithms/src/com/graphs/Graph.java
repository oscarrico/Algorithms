package com.graphs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public abstract class Graph {
	
	
	protected  HashMap<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();

	
	public HashMap<Integer,List<Integer>> getGraph(){
		return graph;
	}
	
	
	public  void makeLink(Integer nodeA, Integer nodeB){
		if(!graph.containsKey(nodeA)){
			graph.put(nodeA, new ArrayList<Integer>());
		}
		if(!graph.get(nodeA).contains(nodeB))
			graph.get(nodeA).add(nodeB);
		
		if(!graph.containsKey(nodeB)){
			graph.put(nodeB, new ArrayList<Integer>());
		}
		if( ! graph.get(nodeB).contains(nodeA))
			graph.get(nodeB).add(nodeA);
	}
	
	public abstract void createGraph();
}
