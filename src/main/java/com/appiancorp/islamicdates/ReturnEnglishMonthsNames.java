package com.appiancorp.islamicdates;

import org.apache.log4j.Logger;

import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.Function;

@IslamicDateFunctionsCategory
public class ReturnEnglishMonthsNames {

	public final static String[] MONTHS_NAMES = {  "Muharram", "Safar",
		"Rabiul Awwal", "Rabiul Akhir", "Jumadal Ula", "Jumadal Akhira",
		"Rajab", "Shaaban", "Ramadhan", "Shawwal", "Dhulqaada", "Dhulhijja" };
	
	private static final Logger LOG = Logger
			.getLogger(ReturnEnglishMonthsNames.class);

	@Function
	public String[] ReturnEnglishMonthsNames(ServiceContext sc) {
		return MONTHS_NAMES;
	}

}
