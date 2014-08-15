package com.goeuro.test.dao;
import java.util.List;

import com.goeuro.test.domain.Position;
import com.goeuro.test.exception.GoEuroException;


public interface PositionDAO {
	
	List<Position> getPositions(String url) throws GoEuroException;
}
