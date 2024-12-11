
package com.crm.utility;


import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class VtigerUtility
{
	public static String credentials(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\qspiders\\com.crm.finalMock\\src\\test\\resources\\VTproperty");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}
	
	public static String randomData(String key)
	{
		Random r=new Random();
		int num=r.nextInt(1000);
		String data1=String.valueOf("ShriLaptops_"+num);
		
		return data1;
	}
	
	public static String startDate(String key)
	{
		     Date date=new Date();
			
			SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd");
			String currentDate=sim.format(date);
			
			return currentDate;
	}
	public static String endDate( String key) {
		startDate(key);
		SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal=sim.getCalendar();
		
        cal.add(Calendar.DAY_OF_MONTH, 90);
	    String afterDate = sim.format(cal.getTime());
	    return afterDate;
	
	}
}
