package org.irri.statistics.client;

import com.google.gwt.core.client.JavaScriptObject;




public class WRS_filters extends JavaScriptObject{

	protected WRS_filters() {}
	
	public final native String getCode()/*-{ return this.code; }-*/;
	public final native String getItem()/*-{ return this.item; }-*/;
	
	public static class CountryStat implements java.lang.Comparable<CountryStat>{
		private String country;
		private int year;		
		private float[] values;
		
		@Override
		public int compareTo(CountryStat o) {
			return 0;
		}
		
		public CountryStat(String countryname, int yr, float[] varvalues){
			country = countryname;
			year = yr;
			values = varvalues;
		}
		
		public String getCountry(){
			return country;
		}
		
		public int getYear(){
			return year;
		}
		
		public float getVarValue(int i){
			return values[i];
		}
		
		public void setCountry(String cntry){
			country = cntry;
		}
		
		public void setYear(int yr){
			year = yr;
		}
		
		public void setVarValue(int idx, float val){
			values[idx]=val;
		}

	}
}
