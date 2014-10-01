package com.graphs;

import java.util.List;
import java.util.Map;

//In a Clique graph every node is connected to each other, 
//All nodes are connected. 
public class Clique extends Graph {

	private int numberOfNodes;
	
	public Clique(int numberOfNodes){
		this.numberOfNodes = numberOfNodes;
	}
	
	@Override
	public void createGraph(){
		for(int i =0 ; i < numberOfNodes; i++) {
			for(int j =0; j< numberOfNodes; j++){
				if( i < j)
					makeLink(i, j);
			}
		}
	}
	
	//connections
	public int getNumberOfEdges(){
		int numberOfNodes = 0 ;
		for (Map.Entry<Integer, List<Integer>> edge : graph.entrySet()){
			numberOfNodes += edge.getValue().size();
		}
		return numberOfNodes / 2;
	}
	
}
