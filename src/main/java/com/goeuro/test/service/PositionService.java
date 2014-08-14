package com.goeuro.test.service;

import com.goeuro.test.exception.GoEuroException;

public interface PositionService {
	
	void exportPositionSearch(String criteria) throws GoEuroException;

}
