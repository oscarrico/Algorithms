package com.graphs;

import java.util.List;
import java.util.Map;

public class Star extends Graph{
	
	private int nodes;
	
	public Star(int nodes){
		this.nodes = nodes;
	}

	@Override
	public void createGraph() {
		for(int i = 1; i < nodes; i++)
			makeLink(0, i);
	}
	
	public int getNumberEdges(){
		int numberOfNodes = 0 ;
		for (Map.Entry<Integer, List<Integer>> edge : graph.entrySet()){
			numberOfNodes += edge.getValue().size();
		}
		return numberOfNodes / 2;
	}

	
}
