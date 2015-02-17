package com.appiancorp.islamicdates;

import java.sql.Date;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.appiancorp.dateconversion.HijriCalendar;
import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;

@IslamicDateFunctionsCategory
public class AppianDateTOUmAlQuraConversionWithEnglishName {

	private static final Logger LOG = Logger
			.getLogger(AppianDateTOUmAlQuraConversionWithEnglishName.class);

	@Function
	public String AppianDateTOUmAlQuraConversionWithEnglishName(
			ServiceContext sc, @Parameter Date GregorianDate) {
		 Calendar cal = Calendar.getInstance(sc.getLocale());
		 cal.set(GregorianDate.getYear()+1900, GregorianDate.getMonth(), GregorianDate.getDate());
		 HijriCalendar HijriDate = new HijriCalendar();
         String HijriString = HijriCalendar.getHijriDate_EnglishMonthName(cal);
         return HijriString;
	}
	
	
	

}
