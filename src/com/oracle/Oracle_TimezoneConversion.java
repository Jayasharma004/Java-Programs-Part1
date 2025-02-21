package com.oracle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Oracle_TimezoneConversion {


	public boolean areDatesEqual(String date1, String timeZone1, String date2, String timeZone2) throws ParseException {
		SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		format1.setTimeZone(TimeZone.getTimeZone(timeZone1));
		Date parsedDate1 = format1.parse(date1);
		long epochDate1 = parsedDate1.getTime();
		System.out.println("epochDate1 : "+epochDate1);
		System.out.println("parsed date1 : "+parsedDate1.toString());

		SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		format2.setTimeZone(TimeZone.getTimeZone(timeZone2));
		Date parsedDate2 = format2.parse(date2);
		long epochDate2 = parsedDate2.getTime();
		System.out.println("epochDate2 : "+epochDate2);
		System.out.println("parsed date2 : "+parsedDate2.toString());

		return epochDate1 == epochDate2;
	}


	public static void main(String[] args) throws ParseException {
		String date1 = "12/09/2022 02:47:00";
		String timeZone1 = "America/Puerto_Rico";

		String date2 = "12/09/2022 00:47:00";
		String timeZone2 = "America/Regina";
		boolean isEqual = new Oracle_TimezoneConversion().areDatesEqual(date1, timeZone1, date2, timeZone2);
		System.out.println("isEqual : " + isEqual);

	}
}
