package com.graphs;

public class ComboLock extends Graph {
	
	private int nodes;
	
	public ComboLock(int nodes){
		this.nodes = nodes;
	}

	@Override
	public void createGraph() {
		for(int i = 1; i < nodes; i++)
			makeLink(0, i);
		for(int i = 1 ; i< nodes-1; i++)
			makeLink(i,i+1);
	}
		
	
	

}
