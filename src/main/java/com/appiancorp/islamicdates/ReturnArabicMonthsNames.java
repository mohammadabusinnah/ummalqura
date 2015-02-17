package com.appiancorp.islamicdates;

import org.apache.log4j.Logger;

import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.Function;
import org.apache.commons.lang.StringEscapeUtils;

@IslamicDateFunctionsCategory
public class ReturnArabicMonthsNames {

	public final static String[] MONTHS_ARABIC_NAMES = {   "محرم", "س�?ر",
		"ربيع الأول", "ربيع الثاني", "جمادة الأول", "جمادة الثاني", "رجب",
		"شعبان", "رمضان", "شوال", "ذو القعدة", "ذو الحجة" };
	
	private static final Logger LOG = Logger
			.getLogger(ReturnArabicMonthsNames.class);

	@Function
	public String[] returnarabicislamicmonths(ServiceContext sc) {
		
		return formatArabicStringArray(MONTHS_ARABIC_NAMES);
	}
	
	private String[] formatArabicStringArray(String array[])
	{
		for(int index=0;index<array.length;index++) array[index] = StringEscapeUtils.unescapeHtml(array[index]);
		return array;
	}

}
