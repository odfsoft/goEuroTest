package com.goeuro.test.service;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.goeuro.test.exception.GoEuroException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml"})
public class PositionServiceTest {

	
	@Autowired
	private PositionService positionService;
	
	@Test
	public void getPositionTestShouldCreateFile() throws GoEuroException{
		positionService.exportPositionSearch("test");	
		boolean isFileCreated = new File("positions.csv").exists();
		Assert.assertTrue("file should be create for this criteria.", isFileCreated);
	}
	
}
