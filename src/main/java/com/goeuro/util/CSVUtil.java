package com.goeuro.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVWriter;

import com.goeuro.test.domain.Position;

public class CSVUtil {
	
	public static String FILE_NAME = "positions.csv";
	
	 public static void writeCSVData(List<Position> positions) throws IOException {
		 	StringWriter writer = new StringWriter();
		 	CSVWriter csvOutput = new CSVWriter(new FileWriter(FILE_NAME, false), ',', CSVWriter.NO_QUOTE_CHARACTER);
	        List<String[]> data  = toStringArray(positions);
	        csvOutput.writeAll(data);
	        csvOutput.close();
	    }
	 
    private static List<String[]> toStringArray(List<Position> positions) {
	       List<String[]> records = new ArrayList<String[]>();
	       //add header record
	       records.add(new String[]{"_type","_id","name","type", "latitude", "longitude"});
	       Iterator<Position> it = positions.iterator();
	       while(it.hasNext()){
	           Position position= it.next();
	           records.add(new String[]{position.getPositionType(),position.getId(), position.getName(), position.getType(), position.getLatitude(), position.getLongitude()});
	       }
	        return records;
	}

}
