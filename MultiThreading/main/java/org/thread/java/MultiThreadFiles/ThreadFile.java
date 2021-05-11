package org.thread.java.MultiThreadFiles;

import java.util.List;

public class ThreadFile implements Runnable {
	
	
	private List<TextFile> medicalreport;
	
	ThreadFile( List<TextFile> medicalreport)
	{
		this.medicalreport=medicalreport;
	}

	@Override
	public void run() 
	{
		FileValidation.getInstance().processmedicalreport(medicalreport);
	}
	
	

}
