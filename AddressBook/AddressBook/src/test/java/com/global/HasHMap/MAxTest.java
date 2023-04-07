package com.global.HasHMap;

import static org.junit.Assert.*;

import org.junit.Test;

public class MAxTest {

	@Test
	public void testFindMax() {
		assertEquals(4,MAx.findMax(new int[]{1,3,4,2}));
	}

}
