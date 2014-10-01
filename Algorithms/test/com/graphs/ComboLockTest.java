package com.graphs;

import org.junit.Assert;
import org.junit.Test;

public class ComboLockTest {

	@Test
	public void shouldCreate4Nodes(){
		ComboLock graph = new ComboLock(4);
		graph.createGraph();
		Assert.assertNotNull(graph.getGraph());
	}
}
