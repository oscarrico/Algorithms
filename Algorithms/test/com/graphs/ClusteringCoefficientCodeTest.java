package com.graphs;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClusteringCoefficientCodeTest {
	
	@Test
	public void test(){
		ClusteringCoefficientCode graph = new ClusteringCoefficientCode();
		graph.createGraph();
		graph.printGraph();
		assertNotNull(graph.getGraph());
		assertEquals(0.333f, graph.clusteringCoefficient("ORD"),3);
	}

}
