package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class test {

	@Mock
	repo rp;
	@InjectMocks
	controller c;
	
	@Test
	void test() {
		List<flight_info>l1=new ArrayList<flight_info>();
		l1.add(new flight_info("bom->goa","12-2-2021","air asia", null));
		when(rp.findflight(null, null)).thenReturn(l1);
		assertEquals(1,c.getdata(null, null).size());
	}

}
