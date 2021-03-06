package com.goeuro.test.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.goeuro.test.dao.PositionDAO;
import com.goeuro.test.domain.Position;
import com.goeuro.test.exception.GoEuroException;
import com.goeuro.test.exception.RemoteResourceException;
import com.goeuro.test.exception.ResultNotFoundException;

@Repository
public class PositionDAOImpl implements PositionDAO {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<Position> getPositions(String url) throws GoEuroException {
		Position[] positions =null;
		try{
			 positions = restTemplate.getForObject(url, Position[].class);
			
		}catch(Exception ex){
			throw new RemoteResourceException("there was a problem try to fetch the data from the remote resource.");
		}
		
		if(positions!=null && positions.length >0){
			return Arrays.asList(positions);		
		}else{
			throw new ResultNotFoundException("any result was found for your criteria, please try another one.");
		}
		
			
	}
	
}
