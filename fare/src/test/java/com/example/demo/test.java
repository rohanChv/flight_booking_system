package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class test {

	@Mock
	repo rp;
	@InjectMocks
	controller c;
	
	@Test
	void test(){
		List<fare>l1=new ArrayList<fare>();
		l1.add(new fare("cv", "y", "a", "b", "v", "d", "e"));
		when(rp.getinfo("cv")).thenReturn(l1);
		assertEquals(1,c.getfare("cv").size());
	}
}
