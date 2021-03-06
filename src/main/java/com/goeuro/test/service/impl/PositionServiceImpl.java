package com.goeuro.test.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.goeuro.test.dao.PositionDAO;
import com.goeuro.test.domain.Position;
import com.goeuro.test.exception.CSVCreationException;
import com.goeuro.test.exception.GoEuroException;
import com.goeuro.test.service.PositionService;
import com.goeuro.util.CSVUtil;

@Component
public class PositionServiceImpl implements PositionService{

	private static final Log logger = LogFactory.getLog(PositionServiceImpl.class);
	
	@Value("${com.goeuro.api.url}")
	private String apiUrl;
	
	@Autowired
	private PositionDAO positionDAO;
	
	@Override
	public void exportPositionSearch(String criteria) throws GoEuroException {
		List<Position> positions = positionDAO.getPositions(buildSearchUrl(criteria));
		logger.info("Positions found: " + positions.size());
		try {
			CSVUtil.writeCSVData(positions);
		} catch (IOException e) {
			throw new CSVCreationException("there was an error trying to create the csv file.");
		}
	}

	private String buildSearchUrl(String criteria) {
		String url = apiUrl+criteria;
		logger.debug("url to be processed: " + url);
		return apiUrl+criteria;
	}

}
