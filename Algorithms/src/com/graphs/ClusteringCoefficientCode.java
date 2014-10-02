package com.graphs;

import java.util.List;
import java.util.Map;

public class ClusteringCoefficientCode extends GenericGraph{
	
	private String [][]nodes = {{"ORD", "SEA"}, {"ORD", "LAX"}, {"ORD", "DFW"}, {"ORD", "PIT"},
	                            {"SEA", "LAX"}, {"LAX", "DFW"}, {"ATL", "PIT"}, {"ATL", "RDU"},
	                            {"RDU", "PHL"}, {"PIT", "PHL"}, {"PHL", "PVD"}};

	
	public void createGraph(){
		for(String[] node : nodes){
			makeLink(node[0],node[1]);
		}
	}
	
	
	public float clusteringCoefficient(String node){
		float links = 0;
		List<String> neighbors = graph.get(node);
		if (neighbors.size() == 1)
			return 0.0f;
		
		for (String w : neighbors){
			for(String u : neighbors)
				if( graph.get(w).contains(u))
					links += 0.5f;
		}
		return 2.0f*links/(neighbors.size()*(neighbors.size()-1));
	}

}
