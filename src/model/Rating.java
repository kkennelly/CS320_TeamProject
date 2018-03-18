package model;

public class Rating {
	
	private int rate;
	private String comment;
	
	public Rating () {
		
	}
	
	public Rating (int rate, String comment) {
		this.rate = rate;
		this.comment = comment;
	}
	
	public void setRate(int rate) { this.rate = rate; }
	public int getRate() { return rate; }
	
	public void setComment(String comment) { this.comment = comment; }
	public String getComment() { return comment; }
}
