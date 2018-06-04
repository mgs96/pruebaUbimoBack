package com.ubimo.mau.app.models;

public class ScoreRange {
  private double lower;
  private double upper;
  private String name;
  
  public ScoreRange() {
  }
  
  public ScoreRange(double lower, double upper, String name) {
	super();
	this.lower = lower;
	this.upper = upper;
	this.name = name;
  }

  public double getLower() {
	return lower;
  }
	
	public void setLower(double lower) {
		this.lower = lower;
	}
	
	public double getUpper() {
		return upper;
	}
	
	public void setUpper(double upper) {
		this.upper = upper;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}