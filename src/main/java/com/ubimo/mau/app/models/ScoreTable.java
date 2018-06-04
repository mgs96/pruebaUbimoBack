package com.ubimo.mau.app.models;

import java.util.ArrayList;

public class ScoreTable {
  private ArrayList<ScoreRange> ranges;
  private String identifier;
  
  public boolean isValid() {
	  double lowestBound = 1;
	  double highestBound = 5;
	  double lowestBoundFound = ranges.get(0).getLower();
	  double highestBoundFound = ranges.get(0).getUpper();
	  for(ScoreRange sr: ranges) {
		  if (sr.getLower() < lowestBoundFound) {
			  lowestBoundFound = sr.getLower();
		  }
		  if (sr.getUpper() > highestBoundFound) {
			  highestBoundFound = sr.getUpper();
		  }
	  }
	  if(lowestBoundFound == lowestBound && highestBoundFound == highestBound) {
		  return true;
	  } else {
		  return false;
	  }
  }
  
  public void roundBounds() {
	  for(ScoreRange sr: this.ranges) {
		  sr.setLower(round(sr.getLower(), 2));
		  sr.setUpper(round(sr.getUpper(), 2));
	  }
  }
  
  public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
  }

public ScoreTable() {
	  
  }
public ScoreTable(ArrayList<ScoreRange> ranges, String identifier) {
	this.ranges = ranges;
	this.identifier = identifier;
}
public ArrayList<ScoreRange> getRanges() {
	return ranges;
}
public void setRanges(ArrayList<ScoreRange> ranges) {
	this.ranges = ranges;
}
public String getIdentifier() {
	return identifier;
}
public void setIdentifier(String identifier) {
	this.identifier = identifier;
}

@Override
public String toString() {
	return "ScoreTable [ranges=" + ranges + ", identifier=" + identifier + "]";
}


}
