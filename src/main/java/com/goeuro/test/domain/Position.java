package com.goeuro.test.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Position {
	/*
	 * _type, _id, name, type, latitude,longitude
	 */
	
	@JsonProperty("_type")
    private String positiontype;
	
	@JsonProperty("_id")
    private String id;
    
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String type;
    
	@JsonProperty("geo_position")
    private GeoPosition geoPosition;
    
    public Position() {
	}
    
    public String getPositionType() {
		return positiontype;
	}
    
    public void setPositionType(String positiontype) {
		this.positiontype = positiontype;
	}
    
    public String getId() {
		return id;
	}
    
    public void setId(String id) {
		this.id = id;
	}
    
    public String getName() {
		return name;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    
    public String getType() {
		return type;
	}
    
    public void setType(String type) {
		this.type = type;
	}
    
    public String getLongitude(){
    	if(geoPosition!=null){
    		return geoPosition.getLongitude();
    	}
    	return null;
    }
    
    public String getLatitude(){
    	if(geoPosition!=null){
    		return geoPosition.getLatitude();
    	}
    	return null;
    }
    
    public GeoPosition getGeoPosition() {
		return geoPosition;
	}
    
    public void setGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
	}   
    
    
}
