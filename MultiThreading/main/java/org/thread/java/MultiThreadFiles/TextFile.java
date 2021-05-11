package org.thread.java.MultiThreadFiles;

import java.util.Date;

public class TextFile 
{
	private int id;
	
	private String filename;
	
	private String location;
	
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public TextFile(int id, String filename, String location,Date date) {
		super();
		this.id = id;
		this.filename = filename;
		this.location = location;
		this.date=date;
	}

	@Override
	public String toString() {
		return "TextFile [id=" + id + ", filename=" + filename + ", location=" + location + ", date=" + date + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
