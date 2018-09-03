package com.capgemini.day4.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day4.SalesManager;
import com.capgemini.day4.*;
class EmployeeTest {

	
	@Test
	void testSales() {
		//fail("Not yet implemented");
		assertEquals(870.5, new SalesManager(1000, 1234, "sameera").calculateNetSalary(),0.3);
		assertEquals(2694.3,new President(1000,3345,"priya",8).calculateNetSalary(),0.2);
	}

}
