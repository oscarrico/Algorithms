package com.graphs;

import org.junit.Test;
import static org.junit.Assert.*;

public class StarTest {
	
	@Test
	public void shouldCreateStartWith3Nodes(){
		Star star = new Star(3);
		star.createGraph();
		assertEquals(2 , star.getNumberEdges());
	}
	
	@Test
	public void shouldCreateStartWith5Nodes(){
		Star star = new Star(5);
		star.createGraph();
		assertEquals(4 , star.getNumberEdges());
	}

	
	@Test
	public void shouldCreateStartWith10Nodes(){
		Star star = new Star(10);
		star.createGraph();
		assertEquals(9 , star.getNumberEdges());
	}


}
