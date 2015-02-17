package com.appiancorp.islamicdates;

import java.sql.Date;

import org.apache.log4j.Logger;

import com.appiancorp.dateconversion.HijriCalendar;
import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@IslamicDateFunctionsCategory
public class UmAlquraToGregorian {

	private static final Logger LOG = Logger
			.getLogger(UmAlquraToGregorian.class);

	@Function
	public Date convertummalquratogregorian(ServiceContext sc,
			@Parameter Long hday, @Parameter Long hmonth,
			@Parameter Long hyear) {
		HijriCalendar hijricalendar = new HijriCalendar();
		Date d = hijricalendar.getGregorianDateFromUmALQura(hyear.intValue(),hmonth.intValue(),hday.intValue());
		return d;
	}
	
	public Date convertummalquratogregorian( 
			  Long hday,   Long hmonth,
			  Long hyear) {
		HijriCalendar hijricalendar = new HijriCalendar();
		Date d = hijricalendar.getGregorianDateFromUmALQura(hyear.intValue(),hmonth.intValue(),hday.intValue());
		return d;
	}
	

}
