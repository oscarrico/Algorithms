package com.graphs;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;


public class CliqueTest {
	
	private Clique clique;
		
	@Test
	public void testFiveNodes() {
		clique = new Clique(5);
		clique.createGraph();
		HashMap<Integer,List<Integer>> graph = clique.getGraph();
		assertEquals(graph.size(), 5);
		assertEquals(10, clique.getNumberOfEdges());
	}
	
	
	@Test
	public void test() {
		clique = new Clique(9);
		clique.createGraph();
		HashMap<Integer,List<Integer>> graph = clique.getGraph();
		//assertEquals(graph.size(), 5);
		assertEquals(36, clique.getNumberOfEdges());
	}
	
	
	@Test
	public void testSeven() {
		clique = new Clique(7);
		clique.createGraph();
		HashMap<Integer,List<Integer>> graph = clique.getGraph();
		//assertEquals(graph.size(), 5);
		assertEquals(21, clique.getNumberOfEdges());
	}

}
