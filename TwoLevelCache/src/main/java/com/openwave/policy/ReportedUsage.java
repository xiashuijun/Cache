package com.openwave.policy;

public interface ReportedUsage
{
	public final static String SESSION_KEY = "Session";
	
	public long getInputOctets();
	public long getOutputOctets();
	
}
