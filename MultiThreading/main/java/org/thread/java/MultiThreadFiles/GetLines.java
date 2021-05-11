package org.thread.java.MultiThreadFiles;

public class GetLines 
{
	private int id;
	
	public GetLines(int id, String prefnum, String lipid, String lcd) {
		
		this.id = id;
		this.prefnum = prefnum;
		this.lipid = lipid;
		this.lcd = lcd;
	}

	@Override
	public String toString() {
		return "GetLines [id=" + id + ", prefnum=" + prefnum + ", lipid=" + lipid + ", lcd=" + lcd + "]";
	}

	private String prefnum;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrefnum() {
		return prefnum;
	}

	public void setPrefnum(String prefnum) {
		this.prefnum = prefnum;
	}

	public String getLipid() {
		return lipid;
	}

	public void setLipid(String lipid) {
		this.lipid = lipid;
	}

	public String getLcd() {
		return lcd;
	}

	public void setLcd(String lcd) {
		this.lcd = lcd;
	}

	private String lipid;
	
	private String lcd;

}
